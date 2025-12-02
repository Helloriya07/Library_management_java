package LibraryManagement;

public class Book {
   private int id;
    private String title;
    private  String author;
    private String category;
    private int publishedYear;
    private boolean isIssued;

    public Book(int id, String title,String author,String category,int publishedYear){
        this.id=id;
        this.title=title;
        this.author = author;
        this.category = category;
        this.publishedYear = publishedYear;
        this.isIssued = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publishedYear=" + publishedYear +
                ", isIssued=" + isIssued +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }
}
