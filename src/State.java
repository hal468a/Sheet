public abstract class State {
    public Sheet sheet;
    protected String state_name;
    public abstract void changeValue(int row, int col, String operation);
    public abstract void printSheet();
}
