package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FHabilitar {
       public static void habilitar(String CPF) throws SQLException, Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "update Cliente set habilitado = 1 where CPF = '" + CPF + "' ;";

        JOptionPane.showMessageDialog(null, "Cliente habilitado!");

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        int result = banco.executeUpdate(txtSQL);        
        }    
}
