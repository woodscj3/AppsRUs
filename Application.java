import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Application {
    public String appName, description, organization, platform, linkToStore, version;
    double price;
    public ArrayList<String> comments; 

    /*	
     * Default constructor that initializes the name, description, platform, 
     * version and link to the store of an Application
     */
    public Application() {
        this.appName = "";
        this.description = "";
        this.organization = "";
        this.platform = "";
        this.version = "";
        this.linkToStore = "";
        this.price = 0.0;
        this.comments = new ArrayList<String>();
    }

    /*
     * Workhorse constructor that receives values for all instance properties 
     * and adds an ArrayList parameter to the constructor
     * It also initializes the Application object
     */
    Application(String name, String description, String organization, String platform, String version, String link, double price) {
        this.appName = name;
        this.description = description;
        this.organization = organization;
        this.platform = platform;
        this.version = version;
        this.linkToStore = link;
        this.price = price;
    }

    public Application(String appName) {
        this.appName = appName;
        this.description = "";
        this.platform = "";
        this.version = "";
        this.linkToStore = "";
        this.price = 0.0;
        this.comments = new ArrayList<String>();

    }

    public boolean equals(Application a2) {
        if ((this.appName).equals(a2.appName)) {
                return true;
        } else {
                return false;
        }
    }

    public String getAppName() {
        return appName;
    }
    
    /*
     * compares applications and returns -1 if this app is alphabetically first, 1 if
     * a2 is alphabetically first, 0 if this app and a2 are equal (based on appName)
     */
    public int compareTo(Application a2) {
        if (this.equals(a2)) {
            return 0;
        } else if (this.appName.compareTo(a2.appName) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
    
    /**
     * Request a new application
     */
    public void requestApp(String name) {
        PreparedStatement ps;
        String query = "INSERT INTO `AppRequest`(`appName`, `appDescription`, `appOrganization`, "
                + "`appPlatform`, `appVersion`, `appLink`, `appPrice`) VALUES (?,?,?,?,?,?,?)";
        
        try {
            ps = ConnectData.getConnection().prepareStatement(query);
            
            ps.setString(1, appName); 
            ps.setString(2, description);
            ps.setString(3, organization);
            ps.setString(4, platform);
            ps.setString(5, version);
            ps.setString(6, linkToStore);
            ps.setDouble(7, price);

            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "App successfully added");
            } else {
                JOptionPane.showMessageDialog(null, "Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Application getAppByName(String table ,String input) {
        Application currApp = null;
        ConnectData connector = new ConnectData();
        
        String query = "SELECT * FROM `"
                + table + "` WHERE `appName` = '" + input + "'";
        ResultSet rs = connector.getData(query);
        
        try {
            if(rs.next()) {
                currApp = new Application(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7));
                return currApp;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return currApp;
    }
}
