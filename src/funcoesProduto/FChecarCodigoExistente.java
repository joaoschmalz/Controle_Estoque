package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

public class FChecarCodigoExistente {

    public static int ChecarCodigoExistente(String Codigo, int ProdutoId) throws Exception {
        int test = 0;
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "select count(*) as qtd from produto where Codigo = '" + Codigo + "' "
                + "and idProduto =" + ProdutoId;

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {
            test = result.getInt("qtd");
        }

        return test;
    }
}
