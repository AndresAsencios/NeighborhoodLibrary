package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Book[] books = {
                // YOUR FAVORITES
                new Book(1, "9780679720201", "The Stranger"),
                new Book(2, "9780140186390", "East of Eden"),
                new Book(3, "9780140187397", "The Red Pony"),
                new Book(4, "9781594634024", "The Girl on the Train"),
                new Book(5, "9780811204811", "No Longer Human"),
                new Book(6, "9780393321982", "Strangers on a Train"),
                new Book(7, "9780735211292", "Atomic Habits"),
                new Book(8, "9780593716625", "The Art of Spending Money"),
                new Book(9, "9781421590561", "Tomie"),
                new Book(10, "9780553213690", "The Metamorphosis"),
                new Book(11, "9781524759780", "Recursion"),
                new Book(12, "9780060850524", "Brave New World"),
                new Book(13, "9780679732761", "The Trial"),
                new Book(14, "9780679734772", "The Plague"),
                new Book(15, "9780679734505", "Crime and Punishment"),
                new Book(16, "9780307743657", "The Shining"),
                new Book(17, "9781421561325", "Uzumaki"),
                new Book(18, "9781101904220", "Dark Matter"),
                new Book(19, "9780451524935", "1984"),
                new Book(20, "9780307387899", "The Road")
        };
        // Display options
        int choice = 0;

        while (choice != 3) {
            System.out.println();
            System.out.println("Welcome to Neighborhood Library!");
            System.out.println("-------------------------------");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.println("-------------------------------");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(read.nextLine());

            switch (choice) {
                case 1:
                    showAvailableBooks(books, read);
                    break;

                case 2:
                    showCheckedOutBooks(books, read);
                    break;

                case 3:
                    System.out.println("Farewell!");
                    break;

                default:
                    System.out.println("Invalid option. Try Again.");
                    break;
            }

        }
    }

    public static void showAvailableBooks(Book[] books, Scanner read) {
        for (Book currentBook : books) {
            if (!currentBook.isCheckedOut()) {
                System.out.printf("%d. %s | ISBN: %s%n",
                        currentBook.getBookId(),
                        currentBook.getBookTitle(),
                        currentBook.getIsbn());

            }
        }

        System.out.println();
        System.out.print("Enter a Book ID to check out (0 to return): ");
        int selectedBookId = Integer.parseInt(read.nextLine());

        if (selectedBookId == 0) {
            return;
        }
        for (Book currentBook : books) {
            if (currentBook.getBookId() == selectedBookId) {

                if (currentBook.isCheckedOut()) {
                    System.out.println("Sorry, this book is checked out.");
                    return;
                }
                System.out.println("You selected " + currentBook.getBookTitle());

                String borrowerName = "";

                while (borrowerName.isBlank()) {
                    System.out.print("Enter your name: ");
                    borrowerName = read.nextLine();


                    if (borrowerName.isBlank()) {
                        System.out.println("Invalid name. Please Enter your name.");
                        return;
                    }
                }

                currentBook.checkOut(borrowerName);

                if(currentBook.isCheckedOut()
                    && borrowerName.equals(currentBook.getCheckOutTo())) {

                    System.out.println("Success! You checked out: " + currentBook.getBookTitle());
                } else {
                    System.out.println("Check failed. Please try again.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");

    }

    public static void showCheckedOutBooks(Book[] books, Scanner read) {

        System.out.println();
        System.out.println("Checked Out Books:");
        System.out.println("---------------------------");

        for (Book currentBook : books) {
            if (currentBook.isCheckedOut()) {
                System.out.printf("%d. ISBN: %s | %s | Borrowed by: %s%n",
                        currentBook.getBookId(),
                        currentBook.getIsbn(),
                        currentBook.getBookTitle(),
                        currentBook.getCheckOutTo());
            }
        }
        System.out.println();
        System.out.print("Enter book ID to check in (0 to return): ");
        int selectedBookId = Integer.parseInt(read.nextLine());

        if (selectedBookId == 0) {
            return;
        }

        // Check in loop
        for (Book currentBook : books) {
            if (currentBook.getBookId() == selectedBookId) {

                if (currentBook.isCheckedOut()) {
                    currentBook.checkIn();
                    System.out.println("Successfully returned!: " + currentBook.getBookTitle());
                    return;
                }
                System.out.println("This book is not checked out.");
                return;
            }
        }
        System.out.println("Book ID not found.");

    }
}



