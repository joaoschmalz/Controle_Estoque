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
        URL = "jdbc:mysql://localhost:3306/projetopincel?useSSL=false";
        USER = "root";
        PASS = "Mj*701314";
        
        connection = (Connection) DriverManager.getConnection(URL, USER, PASS);
    }
    
    public Connection getConnection(){
        return connection;
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}