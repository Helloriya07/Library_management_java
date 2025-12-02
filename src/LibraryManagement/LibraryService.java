package LibraryManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LibraryService {
    List<Book> books = new ArrayList<>();
    public boolean addBook(Book incomingBook){
        for(Book b : books) {
            if (b.getId() == incomingBook.getId()) {
                return false; //duplicate book found
            }
        }
        //no duplicate found
        books.add(incomingBook);
        return true;
        }


    public boolean removeBook(int id){
        for(int i =0;i<books.size();i++)
            if(books.get(i).getId()==id){
                books.remove(i);
               /* books.remove(b);
                Ye ConcurrentModificationException फेंक देगा.
               Enhanced for-loop internally iterator use करता है,
                  aur iterator के साथ list.remove() करना illegal है./*

                */
                return true;
            }

        return false;
    }

    public List<Book>searchByTitle(String title){
        if(title==null) return Collections.emptyList();
        return books.stream()
                .filter(b -> b.getTitle()!=null &&
                        b.getTitle().toLowerCase().contains(title.toLowerCase()))
                //here we are using partial search means
                // it will give result of all books matching with that word.
                .collect(Collectors.toList());

    }
    public boolean issueBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isIssued()) { //book already issued
                    return false;
                }
                b.setIssued(true);
                return true;     // book issued
            }
        }
        return false;    // no book found
    }


        public boolean returnBook(int bookId){
            for (Book b : books) {
                if (b.getId() == bookId) {   /// book mil gayi
                    if(!b.isIssued()){     // agar issued hi nahi thi
                        return false;      // return ka koi sense nahi
                    }
                    b.setIssued(false);    // THIS is the correct part
                    return true;           // return successfully completed
                }
            }
            return false;
        }

            public List<Book> getAllAvailableBooks(){
        return  books.stream()
                .filter(b->!b.isIssued())
                .collect(Collectors.toList());
    }
    public List<Book> getAllissuedBooks(){
        return  books.stream()
                .filter(b->b.isIssued())
                .collect(Collectors.toList());
    }



}
