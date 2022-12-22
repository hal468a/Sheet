public class ConcreteSheet extends Sheet{
    // ------------ Attribute ------------

    // ----------- Constructor -----------.
    public ConcreteSheet(String name) {
        this.sheet_name = name;
        this.state = edit;
    }

    // ------------ Method --------------
    @Override
    public void setOwner(User owner) {
        this.Owner = owner;
    }

    @Override
    protected void setState(String state) {
        if(state.equals("ReadOnly")){
            this.state = read;
        } else if(state.equals("Editable")) {
            this.state = edit;
        } else {
            System.out.println("System: State Error!");
        }
    }

    @Override
    public String getState() {
        return state.state_name;
    }
}
