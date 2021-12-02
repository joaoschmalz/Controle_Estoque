package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;

public class FAtualizar {

    public static void Atualizar(String Nome,
            String CPF,
            String Email,
            String Telefone,
            String Nascimento,
            String CEP,
            String UF,
            String Cidade,
            String Bairro,
            String Rua,
            int Numero,
            String Complemento,
            int idCli) throws Exception {
        String txtSQL = "";

        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();

        txtSQL = "update Cliente set Nome ='" + Nome + "', CPF ='" + CPF + "', Email ='" + Email + "', Telefone ='" + Telefone + "', Nascimento ='" + Nascimento + "', CEP ='" + CEP + "', UF ='" + UF + "', Cidade ='" + Cidade + "', Bairro ='" + Bairro + "', Rua ='" + Rua + "', Numero =" + Numero + ", Complemento ='" + Complemento + "'"
                + "where idCliente =" + idCli;

        Statement banco = (Statement) ConexaoBanco.connection.createStatement();

        int result = banco.executeUpdate(txtSQL);

    }
}
