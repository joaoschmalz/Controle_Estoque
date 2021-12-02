package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import static funcoesCliente.FPesquisar1.Pesquisar1;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static telas.ConsultaCliente.txtNome;

public class FDesabilitar {

    public static void desabilitar(String CPF) throws SQLException, Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "update Cliente set habilitado = 0 where CPF = '" + CPF + "' ;";

        JOptionPane.showMessageDialog(null, "Cliente desabilitado.");

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        int result = banco.executeUpdate(txtSQL);
        
        Pesquisar1(txtNome.getText());
    }
}
