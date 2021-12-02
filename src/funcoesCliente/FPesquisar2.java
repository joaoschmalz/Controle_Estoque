package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static telas.ConsultaCliente.tbResult;

public class FPesquisar2 {

    public static void Pesquisar2(String CPF) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "select * from Cliente where CPF = '" + CPF + "'";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        DefaultTableModel model = (DefaultTableModel) tbResult.getModel();
        model.setNumRows(0);

        while (result.next()) {
            model.addRow(new Object[]{
                result.getString("Nome"),
                result.getString("CPF"),});
        }
    }

}
