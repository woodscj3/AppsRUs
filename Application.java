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
	}
	
	/*
	 * Workhorse constructor that receives values for all instance properties 
	 * and adds an ArrayList parameter to the constructor
	 * It also initializes the Application object
	 */
	public Application(String appName, ArrayList<String> comments) {
		this.appName = appName;
		this.comments = comments;
		
	}
}
