
package CONFIG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
  
  Connection con;
  String url = "jdbc:sqlserver://LAPTOP-LG5DLB6P\\SQLEXPRESS:1433;databaseName=COLEGIO_PRIMARIA;encrypt=false";
  String usuario = "login";
  String clave = "12345";
   
  
   public Connection Conexion(){
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url,usuario,clave);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
