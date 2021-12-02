package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import static java.awt.Color.blue;
import javax.swing.JOptionPane;
import static telas.Produtos.btAtualizar;
import static telas.Produtos.btDesabilitar;
import static telas.Produtos.btHabilitar;
import static telas.Produtos.btLimpar;
import static telas.Produtos.lbResultSituacaoProd;

public class FHabilitarProd {

    public static void Habilitar(String codigo) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "update produto set habilitado = 100 "
                + " where codigo = '" + codigo + "'";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        boolean result = banco.execute(txtSQL);
                       
        lbResultSituacaoProd.setText("HABILITADO");
        lbResultSituacaoProd.setForeground(blue);
        JOptionPane.showMessageDialog(null, "Produto habilitado !");
        btDesabilitar.setEnabled(true);
        btHabilitar.setEnabled(false);
        btAtualizar.setEnabled(true);
        btLimpar.setEnabled(true);
        
    }
}
