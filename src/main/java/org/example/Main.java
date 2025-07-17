package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        final String HELP = "help";
        final String LIST = "list";
        final String ADD_BOOK = "add";
        final String FAKE_DATA = "fake";
        final String REMOVE_BOOK = "remove";
        final String SEARCH = "search";

        boolean running = true;
        System.out.println("===WELCOME TO JOSEPH LIBRARY===");
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (running)
        {
            System.out.print("enter your command: ");
            String input = scanner.nextLine();
            libraryWait();
            switch (input) {
                case REMOVE_BOOK:
                    System.out.println(">>>Remove Book by Title: ");
                    System.out.print(">>>");
                    String inputToRemove = scanner.nextLine();
                    for (Book b : library.getAllBooks()) {
                        if (b.getTitle().equalsIgnoreCase(inputToRemove)) {
                            library.removeBook(b);
                            break;
                        }
                    }
                    break;
                case ADD_BOOK:
                    System.out.println(">>>Add a book:");
                    Book book = new Book();
                    System.out.print(">>>enter title: ");
                    book.setTitle(scanner.nextLine());
                    System.out.print(">>>enter author: ");
                    book.setAuthor(scanner.nextLine());
                    System.out.print(">>>enter year: ");
                    String year = scanner.nextLine();
                    try {
                        book.setYear(Integer.parseInt(year));
                    } catch (NumberFormatException e) {
                        System.out.println("Input year was not digits. Please be more careful.");
                        System.out.println("Using zero.");
                        book.setYear(0);
                    }
                    System.out.print("enter ISBN: ");
                    book.setISBN(scanner.nextLine());
                    library.addBook(book);
                    System.out.println("Book add complete: " + book);
                    System.out.println();
                    break;
                case FAKE_DATA:
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
                    break;
                case HELP:
                    System.out.println("help menu: ");
                    System.out.println(HELP + ": this help menu");
                    System.out.println(LIST + ": list books");
                    System.out.println(ADD_BOOK + ": add a book");
                    System.out.println(REMOVE_BOOK + ": remove a book");
                    System.out.println("quit, exit, q: Quit Library");
                    break;
                case LIST:
                    if (library.getAllBooks().size() == 0)
                    {
                        System.out.println("There are no books added yet.");
                    }
                    else {
                        System.out.println("Listing " + library.getAllBooks().size() + " books:");
                        for (Book b : library.getAllBooks()) {
                            System.out.println(b.toString());
                        }
                    }
                    break;
                case SEARCH:
                    System.out.print(">>>enter title: ");
                    String searchvalue = (scanner.nextLine());
                    boolean found = false;
                    for (Book b : library.getAllBooks())
                    {
                        if (b.getTitle().equalsIgnoreCase(searchvalue))
                        {
                            System.out.println("BOOK FOUND:  " + b.toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                    {
                        System.out.println("Sorry, could not find a book with title " + searchvalue);
                    }
                    break;
                case "exit":
                case "quit":
                case "q":
                    System.out.println("Exiting ...");
                    libraryWait();
                    running = false;
                    break;
                default:
                    System.out.println("unknown command " + input + ". type 'help' for command list.");
                    break;
            }
        }
        scanner.close();
    }

    public static void libraryWait()
    {
        try
        {
            Thread.sleep(250);
        }
        catch (Exception e)
        {
            //do nothing
        }
    }
}