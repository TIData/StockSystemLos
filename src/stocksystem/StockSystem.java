package stocksystem;

import domein.*;
import java.util.Scanner;

public class StockSystem {

    private DomeinController controller = new DomeinController();
    private Scanner choose = new Scanner(System.in);

    public static void main(String[] args) {
        new StockSystem().run();
    }

    private void run() {
        String action = askAction();
        String mes;
        while (!action.equalsIgnoreCase("end")) {
            mes = controller.voerOpdrachtUit(action.split(" "));
            System.out.print(mes);
            action = askAction();
        }
        choose.close();
    }

    private String askAction() {
        System.out.println("");
        System.out.println("-------------Usage:StockSystem    TaskName Arguments. Enter end to quit------------");
        System.out.println("Tasks:");
        System.out.println("   createProduct productname quantity");
        System.out.println("   updateQuantity productname quantity");
        System.out.println("   shipProduct productname");
        System.out.println("   showStock");       
        System.out.println("Enter task :");
        return choose.nextLine();
    }
}