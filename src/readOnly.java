import java.util.Arrays;

public class readOnly extends State{

    @Override
    public void changeValue(int row, int col, String operation) {
        System.out.println("System: Access denied!");
    }

    @Override
    public void printSheet(String sheet_name) {
        System.out.println(Arrays.deepToString(this.sheet.content));
    }
}
