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

    @Override
    protected void share(String sheet_name, String otherUser, User other) {
        this.sheets.get(sheet_name).other_user_list.put(otherUser, other);
        System.out.println("Share " + user_name + "'s " + sheet_name + " with " + other.user_name);
    }
}
