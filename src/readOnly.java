import java.util.Arrays;

public class readOnly extends State{

    public readOnly(Sheet sheet)
    {
        this.sheet = sheet;
        this.sheet.state = this;
        this.state_name = "ReadOnly";
    }

    @Override
    public void changeValue(int row, int col, String operation) {
        System.out.println("System: This sheet is not accessible!");
    }

    @Override
    public void printSheet() {
        System.out.println(Arrays.deepToString(this.sheet.content));
    }
}
