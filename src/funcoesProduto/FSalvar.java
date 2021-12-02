package funcoesProduto;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;

public class FSalvar {

    public static void Salvar(int idCat, String Cod, String Nome, int Quantidade) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "insert into produto(idCategoria,Codigo,Nome,Quantidade,Preco,Foto,Peso,Habilitado)"
                + "values (" + idCat + ",'" + Cod + "','" + Nome + "'," + Quantidade + "," + null + "," + null + "," + null + ", 100);";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        int result = banco.executeUpdate(txtSQL);

    }
}
