import models.BookCopy;
import models.BookDetails;
import models.Member;

import java.util.List;

public class InitialAPIDesign {
    public List<BookCopy> searchBooksByBookName(String bookName) {
       throw new UnsupportedOperationException("Not implemented");
    }
    public List<BookCopy> searchBooksByAuthorNames(List<String> authorNames) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public List<Member> searchMembersByMemberName(String memberName) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public void addBook(BookDetails bookDetails, String adminToken) {}
    public void deleteBook(String bookCopyId, String adminToken) {}
    public void blockMember(String memberId, String adminToken) {}
    public String issueBook(String memberId, String bookCopyId, String adminToken) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public void submitBook(String memberId, String bookCopyId, String adminToken) {}
    public Member getBorrowerOfBook(String bookCopyId, String adminToken){
        throw new UnsupportedOperationException("Not implemented");
    }
    public List<BookCopy> getBooksBorrowedByMember(String memberId, String adminToken) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
