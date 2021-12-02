package funcoesCliente;

import static telas.Cliente.btAtualizar;
import static telas.Cliente.cbUF;
import static telas.Cliente.ftfCEP;
import static telas.Cliente.ftfNascimento;
import static telas.Cliente.ftfTelefone;
import static telas.Cliente.txtBairro;
import static telas.Cliente.txtCidade;
import static telas.Cliente.txtComplemento;
import static telas.Cliente.txtEmail;
import static telas.Cliente.txtEndereco;
import static telas.Cliente.txtTeste;
import static telas.Cliente.txtNumero;
import static telas.Cliente.ftfCpf;
import static telas.Cliente.btLimpar;
import static telas.Cliente.jbHabilitar;
import static telas.Cliente.lbSituacao;

public class FLimparCamposCliente {

    public static void limparCamposCliente() {
        txtTeste.setText("");
        ftfCpf.setText("");
        ftfNascimento.setText("");
        txtEmail.setText("");
        ftfTelefone.setText("");
        txtEndereco.setText("");
        txtComplemento.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        ftfCEP.setText("");
        cbUF.setSelectedIndex(0);
        
        lbSituacao.setText("");
        ftfCpf.setEnabled(true);
        btLimpar.setEnabled(false);
        btAtualizar.setEnabled(false);               
        jbHabilitar.setEnabled(false);
    }

}
