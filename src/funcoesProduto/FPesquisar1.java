package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.sql.ResultSet;
import static telas.Produtos.CBcategoria;
import static telas.Produtos.ProdutoId;
import static telas.Produtos.lbResultSituacaoProd;
import static telas.Produtos.txtDescpro;
import static telas.Produtos.txtQuantidade;
import static telas.Produtos.btHabilitar;
import static telas.Produtos.btDesabilitar;
import static telas.Produtos.btAtualizar;
import static telas.Produtos.btLimpar;

public class FPesquisar1 {

    public static void Pesquisar1(String Codigo) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "call sp_3 ('" + Codigo + "')";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {

            ProdutoId = result.getInt("idProduto");
            CBcategoria.setSelectedIndex(result.getInt("idCategoria"));
            txtDescpro.setText(result.getString("p.Nome"));
            txtQuantidade.setText(String.valueOf(result.getInt("Quantidade")));
            txtQuantidade.setEnabled(false);
            btAtualizar.setEnabled(true);
            btLimpar.setEnabled(true);
            if(result.getInt("habilitado") == 100){
                btHabilitar.setEnabled(false);
                btDesabilitar.setEnabled(true);
                lbResultSituacaoProd.setText("HABILITADO");
                lbResultSituacaoProd.setForeground(blue);
            }else if(result.getInt("habilitado") == 999){
                btHabilitar.setEnabled(true);
                btDesabilitar.setEnabled(false);
                lbResultSituacaoProd.setText("DESABILITADO");
                lbResultSituacaoProd.setForeground(red);
            }
        }
    }
}
