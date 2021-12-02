package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static telas.ConsultaProd.tableProd;
import static telas.ConsultaProd.TXTpesquisa;
import static telas.ConsultaProd.cbOpcoes;
import static telas.ConsultaProd.lbResultConsulta;

public class FPesquisaCategoria {

    public static void PesquisaCategoria(String Produto, int grupo) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "call sp_4 ('" + TXTpesquisa.getText() + "', " + cbOpcoes.getSelectedIndex() + ", " + grupo + " )";
        
        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        DefaultTableModel model = (DefaultTableModel) tableProd.getModel();
        model.setNumRows(0);

        while (result.next()) {
            model.addRow(new Object[]{
                //retorna os dados da tabela do BD, cada campo e um coluna.
                result.getString("Codigo"),
                result.getString("p.Nome"),
                result.getString("Quantidade"),
                result.getString("c.Nome"),});
        }
        lbResultConsulta.setText(tableProd.getRowCount()+ " registros localizados.");
    }
}
