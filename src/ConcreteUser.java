import java.util.Arrays;

public class ConcreteUser extends User{

    // ----------- Constructor -----------
    public ConcreteUser(String n)
    {
        user_name = n;
        System.out.println("System: Create user " + user_name);
    }

    // ------------ Method --------------
    @Override
    protected void createSheet(String name) {
        Sheet sheet = new ConcreteSheet(name);
        sheet.setOwner(this);
        sheets.put(name, sheet);
    }
}
