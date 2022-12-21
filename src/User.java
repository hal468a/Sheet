import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class User {
    // ------------ Attribute --------------
    protected String user_name;
    protected HashMap<String, Sheet> sheets = new HashMap<String, Sheet>();

    // ------------ Method --------------
    protected abstract void createSheet(String name);
    protected abstract void printSheet(String sheet_name);
    protected abstract void changeValue(String sheet_name, int row, int col, String operation);
}
