/**
 *
 * @author Suzy Doan
 */
public class App {
    private String name;
    private String category;
    private String description;
    private String organization; 
    private String platform;
    private String version;
    private String link;
    private double price;
    
    
    public App (String name, String category, String description, String organization, 
            String platform, String version, String link, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.organization = organization;
        this.platform = platform;
        this.version = version;
        this.link = link;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getOrganization() {
        return description;
    }
    
    public String getPlatform() {
        return platform;
    }
    
    public String getVersion() {
        return version;
    }
    
    public String getLink() {
        return link;
    }
    
    public double getPrice() {
        return price;
    }
}
