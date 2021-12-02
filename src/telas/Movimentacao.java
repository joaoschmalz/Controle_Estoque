package telas;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static telas.Movimentacao.userReports;

public class Movimentacao extends javax.swing.JFrame {

    public String idProduto = "";
    public String codigoProduto = "";
    public String nomeProduto = "";
    public String nomeCliente = "";
    public String idCliente = "";
    public String codigo_Exclusao_Linha = "";
    public String idUsuario = "";
    public int quantidadeMovimentada = 0;
    public int quantidadeAnterior = 0;
    public int quantidadeAtual = 0;

    public Movimentacao() {
        initComponents(); // chamando o metodo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInserir = new javax.swing.JTable();
        lbQuantidade = new javax.swing.JLabel();
        lbAdicionar = new javax.swing.JLabel();
        txtEntradaSaidaProduto = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdEntrada = new javax.swing.JRadioButton();
        rdSaida = new javax.swing.JRadioButton();
        btSalvar = new javax.swing.JButton();
        btExcluirRegistro = new javax.swing.JButton();
        comboProduto = new javax.swing.JComboBox<>();
        comboClientes = new javax.swing.JComboBox<>();
        btVoltar = new javax.swing.JButton();
        userReports = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        tbInserir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÓDIGO", "NOME PRODUTO", "QUANTIDADE MOVIMENTADA", "QUANTIDADE ATUAL", "CLIENTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInserirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInserir);

        lbQuantidade.setText("Quantidade Atual:");

        lbAdicionar.setText("Quantidade entrada:");

        txtEntradaSaidaProduto.setEditable(false);

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_get.png"))); // NOI18N
        btLimpar.setToolTipText("Limpar");
        btLimpar.setBorder(null);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btInserir.setToolTipText("Adicionar registro");
        btInserir.setBorder(null);
        btInserir.setEnabled(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdEntrada);
        rdEntrada.setText("Entrada de Estoque");
        rdEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdEntradaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdSaida);
        rdSaida.setText("Saída de Estoque");
        rdSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdEntrada)
                    .addComponent(rdSaida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rdEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(rdSaida))
        );

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/disk.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.setBorder(null);
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluirRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        btExcluirRegistro.setToolTipText("Deletar registro");
        btExcluirRegistro.setEnabled(false);
        btExcluirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirRegistroActionPerformed(evt);
            }
        });

        comboProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o produto" }));
        comboProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoItemStateChanged(evt);
            }
        });

        comboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o cliente" }));
        comboClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboClientesItemStateChanged(evt);
            }
        });

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_redo.png"))); // NOI18N
        btVoltar.setToolTipText("Voltar");
        btVoltar.setBorder(null);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEntradaSaidaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluirRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(lbQuantidade))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userReports, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAdicionar)
                            .addComponent(txtEntradaSaidaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btExcluirRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdEntradaActionPerformed

        if (rdEntrada.isSelected()) {
            btInserir.setEnabled(true);
            btExcluirRegistro.setEnabled(true);
            comboClientes.setEnabled(false);
            comboClientes.setSelectedIndex(0);
            comboProduto.setSelectedIndex(0);
            lbAdicionar.setText("Quantidade de entrada: ");
            lbQuantidade.setText("Quantidade Atual: ");
            txtEntradaSaidaProduto.setText("");
            txtEntradaSaidaProduto.setEditable(true);
            DeletarTempSaida();
            DeletarTempEntrada();
        }
    }//GEN-LAST:event_rdEntradaActionPerformed

    private void rdSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSaidaActionPerformed

        if (rdSaida.isSelected()) {
            btInserir.setEnabled(true);
            btExcluirRegistro.setEnabled(true);
            comboClientes.setEnabled(true);
            comboClientes.setSelectedIndex(0);
            comboProduto.setSelectedIndex(0);
            lbAdicionar.setText("Quantidade de saída:");
            lbQuantidade.setText("Quantidade Atual: ");
            txtEntradaSaidaProduto.setText("");
            txtEntradaSaidaProduto.setEditable(true);
            DeletarTempEntrada();
            DeletarTempSaida();
        }
    }//GEN-LAST:event_rdSaidaActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        quantidadeMovimentada = Integer.valueOf(txtEntradaSaidaProduto.getText());
        if (rdEntrada.isSelected()) {
            quantidadeAtual = quantidadeAnterior + quantidadeMovimentada;
            InserirEntrada();
        } else {
            if (quantidadeAnterior < quantidadeMovimentada) {
                JOptionPane.showMessageDialog(rootPane, "Quantidade de saída é maior que a quantidade atual em estoque!");
                txtEntradaSaidaProduto.setText("");
            } else {
                quantidadeAtual = quantidadeAnterior - quantidadeMovimentada;
                InserirSaida();
            }
        }
        btSalvar.setEnabled(true);
        lbQuantidade.setText("Quantidade Atual: ");
        txtEntradaSaidaProduto.setText("");

    }//GEN-LAST:event_btInserirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        if (rdEntrada.isSelected()) {
            EntradaProduto();
            BuscaTempEntrada();
            DeletarTempEntrada();
        }
        if (rdSaida.isSelected()) {
            SaidaProduto();
            BucaTempSaida();
            DeletarTempSaida();
        }

        lbQuantidade.setText("Quantidade Atual: ");
        comboProduto.setSelectedIndex(0);
        txtEntradaSaidaProduto.setText("");

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRegistroActionPerformed
        // TODO add your handling code here:
        if (rdEntrada.isSelected()) {
            ExluirLinhaEntrada(codigo_Exclusao_Linha);
        } else {
            ExcluirLinhaSaida(codigo_Exclusao_Linha);
        }
        btSalvar.setEnabled(true);

    }//GEN-LAST:event_btExcluirRegistroActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        comboProduto.setSelectedIndex(0);
        comboClientes.setSelectedIndex(0);
        txtEntradaSaidaProduto.setText("");
        DeletarTempSaida();
        DeletarTempEntrada();

    }//GEN-LAST:event_btLimparActionPerformed

    private void tbInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInserirMouseClicked
        // TODO add your handling code here:
        int linha = tbInserir.getSelectedRow();
        int coluna = tbInserir.getSelectedColumn();
        codigo_Exclusao_Linha = (tbInserir.getValueAt(linha, 0).toString());
    }//GEN-LAST:event_tbInserirMouseClicked

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void comboProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoItemStateChanged
        BuscaProduto((String) comboProduto.getSelectedItem());
    }//GEN-LAST:event_comboProdutoItemStateChanged

    private void comboClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboClientesItemStateChanged
        BuscaCliente((String) comboClientes.getSelectedItem());
    }//GEN-LAST:event_comboClientesItemStateChanged

    public void AtualizaEstoque(int idProduto, int quantidadeAtual) {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "UPDATE Produto SET Quantidade = " + quantidadeAtual + " WHERE idProduto = " + idProduto + ";";

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            boolean inserir = banco.execute(txtSQL);
        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BucaTempSaida() {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String buscar_dados = "SELECT  idProduto, quantidadeAtual FROM Temporaria_Saida;";

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            ResultSet pesquisar = banco.executeQuery(buscar_dados);

            while (pesquisar.next()) {
                AtualizaEstoque(pesquisar.getInt("idProduto"), pesquisar.getInt("quantidadeAtual"));
            }

            JOptionPane.showMessageDialog(null, "Sucesso, tudos os dados atualizados");

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BuscaCliente(String nome) {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "SELECT * FROM Cliente WHERE nome = '" + nome + "';";

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            ResultSet result = banco.executeQuery(txtSQL);
            while (result.next()) {
                idCliente = result.getString("idCliente");
                nomeCliente = result.getString("Nome");
            }

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void BuscaProduto(String Item) {

        try {
            String txtSQL = "";
            ConexaoBanco con;
            con = new ConexaoBanco();

            con.getConnection();

            txtSQL = "SELECT * FROM produto WHERE nome = '" + Item + "';";

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            ResultSet result = banco.executeQuery(txtSQL);

            while (result.next()) {
                lbQuantidade.setText("Quatidade atual: " + result.getString("Quantidade"));
                idProduto = result.getString("idProduto");
                codigoProduto = result.getString("Codigo");
                nomeProduto = result.getString("Nome");
                quantidadeAnterior = result.getInt("Quantidade");
            }
        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BuscaTempEntrada() {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "SELECT  idProduto, quantidadeAtual FROM Temporaria_Entrada;";

            Statement stmt = (Statement) ConexaoBanco.connection.createStatement();
            ResultSet result = stmt.executeQuery(txtSQL);

            while (result.next()) {
                AtualizaEstoque(result.getInt("idProduto"), result.getInt("quantidadeAtual"));
            }

            JOptionPane.showMessageDialog(null, "Sucesso, todos os dados atualizados");

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeletarTempEntrada() {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "DELETE FROM temporaria_entrada;";

            Statement stmt = (Statement) ConexaoBanco.connection.createStatement();
            boolean inserir = stmt.execute(txtSQL);

            DefaultTableModel model = (DefaultTableModel) tbInserir.getModel();
            model.setNumRows(0);

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeletarTempSaida() {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "DELETE FROM temporaria_saida;";

            Statement stmt = (Statement) ConexaoBanco.connection.createStatement();
            boolean inserir = stmt.execute(txtSQL);

            DefaultTableModel model = (DefaultTableModel) tbInserir.getModel();
            model.setNumRows(0);

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EntradaProduto() {

        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQLSalvar = "INSERT INTO Entrada (idUsuario, idProduto, Data, Quantidade)"
                    + "SELECT 1, idProduto, Data, quantidadeAtual FROM Temporaria_Entrada;";

            String txtSQLinserir_produtos = "INSERT INTO produto (Quantidade) SELECT quantidadeAtual FROM Entrada";

            Statement stmt = (Statement) ConexaoBanco.connection.createStatement();
            boolean inserir = stmt.execute(txtSQLSalvar);

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ExcluirLinhaSaida(String codigo) {

        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "DELETE FROM Temporaria_Saida WHERE idTemporaria = '" + codigo_Exclusao_Linha + "' ;";
            String txtSQLpesquisar_dados = "SELECT * FROM Temporaria_Saida;";

            JOptionPane.showMessageDialog(null, "Registro excluído.");

            Statement stmt = (Statement) ConexaoBanco.connection.createStatement();
            int result = stmt.executeUpdate(txtSQL);
            ResultSet resultAtualizaTable = stmt.executeQuery(txtSQLpesquisar_dados);
            DefaultTableModel model = (DefaultTableModel) tbInserir.getModel();
            model.setNumRows(0);

            while (resultAtualizaTable.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultAtualizaTable.getString("idTemporaria"),
                    resultAtualizaTable.getString("codigoProduto"),
                    resultAtualizaTable.getString("nomeProduto"),
                    resultAtualizaTable.getString("quantidadeMovimentada"),
                    resultAtualizaTable.getString("quantidadeAtual"),});
            }
        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ExluirLinhaEntrada(String codigo) {

        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "DELETE FROM Temporaria_Entrada WHERE idTemporaria = '" + codigo_Exclusao_Linha + "' ;";
            String txtSQL_Pesquisar_Dados = "SELECT * FROM Temporaria_Entrada;";

            JOptionPane.showMessageDialog(null, "Registro excluído.");

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            int result = banco.executeUpdate(txtSQL);
            ResultSet resultAtualizaTable = banco.executeQuery(txtSQL_Pesquisar_Dados);
            DefaultTableModel model = (DefaultTableModel) tbInserir.getModel();
            model.setNumRows(0);

            while (resultAtualizaTable.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultAtualizaTable.getString("idTemporaria"),
                    resultAtualizaTable.getString("codigoProduto"),
                    resultAtualizaTable.getString("nomeProduto"),
                    resultAtualizaTable.getString("quantidadeMovimentada"),
                    resultAtualizaTable.getString("quantidadeAtual"),});
            }
        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void InserirEntrada() {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL_Inserir_Dados = "insert into Temporaria_Entrada (idUsuario, idProduto, codigoProduto, nomeProduto, quantidadeAnterior, Data, quantidadeMovimentada, quantidadeAtual)"
                    + "       values (" + userReports.getToolTipText() + "," + idProduto + ", '" + codigoProduto + "', '" + nomeProduto + "', " + quantidadeAnterior + ", CURRENT_TIMESTAMP, " + quantidadeMovimentada + ", " + quantidadeAtual + ");";

            String txtSQL_Pesquisar_Dados = "SELECT * FROM Temporaria_Entrada;";

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            boolean resultInserir = banco.execute(txtSQL_Inserir_Dados);
            ResultSet resultAtualizar = banco.executeQuery(txtSQL_Pesquisar_Dados);

            DefaultTableModel model = (DefaultTableModel) tbInserir.getModel();
            model.setNumRows(0);

            while (resultAtualizar.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultAtualizar.getString("idTemporaria"),
                    resultAtualizar.getString("codigoProduto"),
                    resultAtualizar.getString("nomeProduto"),
                    resultAtualizar.getString("quantidadeMovimentada"),
                    resultAtualizar.getString("quantidadeAtual"),});
                quantidadeAnterior = resultAtualizar.getInt("quantidadeAtual");
                quantidadeAtual = 0;
                idProduto = resultAtualizar.getString("idProduto");
            }

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InserirSaida() {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txt_Inserir_Dados = "INSERT INTO Temporaria_Saida (idCliente,idProduto,idUsuario,codigoProduto,nomeProduto,nomeCliente,quantidadeAnterior,Data,quantidadeMovimentada,quantidadeAtual) "
            + "values ("+ idCliente +","+idProduto+","+userReports.getToolTipText()+",'"+codigoProduto+"','"+nomeProduto+"','"+((String) comboClientes.getSelectedItem())+"',"+quantidadeAnterior+",CURRENT_TIMESTAMP,"+quantidadeMovimentada+","+quantidadeAtual+");";
            
            String txtSQL_Pesquisar_Dados = "SELECT * FROM Temporaria_Saida;";

            Statement stmt = (Statement) ConexaoBanco.connection.createStatement();
            boolean resultInserir = stmt.execute(txt_Inserir_Dados);
            ResultSet resultAtualizar = stmt.executeQuery(txtSQL_Pesquisar_Dados);

            DefaultTableModel model = (DefaultTableModel) tbInserir.getModel();
            model.setNumRows(0);

            while (resultAtualizar.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultAtualizar.getString("idTemporaria"),
                    resultAtualizar.getString("codigoProduto"),
                    resultAtualizar.getString("nomeProduto"),
                    resultAtualizar.getString("quantidadeMovimentada"),
                    resultAtualizar.getString("quantidadeAtual"),
                    resultAtualizar.getString("nomeCliente"),});
                quantidadeAnterior = resultAtualizar.getInt("quantidadeAtual");
                quantidadeAtual = 0;
            }

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SaidaProduto() {

        try {
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL_SalvarDados = "INSERT INTO Saida (idCliente, idProduto, idUsuario, Data, Quantidade)"
                    + "SELECT idCliente, idProduto," + userReports.getToolTipText() + ", Data, quantidadeAtual FROM Temporaria_Saida;";

            Statement stmt = (Statement) ConexaoBanco.connection.createStatement();
            boolean resultInserir = stmt.execute(txtSQL_SalvarDados);

        } catch (Exception ex) {
            Logger.getLogger(Movimentacao.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            java.util.logging.Logger.getLogger(Movimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimentacao().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btExcluirRegistro;
    public static javax.swing.JButton btInserir;
    public static javax.swing.JButton btLimpar;
    public static javax.swing.JButton btSalvar;
    public static javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> comboClientes;
    public static javax.swing.JComboBox<String> comboProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbAdicionar;
    public static javax.swing.JLabel lbQuantidade;
    public static javax.swing.JRadioButton rdEntrada;
    public static javax.swing.JRadioButton rdSaida;
    public static javax.swing.JTable tbInserir;
    public static javax.swing.JTextField txtEntradaSaidaProduto;
    public static javax.swing.JLabel userReports;
    // End of variables declaration//GEN-END:variables

}
