package items;
public class Book extends DigitalLibraryItem implements Readable {

    private int numberOfPages;
    Book(String title, String creator, String type, double fileSize, int numberOfPages)
    {
        super(title, creator, type, fileSize);
        this.numberOfPages = numberOfPages;
        
    }
    
    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public void setNumberOfPages(int n)
    {
        numberOfPages = n;
    }
    
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of pages: "+ numberOfPages);
    }

    public void flipPage()
    {
        for(int i = 1; i <= numberOfPages; i++)
        System.out.println("Page number "+ i);
    }
}