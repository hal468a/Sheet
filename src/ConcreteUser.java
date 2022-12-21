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

    @Override
    protected void printSheet(String sheet_name) {
        System.out.println(Arrays.deepToString(sheets.get(sheet_name).content));
    }

    @Override
    protected void changeValue(String sheet_name, int row, int col, String operation){
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
        sheets.get(sheet_name).content[row][col] = sum;
    }
}
