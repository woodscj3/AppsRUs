import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Suzy Doan
 */
public class ConnectData {
    
    public static Connection getConnection() {
        Connection con = null;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/userinfo", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con; 
    }
}
