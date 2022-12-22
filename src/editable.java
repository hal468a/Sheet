import java.util.Arrays;

public class editable extends State {

    public editable(Sheet sheet)
    {
        this.sheet = sheet;
        this.sheet.state = this;
        this.state_name = "Editable";
    }

    @Override
    public void changeValue(int row, int col, String operation) {
        double sum = 0;
        if(operation.contains("+")){
            for(String str: operation.split("\\+")){
                sum += Double.parseDouble(str);
            }
        }

        if(operation.contains("-")){
            String y[] = operation.split("\\-");
            sum = 2*Double.parseDouble(y[0]);
            for(String str: operation.split("\\-")){
                sum -= Double.parseDouble(str);
            }
        }

        if(operation.contains("*")){
            sum = 1;
            for(String str: operation.split("\\*")){
                sum *= Double.parseDouble(str);
            }
        }

        if(operation.contains("/")){
            String y[] = operation.split("\\/");
            sum = Double.parseDouble(y[0]) * Double.parseDouble(y[0]);
            for(String str: operation.split("\\/")){
                sum /= Double.parseDouble(str);
            }
        }
        this.sheet.content[row][col] = sum;
        printSheet();
    }

    @Override
    public void printSheet() {
        System.out.println(Arrays.deepToString(this.sheet.content));
    }
}
