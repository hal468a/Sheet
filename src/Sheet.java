import java.util.HashMap;

public abstract class Sheet {
    // Attribute
    public String sheet_name;
    public User Owner;
    public HashMap<String, User> other_user_list = new HashMap<String, User>();

    protected final State read = new readOnly(this);
    protected final State edit = new editable(this);

    protected State state;
    public double[][] content = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    // Method
    public abstract void setOwner(User owner);
    protected abstract void setState(String state);
}
