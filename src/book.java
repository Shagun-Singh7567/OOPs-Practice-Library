public class book extends digitalLibraryItem  {

    private int numberOfPages;
    book(String title, String creator, String type, double fileSize, int numberOfPages)
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
}
