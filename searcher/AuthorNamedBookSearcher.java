package searcher;

import models.BookCopy;

import java.util.List;

public class AuthorNamedBookSearcher implements BookSearcher {
    private final List<String> authorNames;

    public AuthorNamedBookSearcher(List<String> authorNames) {
        this.authorNames = authorNames;
    }

    @Override
    public List<BookCopy> search() {
        return List.of();
    }
}
