package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
    public static Connection connection;
    
    public ConexaoBanco() throws Exception{
        String URL = "";
        String USER = "";
        String PASS = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        URL = "jdbc:mysql://localhost:3306/controleestoque?useSSL=false&characterEncoding=utf8";
        USER = "root";
        PASS = "1234";
        
        connection = (Connection) DriverManager.getConnection(URL, USER, PASS);
    }
    
    public Connection getConnection(){
        return connection;
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}