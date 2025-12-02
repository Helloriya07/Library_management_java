import LibraryManagement.Book;
import LibraryManagement.LibraryService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LibraryService lb = new LibraryService();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("========LIBERARY MANAGEMENT SYSTEM=======");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search by title");
            System.out.println("4. Issue  Book");
            System.out.println("5. Return Book");
            System.out.println("6. View All Available Book");
            System.out.println("7. Viw All Issued Book");
            System.out.println("8. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter book id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Title:");
                    String title = sc.nextLine();

                    System.out.println("Enter Author:");
                    String author = sc.nextLine();

                    System.out.println("Enter Category:");
                    String category = sc.nextLine();

                    System.out.println("Enter Published Year:");
                    int year = sc.nextInt();
                    Book book = new Book(id, title, author, category, year);

                    if (lb.addBook(book)) {
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println("Book ID already exists!");
                    }
                    break;
                case 2:
                    System.out.println("Enter Book ID to Remove:");
                    int removeId = sc.nextInt();
                    if (lb.removeBook(removeId)) {
                        System.out.println("Book removed!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 3:
                    System.out.println("Enter Title to Search:");
                    String searchTitle = sc.nextLine();
                    List<Book> results = lb.searchByTitle(searchTitle);
                    if (results.isEmpty()) {
                        System.out.println("No matching books found.");
                    } else {
                        results.forEach(System.out::println);
                    }
                    break;

                case 4:
                    System.out.println("Enter Book ID to Issue:");
                    int issueId = sc.nextInt();
                    if (lb.issueBook(issueId)) {
                        System.out.println("Book issued successfully!");
                    } else {
                        System.out.println("Book already issued OR not found!");
                    }
                    break;

                case 5:
                    System.out.println("Enter Book ID to Return:");
                    int returnId = sc.nextInt();
                    if (lb.returnBook(returnId)) {
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Book was not issued OR not found!");
                    }
                    break;

                case 6:
                    System.out.println("Available Books:");
                    lb.getAllAvailableBooks().forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Issued Books:");
                    lb.getAllissuedBooks().forEach(System.out::println);
                    break;

                case 8:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}











