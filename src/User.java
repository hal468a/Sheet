import java.util.HashMap;

public abstract class User {
    // ------------ Attribute --------------
    protected String user_name;
    protected HashMap<String, Sheet> sheets = new HashMap<String, Sheet>();

    // ------------ Method --------------
    protected abstract void createSheet(String name);
    protected abstract void share(String sheet_name, String otherUser, User other);
}
