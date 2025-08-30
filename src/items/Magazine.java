package items;
public class Magazine extends DigitalLibraryItem implements Readable{
    private String edition;
    public Magazine(String title, String creator, String type, double fileSize, String edition, int numberOfPages )
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

    public void flipPage()
    {
        for(int i = 1; i <= numberOfPages; i++)
        System.out.println("Page number "+ i);
    }
}
