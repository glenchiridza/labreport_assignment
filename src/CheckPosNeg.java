import java.util.Scanner;

/**
 * Created by glenc on Jun 2021
 **/
public class CheckPosNeg {

    public static void main(String[] args) {

        System.out.println("checking if a number if positive or negative\n");

        System.out.println("Enter number to check: ");
        Scanner inputValue = new Scanner(System.in);
        int value = inputValue.nextInt();

        if (value > 0){
            System.out.println("number is a positive number");
        }
        else if (value < 0){
            System.out.println("number is a negative number");
        }
        else {
            System.out.println("number is not positive or negative");
        }
    }
}
