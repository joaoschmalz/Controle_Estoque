package funcoesCategoria;

import com.mysql.jdbc.Statement;
import conexao.ConexaoBanco;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static telas.Categoria.rdTodos;
import static telas.Categoria.rdHabilitados;
import static telas.Categoria.tbCats;
import static telas.Categoria.lbResult;

public class FAtualizar {

    public static void Atualiza(String proc) throws Exception {

        if (rdTodos.isSelected()) {
            
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "SELECT idCategoria, Nome FROM categoria WHERE Nome like '%" + proc + "%';";

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            ResultSet resultado = banco.executeQuery(txtSQL);

            DefaultTableModel model = (DefaultTableModel) tbCats.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("idCategoria"),
                    resultado.getString("Nome")
                });
            }
            lbResult.setText(tbCats.getRowCount() + " registros localizados.");
            banco.close();
            
        } else if (rdHabilitados.isSelected()) {
            
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "SELECT idCategoria, Nome FROM categoria WHERE Nome like '%" + proc + "%' AND habilitado = 100;";

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            ResultSet resultado = banco.executeQuery(txtSQL);

            DefaultTableModel model = (DefaultTableModel) tbCats.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("idCategoria"),
                    resultado.getString("Nome")
                });
            }
            lbResult.setText(tbCats.getRowCount() + " registros localizados.");
            banco.close();
        
        } else {
        
            ConexaoBanco con = new ConexaoBanco();
            con.getConnection();

            String txtSQL = "SELECT idCategoria, Nome FROM categoria WHERE Nome like '%" + proc + "%' AND habilitado = 999;";

            Statement banco = (Statement) ConexaoBanco.connection.createStatement();
            ResultSet resultado = banco.executeQuery(txtSQL);

            DefaultTableModel model = (DefaultTableModel) tbCats.getModel();
            model.setNumRows(0);

            while (resultado.next()) {
                model.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("idCategoria"),
                    resultado.getString("Nome")
                });
            }
            lbResult.setText(tbCats.getRowCount() + " registros localizados.");
            banco.close();
        
        }
    }
}
