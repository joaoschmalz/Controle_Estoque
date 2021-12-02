package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

public class FChecarCPF2 {
    public static int ChecarCPF2 (String CPF) throws Exception{
        int test = 0;
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco ();
        con.getConnection();
        
        txtSQL = "select count(*) as qtd from cliente where CPF = '"+CPF+"'";
                
        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);
        
        while (result.next()){
            test = result.getInt("qtd");
        }
        return test;
    }
    
}
