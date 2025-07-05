public class digitalLibraryItem
{
    public String title;
    public String creator;
    public String type;
    public double fileSize;
    digitalLibraryItem() // default constructor, default initialization takes place here when no arguments given
    {
        title = "";
        creator = "";
        type = "";
        fileSize = -1;
    }
    
    digitalLibraryItem(String title, String creator, String type, double fileSize)
    {
        this.title = title;
        this.creator = creator;
        this.type = type;
        this.fileSize = fileSize;
    }
    public void displayInfo()
    {
        System.out.println("Title: "+title);
        System.out.println("Creator: "+creator);
        System.out.println("Type of media: "+type);
        System.out.println("File size: "+fileSize +" MB");
        
    }
}