package models;

import java.util.List;

public class Member {
    private final String id;
    private final String name;
    private List<BookCopy> rentedBooks;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<BookCopy> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<BookCopy> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }
}
