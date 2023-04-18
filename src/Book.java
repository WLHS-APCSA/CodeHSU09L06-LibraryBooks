public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    
    public String toString(){
        return "Title: " + title + "\n" + "Author: " + author + "\n";
    }
}
