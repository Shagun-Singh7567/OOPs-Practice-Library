package items;
public class Book extends DigitalLibraryItem implements Readable {

    private int numberOfPages;
    public Book(String title, String creator, String type, double fileSize, int numOfPages)
    // changed accessibility to public to allow classes outside the package to access the constructor
    {
        super(title, creator, type, fileSize);
        numberOfPages = numOfPages;
        
        
    }
    
    /*
     * public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public void setNumberOfPages(int n)
    {
        numberOfPages = n;
    }
     */
    
    
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