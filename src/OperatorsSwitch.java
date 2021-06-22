import java.util.Scanner;

/**
 * Created by glenc on Jun 2021
 **/
public class OperatorsSwitch {
    public static void main(String[] args) {

        int val2 = 2;
        int val3 = 3;

        System.out.println("Choose arithmetic operation from \n Addition[+] Subtration [-] Division [/] Multiplication [*]");
        Scanner input = new Scanner(System.in);
        char operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("sum = "+(val2 + val3));
                break;
            case '-':
                System.out.println("subtraction = "+(val2 - val3));
                break;
            case '/':
                System.out.println("division = "+(val2 / val3));
                break;
            case '*':
                System.out.println("multiplication = "+(val2 * val3));
                break;
            default:
                System.out.println("operator not defined, try again");

        }
    }
}
