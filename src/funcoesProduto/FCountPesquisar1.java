package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

public class FCountPesquisar1 {

    public static int CountPesquisar1(String Codigo) throws Exception {
        int test = 0;
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "select count(*) as qtd from produto where Codigo = '" + Codigo + "'";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {
            test = result.getInt("qtd");
        }

        return test;
    }
}
