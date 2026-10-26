# Neighborhood Library 

A Java console-based library management application that allows users to browse available books, check out books, and return borrowed books.

This project was developed as part of my Java programming coursework to practice Object-Oriented Programming (OOP), arrays, loops, methods, conditional statements, and user input.

## Features

- **View Available Books:** Browse books currently available for checkout.
- **View Checked-Out Books:** See borrowed books and the names of their borrowers.
- **Check Out Books:** Select a book by ID and enter a borrower's name.
- **Return Books:** Check in a borrowed book and make it available again.
- **Input Validation:** Prevent empty borrower names, duplicate checkouts, and invalid book IDs.
- **Interactive Menu:** Navigate the library using a console-based menu.

## Technologies Used

- Java 17
- IntelliJ IDEA
- Maven
- Git and GitHub

## Project Structure

```text
NeighborhoodLibrary/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── pluralsight/
                    ├── Book.java
                    └── NeighborhoodLibrary.java
```

### Book.java

Represents an individual book and stores its information, including:

- Book ID
- ISBN
- Book title
- Checkout status
- Borrower's name

Contains the constructor, getters, setters, and `checkOut()` and `checkIn()` methods.

### NeighborhoodLibrary.java

Contains the main application logic, including:

- An array of 20 books
- An interactive menu
- Displaying available and checked-out books
- Searching for books by ID
- Processing checkouts and returns

## How to Run

1. Clone or download the project from GitHub.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 17 is installed and configured.
4. Open `NeighborhoodLibrary.java`.
5. Run the `main()` method.
6. Follow the console menu to interact with the library.

## Example Console Output

```text
Welcome to Neighborhood Library!
-------------------------------
1. Show Available Books
2. Show Checked Out Books
3. Exit
-------------------------------
Enter your choice: 1

1. The Stranger | ISBN: 9780679720201
2. East of Eden | ISBN: 9780140186390
3. The Red Pony | ISBN: 9780140187397

Enter a Book ID to check out (0 to return): 1
You selected The Stranger
Enter your name: Alex
Success! You checked out: The Stranger
```

## Java Concepts Practiced

**Object-Oriented Programming (OOP):** Created a `Book` class to represent books as individual objects.

**Encapsulation:** Used private fields and public methods to manage book information and checkout status.

**Arrays:** Stored and managed a collection of 20 `Book` objects.

**Loops:** Used `for` loops to search and display books, and `while` loops to repeat menus and validate input.

**Conditional Statements:** Used `if`, `else`, and `switch` statements to control application behavior.

**Scanner:** Collected user input through the Java console.

**Methods:** Organized application functionality into reusable methods.

## Future Improvements

- Add the ability to search books by title or ISBN.
- Allow new books to be added to the library.
- Save checkout information so it persists after closing the application.
- Improve error handling for nonnumeric user input.
- Add due dates for borrowed books.
- Create a graphical user interface (GUI).

## Project Purpose

The goal of this project was to strengthen my understanding of Java fundamentals and Object-Oriented Programming while developing a practical application.

Through this project, I gained experience managing objects, organizing methods, validating user input, and building interactive console applications.