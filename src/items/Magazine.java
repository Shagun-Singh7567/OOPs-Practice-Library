package items;
public class Magazine extends DigitalLibraryItem{
    private String edition;
    Magazine(String title, String creator, String type, double fileSize, String edition )
    {
        super(title, creator, type, fileSize);
        this.edition = edition;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Edition: "+ edition);
    }
}
