package funcoesProduto;

import com.mysql.jdbc.Statement;
import conexao.ConexaoBanco;
import java.sql.ResultSet;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class FExportarProd {

    public static void Exportar(String TXTpesquisa, int tipo, int grupo) {

        String pathArquivo = "";
        String tipoArquivo = "";

        try {
            String txtSQL = "";
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            txtSQL = "call sp_4 ('" + TXTpesquisa + "', " + tipo + ", " + grupo + " )";

            try (
                    //PreparedStatement stmt = banco.Conexao.conexao.prepareStatement(txtSQL);
                    Statement stmt = (Statement) ConexaoBanco.connection.createStatement()) {

                ResultSet result = (ResultSet) stmt.executeQuery(txtSQL);
                pathArquivo = "C:\\Users\\u6076275\\Desktop\\Nova pasta\\Produtos.csv";

                FileWriter arqCSV = new FileWriter(pathArquivo);

                arqCSV.append("Codigo");
                arqCSV.append(';');
                arqCSV.append("Nome");
                arqCSV.append(';');
                arqCSV.append("Quantidade");
                arqCSV.append(';');
                arqCSV.append("Nome");
                arqCSV.append(';');
                arqCSV.append("Habilitado");
                arqCSV.append('\n');

                //Descarregar o resultado da consulta dentro do arquivo
                while (result.next()) {

                    //Escrever no arquivo CSV considerando o tipo de geração
                    //Tipo de arquivo (1=Variados /// 2=Acordos)                            
                    arqCSV.append(String.valueOf(result.getString("Codigo")));
                    arqCSV.append(';');
                    arqCSV.append(String.valueOf(result.getString("p.Nome")));
                    arqCSV.append(';');
                    arqCSV.append(String.valueOf(result.getString("Quantidade")));
                    arqCSV.append(';');
                    arqCSV.append(String.valueOf(result.getString("c.Nome")));
                    arqCSV.append(';');
                    if (result.getInt("p.Habilitado") == 999) {
                        arqCSV.append("Não");
                    } else {
                        arqCSV.append("Sim");
                    }

                    arqCSV.append('\n');

                    arqCSV.flush();
                }

                arqCSV.close();

                JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso em: " + pathArquivo + " !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
