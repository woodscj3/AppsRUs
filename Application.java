import java.util.*;

public class Application {
    public String appName, description, organization, platform, version, linkToStore; 
    public float price; 
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
        this.price = 0;
        this.comments = new ArrayList<String>();
    }

    /*
     * Workhorse constructor that receives values for all instance properties 
     * and adds an ArrayList parameter to the constructor
     * It also initializes the Application object
     */
    Application(String name, String description, String organization, String platform, String version, String link, float price) {
        this.appName = name;
        this.description = description;
        this.organization = organization;
        this.platform = platform;
        this.version = version;
        this.linkToStore = link;
        this.price = price;
    }

    /*
     * Application constructor that receives a String value for the
     * app's name, then initializes the Application object with that name.
     */
    public Application(String appName) {
        this.appName = appName;
        this.description = "";
        this.platform = "";
        this.version = "";
        this.linkToStore = "";
        this.price = 0;
        this.comments = new ArrayList<String>();

    }

    /*
     * Equals method that checks if two Application objects have the same
     * name. This method receives an Application object against which the
     * original Application object will be checked.
     */
    public boolean equals(Application a2) {
        if ((this.appName).equals(a2.appName)) {
                return true;
        } else {
                return false;
        }
    }

    /*
     * Compares applications and returns -1 if this app is alphabetically first, 1 if
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
}
