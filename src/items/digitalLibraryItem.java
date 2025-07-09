package items;
public class DigitalLibraryItem
{
    // Fields made private to follow encapsulation principles
    private String title;
    private String creator;
    private String type;
    private double fileSize;
    public DigitalLibraryItem() // default constructor, default initialization takes place here when no arguments given
    {
        title = "";
        creator = "";
        type = "";
        fileSize = -1;
    }
    
    public DigitalLibraryItem(String title, String creator, String type, double fileSize)
    {
        this.title = title;
        this.creator = creator;
        this.type = type;
        this.fileSize = fileSize;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public String getCreator()
    {
        return creator;
    }

    public void setCreator(String c)
    {
        creator = c;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String ty)
    {
        type = ty;
    }

    public double getFileSize()
    {
        return fileSize;
    }

    public void setFileSize(double f)
    {
        fileSize = f;
    }
    public void displayInfo()
    {
        System.out.println("Title: "+title);
        System.out.println("Creator: "+creator);
        System.out.println("Type of media: "+type);
        System.out.println("File size: "+fileSize +" MB");
        
    }
}