package services;

import models.BookCopy;
import models.BookDetails;

public interface BookService {
   void addBook(BookCopy bookCopy);
   void deleteBook(String bookCopyId);
}
