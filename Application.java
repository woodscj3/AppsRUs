import java.util.*;

public class Application {

	public String appName, description, platform, version, linkToStore; 
	public float price; 
	public ArrayList<String> comments; 
	 
	/*	
	 * Default constructor that initializes the name, description, platform, 
	 * version and link to the store of an Application
	 */
	public Application() {
		this.appName = "";
		this.description = "";
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
	public Application(String appName, ArrayList<String> comments) {
		this.appName = appName;
		this.comments = comments;
		this.description = "";
		this.platform = "";
		this.version = "";
		this.linkToStore = "";
		this.price = 0;
		
	}
	
	public Application(String appName) {
		this.appName = appName;
		this.comments = new ArrayList<String>();
		this.description = "";
		this.platform = "";
		this.version = "";
		this.linkToStore = "";
		this.price = 0;
		this.comments = new ArrayList<String>();
		
	}
	

	public boolean equals(Application a2) {
		if ((this.appName).equals(a2.appName)) {
			return true;
		} else {
			return false;
		}
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
			}
		else {
			return -1;
		}
		 
	}
	
	
}
