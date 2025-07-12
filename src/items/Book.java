package items;
public class Book extends DigitalLibraryItem  {

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
}