package telas;

import conexao.ConexaoBanco;
import static funcoesCliente.FEditar.editar;
import static funcoesCliente.FPesquisar1.Pesquisar1;
import static funcoesCliente.FPesquisar2.Pesquisar2;
import java.util.logging.Level;
import static funcoesCliente.FDesabilitar.desabilitar;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.io.FileWriter;
import com.mysql.jdbc.Statement;
import static telas.Cliente.ftfCpf;

public class ConsultaCliente extends javax.swing.JFrame {

    public static String nome = "";
    public static String cpf = "";
    public static String email = "";
    public static String telefone = "";
    public static String nascimento = "";
    public static String cep = "";
    public static String uf = "";
    public static String cidade = "";
    public static String bairro = "";
    public static String rua = "";
    public static int numero = 0;
    public static String complemento = "";
    public static String cpf2 = "";
    public static int idCli = 0;

    public ConsultaCliente() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtNome = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbDesabilitar = new javax.swing.JButton();
        rbNome = new javax.swing.JRadioButton();
        rbCPF = new javax.swing.JRadioButton();
        ftfCPF = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResult = new javax.swing.JTable();
        btExportar = new javax.swing.JButton();
        lbResultClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        txtNome.setEditable(false);

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/magnifier.png"))); // NOI18N
        jbPesquisar.setToolTipText("Buscar");
        jbPesquisar.setBorder(null);
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_redo.png"))); // NOI18N
        jbVoltar.setToolTipText("Voltar");
        jbVoltar.setBorder(null);
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pencil.png"))); // NOI18N
        jbEditar.setToolTipText("Editar");
        jbEditar.setBorder(null);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbDesabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        jbDesabilitar.setToolTipText("Deletar");
        jbDesabilitar.setBorder(null);
        jbDesabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesabilitarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNome);
        rbNome.setText("Nome:");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCPF);
        rbCPF.setText("CPF:");
        rbCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCPFActionPerformed(evt);
            }
        });

        ftfCPF.setEditable(false);
        try {
            ftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tbResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbResultClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbResult);
        if (tbResult.getColumnModel().getColumnCount() > 0) {
            tbResult.getColumnModel().getColumn(1).setMinWidth(100);
            tbResult.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbResult.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        btExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_excel.png"))); // NOI18N
        btExportar.setToolTipText("Exportar");
        btExportar.setBorder(null);
        btExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarActionPerformed(evt);
            }
        });

        lbResultClientes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbNome)
                                    .addComponent(rbCPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbDesabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbCPF)
                        .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResultClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbDesabilitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        if (rbNome.isSelected()) {

            try {
                Pesquisar1(txtNome.getText());
                jbDesabilitar.setEnabled(true);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rbCPF.isSelected()) {
            try {
                Pesquisar2(ftfCPF.getText());
                jbDesabilitar.setEnabled(false);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbDesabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesabilitarActionPerformed
        try {
            desabilitar(cpf);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbDesabilitarActionPerformed

    private void tbResultClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbResultClicked
        int linha = tbResult.getSelectedRow();
        int coluna = tbResult.getSelectedColumn();
        cpf = (tbResult.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_tbResultClicked

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        this.dispose();
        try {
            ftfCpf.setText(cpf);
            editar(ftfCpf.getText());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        ftfCPF.setFocusable(false);
        txtNome.setFocusable(true);
        ftfCPF.setText("");

        txtNome.setEnabled(true);
        txtNome.setEditable(true);
        ftfCPF.setEnabled(false);
        jbDesabilitar.setEnabled(true);
    }//GEN-LAST:event_rbNomeActionPerformed

    private void rbCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCPFActionPerformed
        txtNome.setFocusable(false);
        ftfCPF.setFocusable(true);
        txtNome.setText("");

        ftfCPF.setEnabled(true);
        ftfCPF.setEditable(true);
        txtNome.setEnabled(false);
        jbDesabilitar.setEnabled(false);
        lbResultClientes.setText("");
    }//GEN-LAST:event_rbCPFActionPerformed

    private void btExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarActionPerformed

        if (rbNome.isSelected()) {
            String pathArquivo = "";
            String tipoArquivo = "";

            try {
                ConexaoBanco con = new ConexaoBanco();
                con.getConnection();

                String txtSQL = "select * from Cliente where nome like '%" + txtNome.getText() + "%'";

                try (Statement stmt = (Statement) ConexaoBanco.connection.createStatement()) {

                    ResultSet result = (ResultSet) stmt.executeQuery(txtSQL);
                    pathArquivo = "C:\\Users\\u6076275\\Desktop\\Nova pasta\\Clientes.csv";

                    FileWriter arqCSV = new FileWriter(pathArquivo);

                    arqCSV.append("Nome");
                    arqCSV.append(';');
                    arqCSV.append("CPF");
                    arqCSV.append(';');
                    arqCSV.append("E-mail");
                    arqCSV.append(';');
                    arqCSV.append("Telefone");
                    arqCSV.append(';');
                    arqCSV.append("Nascimento");
                    arqCSV.append(';');
                    arqCSV.append("CEP");
                    arqCSV.append(';');
                    arqCSV.append("UF");
                    arqCSV.append(';');
                    arqCSV.append("Cidade");
                    arqCSV.append(';');
                    arqCSV.append("Bairro");
                    arqCSV.append(';');
                    arqCSV.append("Rua");
                    arqCSV.append(';');
                    arqCSV.append("Numero");
                    arqCSV.append(';');
                    arqCSV.append("Complemento");
                    arqCSV.append(';');
                    arqCSV.append("Habilitado");
                    arqCSV.append(';');
                    arqCSV.append("Data_Criacao");
                    arqCSV.append(';');
                    arqCSV.append("Data_Alteracao");
                    arqCSV.append(';');
                    arqCSV.append("Data_UltimoPedido");
                    arqCSV.append('\n');
                        
                    
                    while (result.next()) {

                        arqCSV.append(String.valueOf(result.getString("Nome")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("CPF")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Email")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Telefone")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Nascimento")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("CEP")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("UF")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Cidade")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Bairro")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Rua")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Numero")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Complemento")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Habilitado")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Data_Criacao")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Data_Alteracao")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Data_UltimoPedido")));
                        arqCSV.append('\n');
                        arqCSV.flush();
                    }
                    arqCSV.close();
                    JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso em : " + pathArquivo +" !");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btExportarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCliente().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExportar;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JFormattedTextField ftfCPF;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDesabilitar;
    private javax.swing.JButton jbEditar;
    public static javax.swing.JButton jbPesquisar;
    public static javax.swing.JButton jbVoltar;
    public static javax.swing.JLabel lbResultClientes;
    private javax.swing.JRadioButton rbCPF;
    private javax.swing.JRadioButton rbNome;
    public static javax.swing.JTable tbResult;
    public static javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
