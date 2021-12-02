package funcoesMovimentacao;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import static telas.Movimentacao.comboClientes;

public class FPopulaComboBoxClientes {

    public static void PopulaComboBoxClientes() throws Exception {
        String test = "";
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "Select nome from cliente where habilitado = 1";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {
            comboClientes.addItem(result.getString("nome"));
        }
    }
}
