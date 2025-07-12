import items.DigitalLibraryItem;

public class Main
{
    public static void main(String args[])
    {
        DigitalLibraryItem newBook = new DigitalLibraryItem("Little Women", "Louisa May Alcott", "Book", 4.7);
        newBook.displayInfo();
    }
}