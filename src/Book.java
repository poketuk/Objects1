public class Book {
private final String title;
private final Author author;
private int publicationYear;


    public Book(String title, Author author, String i) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() { return this.title; }

    public Author getAuthor() { return this.author; }

    public int getPublicationYear() { return this.publicationYear; }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
