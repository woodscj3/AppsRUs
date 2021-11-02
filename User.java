import java.util.ArrayList;

/*
 * A generic representation of a User which contains a username and password
 * */

public class User {

	public String username;
	public String password;

	/*
	 * Default constructor that initializes the name and password as "" and ID as 0
	 */
	public User() {
		this.username = "";
		this.password = "";
	}
	
	/*
	 * Workhorse constructor that receives values for all instance properties 
	 * and initializes the User object
	 */
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	void addComment(Application a, String userComment) {
		a.comments.add(userComment);
	}
	
	/*
	 * Takes request form as paramter and adds to requestList parameter
	 */
	void submitRequest(RequestForm f, ArrayList<RequestForm> requestList) {
		requestList.add(f);
	}
}
