package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import static java.awt.Color.red;
import javax.swing.JOptionPane;
import static telas.Produtos.btAtualizar;
import static telas.Produtos.btDesabilitar;
import static telas.Produtos.btHabilitar;
import static telas.Produtos.btLimpar;
import static telas.Produtos.lbResultSituacaoProd;

public class FDesabilitarProd {

    public static void Desabilitar(String codigo) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "update produto set habilitado = 999 "
                + " where codigo = '" + codigo + "'";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        boolean result = banco.execute(txtSQL);
        
        lbResultSituacaoProd.setText("DESABILITADO");
        lbResultSituacaoProd.setForeground(red);
        JOptionPane.showMessageDialog(null, "Produto desabilitado !");
        btDesabilitar.setEnabled(false);
        btHabilitar.setEnabled(true);
        btAtualizar.setEnabled(true);
        btLimpar.setEnabled(true);
        
    }
}
