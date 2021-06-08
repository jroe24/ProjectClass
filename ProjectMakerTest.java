public class ProjectMakerTest {
    public static void main(String[] args) {
        ProjectMaker firstProject = new ProjectMaker();
        ProjectMaker secondProject = new ProjectMaker();
        firstProject.setName("My first project");
        firstProject.setDescription("This is my first project I created");
        String firstProjectName = firstProject.getName();
        String firstProjectDescription = firstProject.getDescription();
        secondProject.setName("My second project");
        secondProject.setDescription("This is my second project I created");
        String secondProjectName = secondProject.getName();
        String secondProjectDescription = secondProject.getDescription();
        System.out.println("First Project - Name: " + firstProjectName + ", Description: " + firstProjectDescription);
        System.out.println("First Project - Name: " + secondProjectName + ", Description: " + secondProjectDescription);
    }
}
