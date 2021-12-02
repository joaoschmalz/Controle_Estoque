package funcoesCategoria;

import com.mysql.jdbc.Statement;
import conexao.ConexaoBanco;
import java.sql.ResultSet;
import static telas.Aviso.jLabel3;
import static telas.Categoria.lbID;

public class FBuscaQTD {
    
    public static void BuscaQTD() throws Exception{
        
        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "SELECT count(* ) AS qtd FROM produto where idCategoria = " + lbID.getText() + ";";
        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        ResultSet result = banco.executeQuery(txtSQL);
        
        while(result.next()){
            jLabel3.setText(result.getInt("qtd") + " produtos.");
        }
    }
}
