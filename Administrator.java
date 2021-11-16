import java.util.ArrayList;

/*
 * A Administrator class which inherits the attributes/methods of
 * the User class.
 */

public class Administrator extends User {

	/*
	 * Default constructor which creates a new Administrator
	 * object with empty user name and password
	 */
	public Administrator() {
		this.username = "";
		this.password = "";
	}

	/*
	 * Workhorse constructor which takes arguments for user name
	 * and password, and creates a new Administrator object with
	 * those attributes
	 */
	public Administrator(String username, String password) {
		this.username = username;
		this.password = password;
	}

	
	/*
	 * This method allows the Administrator to view users requests
	 * @param
	 */
	public String viewRequest(RequestForm f) {
		/*
		 * This is where the code for viewing a request will
		 * be implemented
		 */
		return (f.appName + " " + f.externalLink);
		
		
	}

	/*
	 * This method allows the Administrator to accept users requests
	 * @param
	 * @return A boolean value indicating that the user 
	 * request was successfully accepted
	 */
	public boolean acceptRequest(RequestForm f, ArrayList<Application> catalog, ArrayList<RequestForm> requestList) {
		Application a = new Application(f.appName);
		boolean added = catalog.add(a);
		boolean removed = requestList.remove(f);
		if(added && removed && !catalog.contains(a)){
	 		return true;
	 	}
		else {
			return false;
		}
		
	}

	/*
	 * This method allows the Administrator to deny users requests
	 * @param
	 * @return A boolean value indicating that the user 
	 * request was successfully denied
	 */
	public boolean denyRequest(RequestForm f, ArrayList<RequestForm> requestList) {
		
		//System.out.println("Request Denied");??
		if (requestList.remove(f)){
			return true;
		} else {
			return false;
		}
	}

	/*
	 * This method allows the Administrator to add comments to 
	 * the comment section, replying to users
	 * @param
	 * @return A boolean value indicating that a comment was 
	 * successfully added
	 */
	public boolean addComment(String c, Application a) {
		/*
		 * This is where the code for adding a comment will
		 * be implemented
		 */
		boolean added = a.comments.add(c);
		if (added) {
			return true;
		} else {
			return false;
		}
		
	}

}
