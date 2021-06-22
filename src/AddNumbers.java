import java.util.Scanner;

/**
 * Created by glenc on Jun 2021
 **/
public class AddNumbers {

    public static void main(String[] args) {

        int v1;
        int v2;

        System.out.println("Enter two numbers to add: ");
        Scanner input = new Scanner(System.in);
        v1 = input.nextInt();
        v2 = input.nextInt();
        int sum = v1 + v2;
        System.out.println("The total is: "+sum);

    }
}
