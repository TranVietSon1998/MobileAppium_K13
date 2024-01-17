package labs.lab14;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int year;

    public Book(String ISBN, String title, String author, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "ISBN=" + ISBN + '\n' +
                        "Title=" + title + '\n' +
                        "Author=" + author + '\n' +
                        "Year=" + year;
    }
}
