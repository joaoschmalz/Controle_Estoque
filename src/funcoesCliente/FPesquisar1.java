package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static telas.ConsultaCliente.tbResult;
import static telas.ConsultaCliente.idCli;
import static telas.ConsultaCliente.lbResultClientes;

public class FPesquisar1 {

    public static void Pesquisar1(String Nome) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "select * from Cliente where nome like '%" + Nome + "%' and habilitado = 1";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        DefaultTableModel model = (DefaultTableModel) tbResult.getModel();
        model.setNumRows(0);

        while (result.next()) {
            idCli = result.getInt("idCliente");
            model.addRow(new Object[]{
                result.getString("Nome"),
                result.getString("CPF"),});
        }
        lbResultClientes.setText(tbResult.getRowCount()+" registros localizados.");
    }

}
