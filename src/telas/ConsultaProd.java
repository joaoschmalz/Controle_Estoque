package telas;


import funcoesProduto.FEditarProd;
import static funcoesProduto.FPesquisaCodigo.PesquisaCodigo;
import static funcoesProduto.FPesquisaNome.PesquisaNome;
import static funcoesProduto.FExportarProd.Exportar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import static telas.ConsultaCliente.nome;

public class ConsultaProd extends javax.swing.JFrame {

    public ConsultaProd() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProd = new javax.swing.JTable();
        BTvoltar = new javax.swing.JToggleButton();
        TXTpesquisa = new javax.swing.JTextField();
        BTpesquisar = new javax.swing.JButton();
        cbOpcoes = new javax.swing.JComboBox<>();
        btExportar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdDesabilitados = new javax.swing.JRadioButton();
        rdHabilitados = new javax.swing.JRadioButton();
        rdTodos = new javax.swing.JRadioButton();
        lbResultConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO", "QUANTIDADE", "CATEGORIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProd);

        BTvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_redo.png"))); // NOI18N
        BTvoltar.setBorder(null);
        BTvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTvoltarActionPerformed(evt);
            }
        });

        BTpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/magnifier.png"))); // NOI18N
        BTpesquisar.setBorder(null);
        BTpesquisar.setBorderPainted(false);
        BTpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTpesquisarActionPerformed(evt);
            }
        });

        cbOpcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome do Produto", "Código", "Categoria" }));
        cbOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcoesActionPerformed(evt);
            }
        });

        btExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_excel.png"))); // NOI18N
        btExportar.setBorder(null);
        btExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarActionPerformed(evt);
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

        buttonGroup1.add(rdDesabilitados);
        rdDesabilitados.setText("Desabilitados");

        buttonGroup1.add(rdHabilitados);
        rdHabilitados.setSelected(true);
        rdHabilitados.setText("Habilitados");

        buttonGroup1.add(rdTodos);
        rdTodos.setText("Todos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rdTodos)
                .addGap(10, 10, 10)
                .addComponent(rdHabilitados)
                .addGap(10, 10, 10)
                .addComponent(rdDesabilitados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdHabilitados)
                    .addComponent(rdDesabilitados)
                    .addComponent(rdTodos)))
        );

        lbResultConsulta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TXTpesquisa))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(179, 179, 179)
                            .addComponent(BTvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbResultConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BTvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResultConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTvoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTvoltarActionPerformed

    private void BTpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTpesquisarActionPerformed

        if (cbOpcoes.getSelectedIndex() == 0 && rdTodos.isSelected()) {
            int grupo = 0;
            try {
                PesquisaNome(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (cbOpcoes.getSelectedIndex() == 0 && rdHabilitados.isSelected()) {
            int grupo = 1;
            try {
                PesquisaNome(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (cbOpcoes.getSelectedIndex() == 0 && rdDesabilitados.isSelected()) {
            int grupo = 2;
            try {
                PesquisaNome(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (cbOpcoes.getSelectedIndex() == 1 && rdTodos.isSelected()) {
            int grupo = 0;
            try {
                PesquisaCodigo(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (cbOpcoes.getSelectedIndex() == 1 && rdHabilitados.isSelected()) {
            int grupo = 1;
            try {
                PesquisaCodigo(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (cbOpcoes.getSelectedIndex() == 1 && rdDesabilitados.isSelected()) {
            int grupo = 2;
            try {
                PesquisaCodigo(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (cbOpcoes.getSelectedIndex() == 2 && rdTodos.isSelected()) {
            int grupo = 0;
            try {
                PesquisaCodigo(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (cbOpcoes.getSelectedIndex() == 2 && rdHabilitados.isSelected()) {
            int grupo = 1;
            try {
                PesquisaCodigo(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (cbOpcoes.getSelectedIndex() == 2 && rdDesabilitados.isSelected()) {
            int grupo = 2;
            try {
                PesquisaCodigo(TXTpesquisa.getText(), grupo);
            } catch (Exception ex) {
                Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_BTpesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarActionPerformed
        if (rdTodos.isSelected()){
            int grupo = 0;
            Exportar(TXTpesquisa.getText(), cbOpcoes.getSelectedIndex(), grupo);
        }else if(rdHabilitados.isSelected()){
            int grupo = 1;
            Exportar(TXTpesquisa.getText(), cbOpcoes.getSelectedIndex(), grupo);
        }else{
            int grupo = 2;
            Exportar(TXTpesquisa.getText(), cbOpcoes.getSelectedIndex(), grupo);
        }
    }//GEN-LAST:event_btExportarActionPerformed

    private void cbOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcoesActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        try {
            this.dispose();
            FEditarProd.editar(nome);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void tableProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdMouseClicked
        int linha = tableProd.getSelectedRow();
        int coluna = tableProd.getSelectedColumn();
        nome = (tableProd.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_tableProdMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTpesquisar;
    private javax.swing.JToggleButton BTvoltar;
    public static javax.swing.JTextField TXTpesquisa;
    public javax.swing.JButton btExportar;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> cbOpcoes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    public static javax.swing.JLabel lbResultConsulta;
    private javax.swing.JRadioButton rdDesabilitados;
    private javax.swing.JRadioButton rdHabilitados;
    private javax.swing.JRadioButton rdTodos;
    public static javax.swing.JTable tableProd;
    // End of variables declaration//GEN-END:variables

    private void toExcel(JTable jTable1, int FILES_ONLY) {

        try {
            TableModel model = jTable1.getModel();
            String file = null;
            FileWriter excel = new FileWriter(file);

            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i) + "\t");
            }

            excel.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString() + "\t");
                }
                excel.write("\n");
            }

            excel.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
