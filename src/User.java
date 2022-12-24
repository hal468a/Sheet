import java.util.HashMap;

public class User{

    protected String user_name;
    protected HashMap<String, Sheet> sheets = new HashMap<String, Sheet>();

    // ----------- Constructor -----------
    public User(String n)
    {
        user_name = n;
        System.out.println("System: Create user " + user_name);
    }

    // ------------ Method --------------
    protected void createSheet(String name) {
        Sheet sheet = new Sheet(name);
        sheet.setOwner(this);
        sheets.put(name, sheet);
    }

    protected void share(String sheet_name, String otherUser, User other) {
        this.sheets.get(sheet_name).other_user_list.put(otherUser, other);
        System.out.println("Share " + user_name + "'s " + sheet_name + " with " + other.user_name);
    }
}