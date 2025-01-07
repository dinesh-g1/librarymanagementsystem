package Utils;

public class UniqueIDGenerator {
    private static int id = 0;
    private UniqueIDGenerator() {}
    public static String getUniqueID() {
        id++;
        return String.valueOf(id);
    }
}
