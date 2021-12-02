package funcoesCliente;

import conexao.ConexaoBanco;
import com.mysql.jdbc.Statement;

public class FSalvarCliente {
            public static void SalvarProduto(String Nome,
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
                                  String Complemento) throws Exception{
        String txtSQL = ""; 
        
        ConexaoBanco con = new ConexaoBanco();
        con.getConnection();
        
        txtSQL = "insert into Cliente (Nome, CPF, Email, Telefone, Nascimento, CEP, UF, Cidade, Bairro, Rua, Numero, Complemento, Habilitado, Data_Criacao, Data_Alteracao, Data_UltimoPedido) "
                +"values('"+Nome+"', '"+CPF+"', '"+Email+"', '"+Telefone+"', '"+Nascimento+"', '"+CEP+"', '"+UF+"', '"+Cidade+"', '"+Bairro+"', '"+Rua+"', '"+Numero+"', '"+Complemento+"', 1, current_timestamp, current_timestamp, current_timestamp)";
        
        Statement banco = (Statement) ConexaoBanco.connection.createStatement();
        
        int result = banco.executeUpdate(txtSQL);
        
        txtSQL = "";
        
            }  
    
}
