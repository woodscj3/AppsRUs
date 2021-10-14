/*
 * A Moderator class which inherits the attributes/methods of
 * the User class.
 */
public class Moderator extends User {

	/*
	 * Default constructor which creates a new Moderator
	 * object with empty username and password
	 */
	public Moderator() {
		this.username = "";
		this.password = "";
	}
	
	/*
	 * Workhorse constructor which takes arguments for username
	 * and password, and creates a new Moderator object with
	 * those attributes
	 */
	public Moderator(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	/*
	 * 
	 */
	public void moderateComment() {
		/*
		 * This is where the code for moderating a comment will
		 * be implemented
		 */
	}
}
