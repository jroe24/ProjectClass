public class ProjectMaker {
    private String name;
    private String description;

    // getter
    public String getName() {
        return name;
    }
        
    // setter
    public void setName(String name) {
        this.name = name;
    }
    // getter
    public String getDescription() {
        return description;
    }
    // setter
    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectMaker() {
    }

    public ProjectMaker(String name) {
        this.name = name;
    }

    public ProjectMaker(String name, String description) {
        this.name = name;
        this.description = description;
    }
}