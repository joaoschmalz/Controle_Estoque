package telas;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import conexao.ConexaoBanco;
import static funcoesRelatorios.ConsultaEntrada.ConsultaEntrada;
import static funcoesRelatorios.ConsultaSaida.ConsultaSaida;
import static funcoesRelatorios.LimparTela.LimparTela;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import static telas.Menu.idUser;

public class Relatorios extends javax.swing.JFrame {

    public Relatorios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReports = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdEntrada = new javax.swing.JRadioButton();
        rdSaida = new javax.swing.JRadioButton();
        lbDataFim = new javax.swing.JLabel();
        lbDataIni = new javax.swing.JLabel();
        jDataIni = new javax.swing.JFormattedTextField();
        jDataFim = new javax.swing.JFormattedTextField();
        Exportar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        userReport = new javax.swing.JLabel();
        lbResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jTableReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Produto", "Quantidade", "Data", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableReports);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/magnifier.png"))); // NOI18N
        jButton1.setToolTipText("Buscar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdEntrada);
        rdEntrada.setText("Entrada");

        buttonGroup1.add(rdSaida);
        rdSaida.setText("Saída");

        lbDataFim.setText("Data Final:");

        lbDataIni.setText("Data Inicial:");

        try {
            jDataIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdEntrada)
                    .addComponent(rdSaida))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDataIni)
                    .addComponent(lbDataFim))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDataIni)
                            .addComponent(rdEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataFim)
                    .addComponent(jDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_excel.png"))); // NOI18N
        Exportar.setToolTipText("Exportar");
        Exportar.setBorder(null);
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_redo.png"))); // NOI18N
        jButton2.setToolTipText("Voltar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_get.png"))); // NOI18N
        jButton3.setToolTipText("Limpar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(userReport, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(userReport, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (rdEntrada.isSelected()) {
            try {
                ConsultaEntrada(jDataIni.getText());
            } catch (Exception ex) {
                //Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(rdSaida.isSelected()){
            try {
                ConsultaSaida(jDataIni.getText());               
            } catch (Exception ex) {
                //Logger.getLogger(ConsultaProd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        
        telas.Menu menu = new telas.Menu();
        menu.setVisible(true);
        idUser.setToolTipText(userReport.getToolTipText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LimparTela();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        
        if(rdEntrada.isSelected()){
            
        String pathArquivo = "";
            String tipoArquivo = "";

            try {
                ConexaoBanco con = new ConexaoBanco();
                con.getConnection();

                String txtSQL = "select * from view_relatorio_entrada";

                try (Statement stmt = (Statement) ConexaoBanco.connection.createStatement()) {

                    ResultSet result = (ResultSet) stmt.executeQuery(txtSQL);
                    pathArquivo = "C:\\Users\\u6076275\\Desktop\\Nova pasta\\RelatorioEntrada.csv";

                    FileWriter arqCSV = new FileWriter(pathArquivo);
                    
                    arqCSV.append("Usuario");
                        arqCSV.append(';');
                        arqCSV.append("Produto");
                        arqCSV.append(';');
                        arqCSV.append("Quantidade");
                        arqCSV.append(';');
                        arqCSV.append("Data");
                        arqCSV.append(';');
                        arqCSV.append("Cliente");
                        arqCSV.append('\n');
                    

                    while (result.next()) {

                        arqCSV.append(String.valueOf(result.getString("Nome")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Produto")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Quantidade")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Data")));
                        arqCSV.append('\n');
                        arqCSV.flush();
                    }
                    arqCSV.close();
                    JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso em: " + pathArquivo+" !");
                }
            } catch (Exception e) {
                Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, e);

                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        if(rdSaida.isSelected()){
            
        String pathArquivo = "";
            String tipoArquivo = "";

            try {
                ConexaoBanco con = new ConexaoBanco();
                con.getConnection();

                String txtSQL = "select * from view_relatorio_saida";

                try (Statement stmt = (Statement) ConexaoBanco.connection.createStatement()) {

                    ResultSet result = (ResultSet) stmt.executeQuery(txtSQL);
                    pathArquivo = "C:\\Users\\u6076275\\Desktop\\Nova pasta\\RelatorioSaida.csv";

                    FileWriter arqCSV = new FileWriter(pathArquivo);
                    
                    arqCSV.append("Usuario");
                    arqCSV.append(';');
                    arqCSV.append("Produto");
                    arqCSV.append(';');
                    arqCSV.append("Quantidade");
                    arqCSV.append(';');
                    arqCSV.append("Data");
                    arqCSV.append(';');
                    arqCSV.append("Cliente");
                    arqCSV.append('\n');
                    

                    while (result.next()) {

                        arqCSV.append(String.valueOf(result.getString("Nome")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Produto")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Quantidade")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Data")));
                        arqCSV.append(';');
                        arqCSV.append(String.valueOf(result.getString("Cliente")));
                        arqCSV.append('\n');
                        arqCSV.flush();
                    }
                    arqCSV.close();
                    JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso em: " + pathArquivo+ " !");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_ExportarActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exportar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JFormattedTextField jDataFim;
    public static javax.swing.JFormattedTextField jDataIni;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableReports;
    private javax.swing.JLabel lbDataFim;
    private javax.swing.JLabel lbDataIni;
    public static javax.swing.JLabel lbResult;
    private javax.swing.JRadioButton rdEntrada;
    private javax.swing.JRadioButton rdSaida;
    public static javax.swing.JLabel userReport;
    // End of variables declaration//GEN-END:variables

}
