
package funcoesProduto;

import static telas.Produtos.CBcategoria;
import static telas.Produtos.btAtualizar;
import static telas.Produtos.btDesabilitar;
import static telas.Produtos.btHabilitar;
import static telas.Produtos.lbResultSituacaoProd;
import static telas.Produtos.txtCodigo;
import static telas.Produtos.txtDescpro;
import static telas.Produtos.txtQuantidade;

public class FLimparCamposProd {
    
    public static void Limpar(){
        lbResultSituacaoProd.setText("");
        txtCodigo.setText("");
        txtDescpro.setText("");
        txtQuantidade.setText("");
        CBcategoria.setSelectedIndex(0);
        
        txtQuantidade.setEnabled(true);
        btDesabilitar.setEnabled(false);
        btHabilitar.setEnabled(false);
        btAtualizar.setEnabled(false);
    }
}
