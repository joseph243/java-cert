package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String HELP = "help";
        String LIST = "list";
        String ADD_BOOK = "add";

        boolean running = true;

        while (running)
        {
            Library library = new Library();
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter your command: ");
            String input = scanner.nextLine();
            libraryWait();



            if (input.equals("help"))
            {
                System.out.println("command list: ");
                System.out.println(HELP + ": this help menu.");
                System.out.println(LIST + ": list books.");
                System.out.println(ADD_BOOK + ": add a book");
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