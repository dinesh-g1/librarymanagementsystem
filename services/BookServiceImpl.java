package services;

import models.BookCopy;
import models.BookDetails;

public class BookServiceImpl implements BookService{

    @Override
    public void addBook(BookCopy bookCopy) {
        System.out.println("Added to database");
    }

    @Override
    public void deleteBook(String bookCopyId) {
        System.out.println("Deleted the book from database.");
    }
}
