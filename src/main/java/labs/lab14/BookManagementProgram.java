package labs.lab14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookManagementProgram {
    private List<Book> bookList = new ArrayList<>();

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("======= Book Management Program (CRUD) ========");
            System.out.println("1. New book");
            System.out.println("2. Find a book(ISBN)");
            System.out.println("3. Update a book");
            System.out.println("4. Delete a book");
            System.out.println("5. Print the book list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    findBookByISBN();
                    break;
                case 3:
                    updateBookByISBN();
                    break;
                case 4:
                    deleteBookByISBN();
                    break;
                case 5:
                    printBookList();
                    break;


            }

        } while (choice != 0);
    }

    private void addNewBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input ISBN: ");
        String ISBN = scanner.nextLine();

        System.out.print("Please input title: ");
        String title = scanner.nextLine();

        System.out.print("Please input author: ");
        String author = scanner.nextLine();

        System.out.print("Please input year: ");
        int year = scanner.nextInt();

        Book newBook = new Book(ISBN, title, author, year);
        bookList.add(newBook);

        System.out.println("The book is saved into the database.");
    }

    private void findBookByISBN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input ISBN: ");
        String searchISBN = scanner.nextLine();

        boolean bookFound = false;

        for (Book book : bookList) {
            if (book.getISBN().equals(searchISBN)) {
                System.out.println(book);
                bookFound = true;
                break;  // Stop searching once the book is found
            }
        }

        if (!bookFound) {
            System.out.println("Book with ISBN " + searchISBN + " is not found.");
        }
    }

    private void updateBookByISBN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input ISBN: ");
        String searchISBN = scanner.nextLine();

        boolean bookFound = false;

        for (Book book : bookList) {
            if (book.getISBN().equals(searchISBN)) {
                System.out.print("Please input new title: ");
                String newTitle = scanner.nextLine();
                book.setTitle(newTitle);

                System.out.print("Please input new author name: ");
                String newAuthor = scanner.nextLine();
                book.setAuthor(newAuthor);

                System.out.print("Please input new year: ");
                int newYear = scanner.nextInt();
                book.setYear(newYear);

                System.out.println("The book is now updated with new content: " + book);
                bookFound = true;
                break;  // Stop searching once the book is found and updated
            }
        }

        if (!bookFound) {
            System.out.println("Book with ISBN " + searchISBN + " is not found.");
        }
    }

    private void deleteBookByISBN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input ISBN: ");
        String searchISBN = scanner.nextLine();

        Iterator<Book> iterator = bookList.iterator();
        boolean bookFound = false;

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN().equals(searchISBN)) {
                iterator.remove();
                System.out.println("The book is deleted: " + book);
                bookFound = true;
                break;  // Stop searching once the book is found and deleted
            }
        }

        if (!bookFound) {
            System.out.println("Book with ISBN " + searchISBN + " is not found.");
        }
    }

    private void printBookList() {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty.");
        } else {
            System.out.println("Book List:");
            int index = 1;
            for (Book book : bookList) {
                System.out.println("Book " + String.format("%02d", index) + ": " + book.getTitle());
                System.out.println(book);
                System.out.println();
                index++;
            }
        }
    }

    public static void main(String[] args) {
        BookManagementProgram program = new BookManagementProgram();
        program.run();


    }
}
