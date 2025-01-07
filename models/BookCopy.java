package models;

import java.util.List;

public class BookCopy {
    private final String id;
    private final String name;
    private final List<String> authors;
    private final String publisher;

    public BookCopy(String id, String name, List<String> authors, String publisher) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }
}
