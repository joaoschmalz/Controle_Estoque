package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.sql.ResultSet;
import static telas.Produtos.CBcategoria;
import static telas.Produtos.txtCodigo;
import static telas.Produtos.txtDescpro;
import static telas.Produtos.txtQuantidade;
import static telas.Produtos.lbResultSituacaoProd;
import static telas.Produtos.btAtualizar;
import static telas.Produtos.btHabilitar;
import static telas.Produtos.btDesabilitar;
import static telas.Produtos.btLimpar;

public class FEditarProd {

    public static void editar(String Editar) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "select * from Produto where nome = '" + Editar + "' ;";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {
            txtCodigo.setText(result.getString("Codigo"));
            txtDescpro.setText(result.getString("Nome"));
            txtQuantidade.setText(result.getString("Quantidade"));
            txtQuantidade.setEnabled(false);
            FPopulaComboBox.PopulaComboBox();
            CBcategoria.setSelectedIndex(Integer.parseInt(result.getString("idCategoria")));
            btAtualizar.setEnabled(true);
            btLimpar.setEnabled(true);
            if(result.getInt("habilitado") == 999){
                btHabilitar.setEnabled(true);
                btDesabilitar.setEnabled(false);
                lbResultSituacaoProd.setText("DESABILITADO");
                lbResultSituacaoProd.setForeground(red);
            }else if(result.getInt("habilitado") == 100){
                btHabilitar.setEnabled(false);
                btDesabilitar.setEnabled(true);
                lbResultSituacaoProd.setText("HABILITADO");
                lbResultSituacaoProd.setForeground(blue);
            }
        }
    }
}
