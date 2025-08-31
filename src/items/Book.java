package items;

import java.util.ArrayList;

public class Book extends DigitalLibraryItem implements Readable {

    ArrayList<String> bookTitles = new ArrayList<>();
    ArrayList<String> creators = new ArrayList<>();
    ArrayList<Double> fileSizes = new ArrayList<>();
    ArrayList<Integer> bookNumberOfPages = new ArrayList<>();
    private int numberOfPages;
    public Book(String title, String creator, String type, double fileSize, int numOfPages)
    // changed accessibility to public to allow classes outside the package to access the constructor
    {
        super(title, creator, type, fileSize);
        numberOfPages = numOfPages;
        this.collectionCreator(title, creator, fileSize, numOfPages);
        
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

    public void collectionCreator(String newTitle, String newCreator, double newFileSize, int newNumOfPages)
    {
        
        bookTitles.add(newTitle);
        creators.add(newCreator);
        fileSizes.add(newFileSize);
        bookNumberOfPages.add(newNumOfPages);
        System.out.println(bookTitles);
        System.out.println(creators);
        System.out.println(fileSizes);
        System.out.println(numberOfPages);

    }
}