import Utils.UniqueIDGenerator;
import models.BookCopy;
import models.BookDetails;
import models.Member;
import searcher.*;
import services.BookService;
import services.BookServiceImpl;
import userauthenticator.UserAuthenticator;

import java.util.List;

public class InitialAPIDesign {
    public List<BookCopy> searchBooksByBookName(String bookName) {
        //Validating the params should be first check
        if (bookName == null)
            throw new IllegalArgumentException("Book Name can't be null");
        BookSearcher nameBasedBookSearcher = new NameBasedBookSearcher(bookName);
        return nameBasedBookSearcher.search();
    }

    public List<BookCopy> searchBooksByAuthorNames(List<String> authorNames) {
        if (authorNames == null || authorNames.isEmpty())
            throw new IllegalArgumentException("Author names can't be null or empty");
        BookSearcher authorNamedBookSearcher = new AuthorNamedBookSearcher(authorNames);
        return authorNamedBookSearcher.search();
    }

    public List<Member> searchMembersByMemberName(String memberName, String adminToken) throws IllegalAccessException {
        if (!UserAuthenticator.isAdmin(adminToken))
            throw new IllegalAccessException("User is not admin");
        MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName);
        return memberSearcher.search();
    }

    public void addBook(BookDetails bookDetails, String adminToken) throws IllegalAccessException {
        if (!UserAuthenticator.isAdmin(adminToken))
            throw new IllegalAccessException("User is not admin");
        BookService bookService = new BookServiceImpl();
        BookCopy bookCopy = new BookCopy(UniqueIDGenerator.getUniqueID(), bookDetails);
        bookService.addBook(bookCopy);
    }

    public void deleteBook(String bookCopyId, String adminToken) throws IllegalAccessException {
        if (!UserAuthenticator.isAdmin(adminToken))
            throw new IllegalAccessException("User is not admin");
        BookService bookService = new BookServiceImpl();
        bookService.deleteBook(bookCopyId);
    }

    public void blockMember(String memberId, String adminToken) {}
    public String issueBook(String memberId, String bookCopyId, String adminToken) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void submitBook(String memberId, String bookCopyId, String adminToken) {

    }

    public Member getBorrowerOfBook(String bookCopyId, String adminToken){
        throw new UnsupportedOperationException("Not implemented");
    }

    public List<BookCopy> getBooksBorrowedByMember(String memberId, String adminToken) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
