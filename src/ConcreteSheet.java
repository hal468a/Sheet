public class ConcreteSheet extends Sheet{
    // ------------ Attribute ------------

    // ----------- Constructor -----------.
    public ConcreteSheet(String name) {
        this.sheet_name = name;
        this.state = new readOnly();
    }

    // ------------ Method --------------
    @Override
    public void setOwner(User owner) {
        this.Owner = owner;
    }

    @Override
    protected void setState(State state) {
        this.state = state;
    }

    @Override
    protected State getState() {
        return state;
    }
}
