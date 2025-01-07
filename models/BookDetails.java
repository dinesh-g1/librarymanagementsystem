package models;

import java.util.List;

public class BookDetails {
    private final String bookName;
    private final List<String> authorNames;
    private final String publisher;


    public BookDetails(String bookName, List<String> authorNames, String publisher) {
        this.bookName = bookName;
        this.authorNames = authorNames;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public List<String> getAuthorNames() {
        return authorNames;
    }

    public String getPublisher() {
        return publisher;
    }
}
