package models;

public class BookCopy {
    private final String id;
    private final BookDetails bookDetails;

    public BookCopy(String id, BookDetails bookDetails) {
        this.id = id;
        this.bookDetails = bookDetails;
    }

    public String getId() {
        return id;
    }

}
