
public class RequestForm {

	public String appName;
	public String externalLink;
	
	/*	
	 * Default constructor that initializes the name
	 *  of an application and the external link
	 * to a request form for an application
	 */
	public RequestForm() {
		this.appName = "";
		this.externalLink = "";
		
	}
	
	/*
	 * constructor that receives values for all instance properties 
	 * and initializes the Request Form object
	 */
	public RequestForm(String appName, String externalLink) {
		this.appName = appName;
		this.externalLink = externalLink; 
	}
}
