🧩 Assignment: Modular Library Management System (Starter Edition)
🎯 Objective:

Build a modular Java application to manage a simple library system. It should allow:

    Adding books

    Viewing all books

    Searching books by title

You must structure the project using:

    module-info.java

    Proper use of packages

    A clear main method with entry point

📁 Structure to Use

/library-app
├── /library.main
│   ├── module-info.java
│   └── com/example/library/Main.java
├── /library.model
│   ├── module-info.java
│   └── com/example/library/model/Book.java
├── /library.service
│   ├── module-info.java
│   └── com/example/library/service/LibraryService.java

🔧 Requirements

    Packages

        Use com.example.library.* naming conventions.

    Main Class

        Class with public static void main(String[] args) in Main.java.

        Instantiate LibraryService, add a few books, and print the book list.

    Book Class

        Properties: title, author, yearPublished.

        Constructor, getters, setters, toString.

    LibraryService

        Internal List<Book>.

        Methods: addBook(Book book), getAllBooks(), findBooksByTitle(String keyword).

    Modularization

        Each module must have a module-info.java file.

        Export model and service packages.

        library.main must requires the others.

🧠 What You’ll Practice from #1:

    main() method

    Package structure and naming

    Importing classes from other packages

    Creating and using modules (module-info.java)

    public vs package-private access
