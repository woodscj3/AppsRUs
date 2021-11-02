/*
 * A Moderator class which inherits the attributes/methods of
 * the User class
 * this comment is showing Carolyn has access
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
	 * Removes comment from application comment list based on
	 * int parameter specifying the index and application
	 * paramter specifying the app
	 */
	public void moderateComment(Application a, int commentIndex) {
		a.comments.remove(commentIndex);
		/*
		 * This is where the code for moderating a comment will
		 * be implemented
		 */
	}
}
