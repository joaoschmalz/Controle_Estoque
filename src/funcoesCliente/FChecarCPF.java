package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

public class FChecarCPF {
    
    public static int ChecarCPF (String CPF) throws Exception{
        int hab = 0;
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco ();
        con.getConnection();
        
        txtSQL = "select Habilitado from cliente where CPF = '"+CPF+"'";
                
        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);
        
        while (result.next()){
            hab = result.getInt("Habilitado");
        }
        return hab;
    }
    
}
