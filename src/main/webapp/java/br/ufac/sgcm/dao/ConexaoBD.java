import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.ConnectionGroup;

public class ConexaoBD {
    private String url = "jdbc:mysql://localhost/sgcm";
    private String usuario = "root";
    private String senha = "root";
    Connection con;
    public Connection getConexao(){
    try{
    
    Class.forName("com.mysql.cj.jdbc.Drive");
    con = DriverManager.getConnection(url, usuario, senha)
    }catch(ClassNotFoundException | SQLException e){
        e.printStackTrace();
    }
    return con;
    }
}