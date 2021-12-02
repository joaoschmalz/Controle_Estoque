/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoesCategoria;

import com.mysql.jdbc.Statement;
import conexao.ConexaoBanco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas.Categoria;
import static telas.Categoria.txtDesc;

/**
 *
 * @author u6076275
 */
public class FAlterarSituacao {

    public static void AlterarSituacao(String nomeCat) throws Exception {
        try {
            String txtSQL = "";
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            txtSQL = "SELECT * FROM CATEGORIA where nome = '" + nomeCat + "';";
            Statement stmt = (Statement) ConexaoBanco.connection.createStatement();
            ResultSet result = stmt.executeQuery(txtSQL);

            while (result.next()) {

                if (result.getInt("habilitado") == 100) {

                    String txtSQL2 = "UPDATE categoria SET habilitado = 999 WHERE nome = '" + nomeCat + "';";
                    Statement banco = (Statement) ConexaoBanco.connection.createStatement();
                    boolean result2 = banco.execute(txtSQL2);

                    String txtSQL3 = "UPDATE produto SET habilitado = 999 WHERE idCategoria = " + result.getInt("idCategoria") + ";";
                    boolean result3 = banco.execute(txtSQL3);
                    
                    JOptionPane.showMessageDialog(null, "Executado com sucesso !");

                } else {
                    
                    String txtSQL2 = "UPDATE categoria SET habilitado = 100 WHERE nome = '" + nomeCat + "';";
                    Statement banco = (Statement) ConexaoBanco.connection.createStatement();
                    boolean result2 = banco.execute(txtSQL2);

                    String txtSQL3 = "UPDATE produto SET habilitado = 100 WHERE idCategoria = " + result.getInt("idCategoria") + ";";
                    boolean result3 = banco.execute(txtSQL3);
                    
                    JOptionPane.showMessageDialog(null, "Executado com sucesso !");
                }
            }
            txtDesc.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
