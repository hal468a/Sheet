import java.util.ArrayList;
import java.util.HashMap;

public abstract class Sheet {
    public String sheet_name;
    public User Owner;
    public HashMap<String, User> other_user_list = new HashMap<String, User>();

    public State state;
    public double[][] content = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    public abstract void setOwner(User owner);
}
