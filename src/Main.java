public class Main {
    public static void main(String[] args) {
        Author jackKerouac = new Author( "Jack", "Kerouac");
        Author iosifBrodsky = new Author("Iosif", "Brodsky");
        Book onTheRoad = new Book("On the Road", jackKerouac, "1951");
        System.out.println("Название книги:" + onTheRoad.getTitle() + " Автор:" + onTheRoad.getAuthor().getFullName()
        + " Дата:" + onTheRoad.getPublicationYear());
    }
}