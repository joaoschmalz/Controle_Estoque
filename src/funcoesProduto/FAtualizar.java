package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;

public class FAtualizar {

    public static void Atualizar(int idCat, String Cod, String Nome, int Quantidade, int IdPro) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "UPDATE produto SET idCategoria =" + idCat + ", Codigo ='" + Cod + "', Nome ='" + Nome + "', Quantidade =" + Quantidade + ", Foto =" + null + ", Peso =" + null + ", Preco =" + null
                + " where idProduto =" + IdPro;

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        int result = banco.executeUpdate(txtSQL);

    }
}
