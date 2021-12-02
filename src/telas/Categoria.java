package telas;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import static funcoesCategoria.ValidaCategoria.Validacao;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import static telas.Menu.idUser;
import static funcoesCategoria.FBuscaQTD.BuscaQTD;
import static funcoesCategoria.FConsulta.Consulta;

public class Categoria extends javax.swing.JFrame {

    public static int opcao = 0;
    public static List<String> lstCategoria = new ArrayList<String>();

    public Categoria() throws SQLException {
        initComponents();
        //ListCat();
        bloquear();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btProcurar = new javax.swing.JToggleButton();
        lbCategoria = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCats = new javax.swing.JTable();
        txtProcurar = new javax.swing.JTextField();
        btExcluir = new javax.swing.JToggleButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JToggleButton();
        btNovo = new javax.swing.JToggleButton();
        txtDesc = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        userCat = new javax.swing.JLabel();
        btAlterarSituacao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdTodos = new javax.swing.JRadioButton();
        rdHabilitados = new javax.swing.JRadioButton();
        rdDesabilitados = new javax.swing.JRadioButton();
        lbResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(380, 415));
        setResizable(false);

        btProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/magnifier.png"))); // NOI18N
        btProcurar.setToolTipText("Buscar");
        btProcurar.setBorder(null);
        btProcurar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btProcurarMouseMoved(evt);
            }
        });
        btProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarActionPerformed(evt);
            }
        });

        lbCategoria.setText("Categorias:");

        tbCats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ));
        tbCats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCatsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCats);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        btExcluir.setToolTipText("Deletar");
        btExcluir.setBorder(null);
        btExcluir.setPreferredSize(new java.awt.Dimension(75, 23));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/disk.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.setBorder(null);
        btSalvar.setPreferredSize(new java.awt.Dimension(75, 23));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pencil.png"))); // NOI18N
        btEditar.setToolTipText("Editar");
        btEditar.setBorder(null);
        btEditar.setPreferredSize(new java.awt.Dimension(75, 23));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page.png"))); // NOI18N
        btNovo.setToolTipText("Novo");
        btNovo.setBorder(null);
        btNovo.setPreferredSize(new java.awt.Dimension(75, 23));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        lbID.setText("Código ID:");
        lbID.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbIDAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbDesc.setText("Nome:");

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_redo.png"))); // NOI18N
        btVoltar.setToolTipText("Menu");
        btVoltar.setBorder(null);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_excel.png"))); // NOI18N
        jButton1.setToolTipText("Exportar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btAlterarSituacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_refresh.png"))); // NOI18N
        btAlterarSituacao.setToolTipText("Alterar situação");
        btAlterarSituacao.setBorder(null);
        btAlterarSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarSituacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdTodos);
        rdTodos.setText("Todos");

        buttonGroup1.add(rdHabilitados);
        rdHabilitados.setSelected(true);
        rdHabilitados.setText("Habilitados");

        buttonGroup1.add(rdDesabilitados);
        rdDesabilitados.setText("Desabilitados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdHabilitados)
                    .addComponent(rdDesabilitados)
                    .addComponent(rdTodos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdHabilitados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdDesabilitados)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lbResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterarSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userCat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCategoria)
                                    .addComponent(lbDesc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDesc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCategoria)
                                .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDesc))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userCat, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbID)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(btNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addComponent(btAlterarSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarActionPerformed
        bloquear();
        try {
            Consulta(txtProcurar.getText());
        } catch (Exception ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btProcurarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        desbloquear();
        opcao = 1;
        txtDesc.setText("");
        lbID.setText("");
        
        DefaultTableModel model = (DefaultTableModel) tbCats.getModel();
        model.setNumRows(0);

    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        desbloquear();
        opcao = 2;
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            excluir(txtDesc.getText());
            Consulta(txtProcurar.getText());
            
            JOptionPane.showMessageDialog(rootPane, "Categoria Excluida.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Categoria não exculida. A mesma está sendo usada em um produto...");
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtDesc.setText("");
        lbID.setText("");
    }//GEN-LAST:event_btExcluirActionPerformed

    //BT_EXCLUIR
    private void excluir(String desc) throws SQLException, Exception {

        String txtSQL = "";

        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "delete from categoria where Nome = '" + desc + "' ;";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();

        int result = banco.executeUpdate(txtSQL);

        txtSQL = "";
    }

    private void tbCatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCatsMouseClicked
        int linha = tbCats.getSelectedRow(); // retorna a linha selecionada pelo usuario
        lbID.setText(tbCats.getValueAt(linha, 0).toString());
        txtDesc.setText(tbCats.getValueAt(linha, 1).toString());

    }//GEN-LAST:event_tbCatsMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            if("".equals(txtDesc.getText())){
                JOptionPane.showMessageDialog(rootPane, "Preencha o nome da categoria !");
            }else if (opcao == 1) {
                newsalve(txtDesc.getText());
                Consulta(txtProcurar.getText());
                txtDesc.setText("");
                opcao = 0;
            } else {
                if (opcao == 2) {
                    editsalve(txtDesc.getText(), Integer.parseInt(lbID.getText()));
                    opcao = 0;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Categoria já cadastrada !");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void lbIDAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbIDAncestorAdded
        lbID.setVisible(false);
    }//GEN-LAST:event_lbIDAncestorAdded

    private void btProcurarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProcurarMouseMoved
        btProcurar.setToolTipText("Clique com o campo de texto vazio para listar todos os registros.");
    }//GEN-LAST:event_btProcurarMouseMoved

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();

        telas.Menu menu = new telas.Menu();
        idUser.setToolTipText(userCat.getToolTipText());
        menu.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pathArquivo = "";
        String tipoArquivo = "";

        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "select * from categoria where nome like '%" + txtProcurar.getText() + "%'";

            try (
                    //PreparedStatement stmt = banco.Conexao.conexao.prepareStatement(txtSQL);
                    Statement stmt = (Statement) ConexaoBanco.connection.createStatement()) {

                ResultSet result = (ResultSet) stmt.executeQuery(txtSQL);
                pathArquivo = "C:\\Documentos\\Categoria.csv";

                FileWriter arqCSV = new FileWriter(pathArquivo);

                //Descarregar o resultado da consulta dentro do arquivo
                while (result.next()) {

                    //Escrever no arquivo CSV considerando o tipo de geração
                    //Tipo de arquivo (1=Variados /// 2=Acordos)                            
                    arqCSV.append(String.valueOf(result.getString("idCategoria")));
                    arqCSV.append(';');
                    arqCSV.append(String.valueOf(result.getString("Nome")));

                    arqCSV.append('\n');

                    arqCSV.flush();
                }

                arqCSV.close();

                JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso em: " + pathArquivo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAlterarSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarSituacaoActionPerformed
        try {
            telas.Aviso aviso = new telas.Aviso();
            aviso.setVisible(true);
                       
            BuscaQTD();
            Consulta(txtProcurar.getText());
        } catch (Exception ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAlterarSituacaoActionPerformed

    //BT_NOVO
    private void newsalve(String desc) throws SQLException, Exception {

        if (Validacao(txtDesc.getText()) > 0) {
            JOptionPane.showMessageDialog(rootPane, "Código já existente");
        } else {

            String txtSQL = "";

            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            txtSQL = "insert into categoria(Nome, Habilitado)"
                    + "values('" + desc + "', 100)";

            JOptionPane.showMessageDialog(rootPane, "Categoria Inserida.");
            Statement banco = (Statement) ConexaoBanco.connection.createStatement();

            int result = banco.executeUpdate(txtSQL);

            txtSQL = "";
        }
    }

    //BT_EDITAR
    private void editsalve(String desc, int id) throws SQLException, Exception {

        String txtSQL = "";

        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "update categoria set Nome = '" + desc + "' where idCategoria = '" + id + "'";

        JOptionPane.showMessageDialog(rootPane, "Edição Confirmada.");
        Statement banco = (Statement) ConexaoBanco.connection.createStatement();

        int result = banco.executeUpdate(txtSQL);

        txtSQL = "";
    }

    //BLOQUEAR TXT
    public void bloquear() {
        txtDesc.setEditable(false);
        //txtID.setEditable(false);
    }

    //DESBLOQUEAR TXT
    public void desbloquear() {
        txtDesc.setEditable(true);
        //txtID.setEditable(true);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Categoria().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarSituacao;
    private javax.swing.JToggleButton btEditar;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JToggleButton btNovo;
    private javax.swing.JToggleButton btProcurar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbDesc;
    public static javax.swing.JLabel lbID;
    public static javax.swing.JLabel lbResult;
    public static javax.swing.JRadioButton rdDesabilitados;
    public static javax.swing.JRadioButton rdHabilitados;
    public static javax.swing.JRadioButton rdTodos;
    public static javax.swing.JTable tbCats;
    public static javax.swing.JTextField txtDesc;
    public static javax.swing.JTextField txtProcurar;
    public static javax.swing.JLabel userCat;
    // End of variables declaration//GEN-END:variables
}
