import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, User> users = new HashMap<String, User>();

        String owner, sheet_name;

        while(true) {
            System.out.println("---------------Menu---------------\n" +
                               "1. Create a user\n" +
                               "2. Create a sheet\n" +
                               "3. Check a sheet\n" +
                               "4. Change a value in a sheet\n" +
                               "5. Change a sheet's access right.\n" +
                               "6. Collaborate with an other user\n" +
                               "----------------------------------");
            System.out.print("> ");

            switch (sc.nextLine())
            {
                case "1":
                    // create user
                    System.out.print("> ");
                    String name = sc.nextLine();

                    User user = new ConcreteUser(name);
                    users.put(name, user);
                    break;
                case "2":
                    //Create sheet
                    System.out.print("> ");
                    owner = sc.next();
                    sheet_name = sc.nextLine();

                    users.get(owner).createSheet(sheet_name);
                    System.out.println("System: Create a sheet named" + users.get(owner).sheets.get(sheet_name).sheet_name + " for " + users.get(owner).sheets.get(sheet_name).Owner.user_name);
                    break;

                case "3":
                    //printSheet
                    System.out.print("> ");
                    owner = sc.next();
                    sheet_name = sc.nextLine();

                    users.get(owner).printSheet(sheet_name);
                    break;
                case "4":
                    //Change sheet value
                    System.out.print("> ");
                    owner = sc.next();
                    sheet_name = sc.nextLine();

                    users.get(owner).printSheet(sheet_name);

                    System.out.print("> ");
                    int row = sc.nextInt();
                    int col = sc.nextInt();
                    String op = sc.nextLine();

                    users.get(owner).changeValue(sheet_name, row, col, op);
                    users.get(owner).printSheet(sheet_name);
                    break;
                case "5":
                    //Change sheet rights

                    break;
                case "6":
                    //Share with other user
                    break;
                default:
                    System.out.println("System: Please enter a number and try again!");
                    break;
            }
        }
    }
}