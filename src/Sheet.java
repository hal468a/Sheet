import java.util.HashMap;

public class Sheet {
    // Attribute
    public String sheet_name;
    public User Owner;
    public HashMap<String, User> other_user_list = new HashMap<String, User>();

    protected final State read = new readOnly(this);
    protected final State edit = new editable(this);

    protected State state;
    public double[][] content = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    // ----------- Constructor -----------.
    public Sheet(String name) {
        this.sheet_name = name;
        this.state = edit;
    }

    // ------------ Method --------------
    public void setOwner(User owner) {
        this.Owner = owner;
    }

    protected void setState(String state) {
        if(state.equals("ReadOnly")){
            this.state = read;
        } else if(state.equals("Editable")) {
            this.state = edit;
        } else {
            System.out.println("System: State Error!");
        }
    }
}
