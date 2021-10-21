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
	public void viewRequest() {
		/*
		 * This is where the code for viewing a request will
		 * be implemented
		 */
	}

	/*
	 * This method allows the Administrator to accept users requests
	 * @param
	 * @return A boolean value indicating that the user 
	 * request was successfully accepted
	 */
	public boolean acceptRequest() {
		
		/*
		 * This is where the code for accepting a request will
		 * be implemented
		 */
		return false;
	}

	/*
	 * This method allows the Administrator to deny users requests
	 * @param
	 * @return A boolean value indicating that the user 
	 * request was successfully denied
	 */
	public boolean denyRequest() {
		/*
		 * This is where the code for deny a request will
		 * be implemented
		 */
		return false;
	}

	/*
	 * This method allows the Administrator to add comments to 
	 * the comment section, replying to users
	 * @param
	 * @return A boolean value indicating that a comment was 
	 * successfully added
	 */
	public boolean addComment() {
		/*
		 * This is where the code for adding a comment will
		 * be implemented
		 */
		return false;
	}

}
