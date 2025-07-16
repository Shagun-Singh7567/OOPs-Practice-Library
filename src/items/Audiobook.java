package items;
public class Audiobook extends DigitalLibraryItem{
    private String narrator;
    private double durationInHours;
    public Audiobook(String title, String creator, String type, double fileSize, String narrator, double durationInHours)
    {
        super(title, creator, type, fileSize);
        this.narrator = narrator;
        this.durationInHours = durationInHours;

    }

    public String getNarrator()
    {
        return narrator;
    }

    public void setNarrator(String n)
    {
        narrator = n;
    }

    public double getDurationInHours()
    {
        return durationInHours;
    }

    public void setDurationInHours(double d)
    {
        durationInHours = d;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Narrator: "+narrator);
        System.out.println("Duration in hours: "+durationInHours);

    }
}
