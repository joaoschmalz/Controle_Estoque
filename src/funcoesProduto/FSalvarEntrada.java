package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import static telas.Produtos.txtCodigo;
import static telas.Produtos.txtQuantidade;
import static telas.Produtos.userProd;

public class FSalvarEntrada {

    public static void SalvarEntrada(int idUser, String idProd, int qtd) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "insert into entrada(idUsuario,idProduto,Data,Quantidade)"
                + "values (" + idUser + ""
                + ",(select idProduto from produto where codigo = '"+ idProd +"')"
                + ",CURRENT_TIMESTAMP"
                + "," + qtd + ");";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        int result = banco.executeUpdate(txtSQL);
    }
}
