import java.util.Scanner;

import items.Book;
public class Main
{
       public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Welcome to The Digital Library---");
        System.out.println("From the below menu, select an operation to perform in the library: \n " +
        "To show all the books in the library, press B \n "+
        "To show all audiobooks, press A \n "+
        "To show all magazines, press M");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'B':
                System.out.println("Here is a list of all the books in the library currently: ");
                Book newBook = new Book("1984", "George Orwell", "Book", 56, 500);
                newBook.displayInfo();
                
            case 'A':
                System.out.println("");
        }

    }
        
    }