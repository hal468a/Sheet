import java.util.HashMap;

public abstract class Sheet {
    public String sheet_name;
    public User Owner;
    public HashMap<String, User> other_user_list = new HashMap<String, User>();
    protected State state;
    public double[][] content = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    public abstract void setOwner(User owner);

    protected abstract void setState(State state);
    protected abstract State getState();
}
