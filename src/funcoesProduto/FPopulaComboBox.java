package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import static telas.Produtos.CBcategoria;

public class FPopulaComboBox {

    public static void PopulaComboBox() throws Exception {
        String test = "";
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "Select nome from categoria";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {
            CBcategoria.addItem(result.getString("Nome"));
        }
    }
}
