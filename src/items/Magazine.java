package items;
public class Magazine extends DigitalLibraryItem{
    private String edition;
    public Magazine(String title, String creator, String type, double fileSize, String edition )
    {
        super(title, creator, type, fileSize);
        this.edition = edition;
    }

    public String getEdition()
    {
        return edition;
    }

    public void setEdition(String e)
    {
        edition = e;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Edition: "+ edition);
    }
}
