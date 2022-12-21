public abstract class State {
    protected Sheet sheet;
    public abstract void changeValue(int row, int col, String operation);
    public abstract void printSheet(String sheet_name);
}
