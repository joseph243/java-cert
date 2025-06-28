package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String HELP = "help";
        String LIST = "list";
        String ADD_BOOK = "add";
        String FAKE_DATA = "fake";

        boolean running = true;
        System.out.println("===WELCOME TO JOSEPH LIBRARY===");
        Library library = new Library();

        while (running)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter your command: ");
            String input = scanner.nextLine();
            libraryWait();

            if (input.equals(ADD_BOOK))
            {
                System.out.println("adding a book...");
                Book book = new Book();
                System.out.print("enter title: ");
                book.setTitle(scanner.nextLine());
                System.out.print("enter author: ");
                book.setAuthor(scanner.nextLine());
                System.out.print("enter year: ");
                String year = scanner.nextLine();
                try
                {
                    book.setYear(Integer.parseInt(year));
                }
                catch (NumberFormatException e)
                {
                    System.out.println("INPUT YEAR WAS NOT DIGITS.  YOU IDIOT!!");
                }
                System.out.print("enter ISBN: ");
                book.setISBN(scanner.nextLine());
                library.addBook(book);
                System.out.println("Book add complete: " + book);
                System.out.println();
            }
            if (input.equals(FAKE_DATA))
            {
                library.addBook(new Book("1984", "George Orwell", "9780000000001", 1949));
                library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780000000002", 1960));
                library.addBook(new Book("Pride and Prejudice", "Jane Austen", "9780000000003", 1813));
                library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780000000004", 1925));
                library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "9780000000005", 1951));
                library.addBook(new Book("Moby-Dick", "Herman Melville", "9780000000006", 1851));
                library.addBook(new Book("Brave New World", "Aldous Huxley", "9780000000007", 1932));
                library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "9780000000008", 1937));
                library.addBook(new Book("Fahrenheit 451", "Ray Bradbury", "9780000000009", 1953));
                library.addBook(new Book("Jane Eyre", "Charlotte Brontë", "9780000000010", 1847));
            }
            if (input.equals(HELP))
            {
                System.out.println("help menu: ");
                System.out.println(HELP + ": this help menu");
                System.out.println(LIST + ": list books");
                System.out.println(ADD_BOOK + ": add a book");
                System.out.println("quit, exit, q: Quit Library");
            }
            if (input.equals(LIST))
            {
                System.out.println("Listing books:");
                for(Book b : library.getAllBooks())
                {
                    System.out.println(b.toString());
                }
            }
            if (input.equals("exit") || input.equals("quit") || input.equals("q"))
            {
                System.out.println("Exiting ...");
                libraryWait();
                running = false;
            }
        }
    }

    public static void libraryWait()
    {
        try
        {
            Thread.sleep(500);
        }
        catch (Exception e)
        {
            //do nothing
        }
    }
}