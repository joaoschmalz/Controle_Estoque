package funcoesCategoria;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

public class ValidaCategoria {

    public static int Validacao(String Nome) throws Exception {
        
        int test = 0;
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "SELECT count(*) as qtd FROM categoria WHERE nome = '" + Nome + "'";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {
            test = result.getInt("qtd");
        }

        return test;
    }
}
