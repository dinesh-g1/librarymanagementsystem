package userauthenticator;

public class UserAuthenticator {
    private UserAuthenticator() {}

    public static boolean isAdmin(String token) {
        return false;
    }
    public static boolean isMember(String token) {
        return true;
    }
}
