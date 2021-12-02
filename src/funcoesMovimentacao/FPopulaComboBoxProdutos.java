package funcoesMovimentacao;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import static telas.Movimentacao.comboProduto;

public class FPopulaComboBoxProdutos {

    public static void PopulaComboBoxProdutos() throws Exception {
        String test = "";
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "Select nome, quantidade from produto";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {
            comboProduto.addItem(result.getString("nome"));
            
        }
    }
}
    