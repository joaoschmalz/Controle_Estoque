package funcoesProduto;

import com.mysql.jdbc.Statement;
import conexao.ConexaoBanco;
import java.sql.ResultSet;
import static telas.Menu.idUser;


public class Login {

    public static boolean validaLogin(String login, String senha) throws Exception {

        String txtSQL = "";

        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "SELECT * FROM Usuario WHERE login = '" + login + "' AND Senha = '" + senha + "'";

        Statement stmt = (Statement) ConexaoBanco.connection.createStatement();

        ResultSet result = stmt.executeQuery(txtSQL);

        while (result.next()) {
            if (result.getString("login").equals(login) && result.getString("Senha").equals(senha)) {
                telas.Menu menu = new telas.Menu();
                menu.setVisible(true);

                idUser.setToolTipText(result.getString("idUsuario"));
            }

        }
        return true;
    }

}
