# 📚 Library Management System –  Java Project
A simple menu - driven library management project using java.
🚀 Features
1. Add a New Book
Allows the user to add a book with details like ID, title, author, category, published year, and issued status.

2. Remove a Book
Deletes a book from the list using the book ID.

3. Issue a Book
Marks a book as issued if it is available and not already issued.

4. Return a Book
Changes the book status from issued to available.

5. Search Book by Title
Searches books using Java Streams to filter titles (case-insensitive).

6. View All Books
Displays every book present in the library.

7. View Issued Books
Prints only the books that are currently issued.

🛠️ Tech Stack

Java 8+
OOP Concepts 
Collections Framework
List, ArrayList
Java Streams API
Filtering, mapping, searching
Loops & Control Statements
for, while, switch

#Project Structure
```
src/
│
├── Book.java
│   → Represents a book (id, title, author, category, year, isIssued)
│
├── LibraryService.java
│   → Contains methods:
│       addBook()
│       removeBook()
│       issueBook()
│       returnBook()
│       searchByTitle()
│       getAllBooks()
│       getIssuedBooks()
│
└── Main.java
    → Menu-driven logic using switch-case
```

9. Menu-Driven Interaction

The main class contains a switch-case menu for interacting with all features.
