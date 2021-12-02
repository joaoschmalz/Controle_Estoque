package funcoesRelatorios;

import com.mysql.jdbc.Statement;
import conexao.ConexaoBanco;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import telas.Relatorios;
import static telas.Relatorios.jTableReports;
import static telas.Relatorios.lbResult;

public class ConsultaEntrada {

    public static void ConsultaEntrada(String Text) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "select * from view_relatorio_entrada where data >= '" + Relatorios.jDataIni.getText() + " 00:00:01' "
                + "and data <= '" + Relatorios.jDataFim.getText() + " 23:59:59'";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        DefaultTableModel model = (DefaultTableModel) telas.Relatorios.jTableReports.getModel();
        model.setNumRows(0);

        while (result.next()) {

            model.addRow(new Object[]{
                result.getString("NOME"),
                result.getString("PRODUTO"),
                result.getInt("QUANTIDADE"),
                result.getString("DATA"),});
        }
        lbResult.setText(jTableReports.getRowCount() +" registros lozalizados.");
    }
}
