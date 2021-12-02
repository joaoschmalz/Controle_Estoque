package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.sql.ResultSet;
import static telas.Cliente.cbUF;
import static telas.Cliente.ftfCEP;
import static telas.Cliente.ftfNascimento;
import static telas.Cliente.ftfTelefone;
import static telas.Cliente.lbSituacao;
import static telas.Cliente.txtBairro;
import static telas.Cliente.txtCidade;
import static telas.Cliente.txtComplemento;
import static telas.Cliente.txtEmail;
import static telas.Cliente.txtEndereco;
import static telas.Cliente.txtNumero;
import static telas.Cliente.txtTeste;
import static telas.ConsultaCliente.ftfCPF;
import static telas.ConsultaCliente.idCli;
import static telas.Cliente.jbHabilitar;
import static telas.Cliente.btLimpar;
import static telas.Cliente.btAtualizar;
import static telas.Cliente.ftfCpf;

public class FEditar {

    public static void editar(String Editar) throws Exception {

        String txtSQL = "";
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "select * from Cliente where CPF = '" + Editar + "' ;";

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();

        ResultSet result = banco.executeQuery(txtSQL);

        while (result.next()) {
            idCli = result.getInt("idCliente");
            txtTeste.setText(result.getString("Nome"));
            ftfCPF.setText(result.getString("CPF"));
            txtEmail.setText(result.getString("Email"));
            ftfTelefone.setText(result.getString("Telefone"));
            ftfNascimento.setText(result.getString("Nascimento"));
            ftfCEP.setText(result.getString("CEP"));
            cbUF.setSelectedItem(result.getString("UF"));
            txtCidade.setText(result.getString("Cidade"));
            txtBairro.setText(result.getString("Bairro"));
            txtEndereco.setText(result.getString("Rua"));
            txtNumero.setText(String.valueOf(result.getInt("Numero")));
            txtComplemento.setText(result.getString("Complemento"));
            
            ftfCpf.setEditable(false);
            ftfCpf.setEnabled(false);
            btLimpar.setEnabled(true);
            btAtualizar.setEnabled(true);
            
            if(result.getInt("habilitado") == 0){
                lbSituacao.setText("DESABILITADO");
                lbSituacao.setForeground(red);
                jbHabilitar.setEnabled(true);
            }else{
                lbSituacao.setText("HABILITADO");
                lbSituacao.setForeground(blue);
                jbHabilitar.setEnabled(false);
            }
        }
    }

}
