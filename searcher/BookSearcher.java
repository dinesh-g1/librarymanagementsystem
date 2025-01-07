package searcher;

import models.BookCopy;

import java.util.List;

public interface BookSearcher {
    List<BookCopy> search();
}
