
/*
 * A generic representation of a User which contains a username and password
 * */
public class User {

    public String username;
    public String userPassword;
    public String userType;

    /*
     * Default constructor that initializes the name and password as "" and 
     * type as normal user
     */
    public User() {
        this.username = "";
        this.userPassword = "";
        this.userType = "User";
    }

    /*
     * Workhorse constructor that receives values for all instance properties 
     * and initializes the User object
     */
    public User(String username, String password, String type) {
        this.username = username;
        this.userPassword = password;
        this.userType = type;
    }

//    /*
//     * Takes request form as paramter and adds to requestList parameter
//     */
//    void submitRequest(RequestForm f, ArrayList<RequestForm> requestList) {
//        requestList.add(f);
//    }
    
}
