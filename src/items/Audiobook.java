package items;
public class Audiobook extends DigitalLibraryItem{
    private String narrator;
    private double durationInHours;
    Audiobook(String title, String creator, String type, double fileSize, String narrator, double durationInHours)
    {
        super(title, creator, type, fileSize);
        this.narrator = narrator;
        this.durationInHours = durationInHours;

    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Narrator: "+narrator);
        System.out.println("Duration in hours: "+durationInHours);

    }
}
