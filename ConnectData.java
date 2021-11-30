import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectData {
    
    public static Connection getConnection() {
        Connection con = null;
        String ENDPOINT = "jdbc:mysql://34.121.88.53/CSE201";
        String USERNAME = "cse201"; 
        String PASSWORD = "";
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(ENDPOINT, USERNAME, PASSWORD);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con; 

        // Local database
//        Connection con = null;
//         try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/userinfo", "root", "");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        return con; 
    
    }
    
    public ResultSet getData(String input) {
        PreparedStatement ps;
        ResultSet rs = null;
        
        try {
            ps = getConnection().prepareStatement(input);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
}
