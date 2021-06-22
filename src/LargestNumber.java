import java.util.Scanner;

/**
 * Created by glenc on Jun 2021
 **/
public class LargestNumber {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int v1 = inputValue.nextInt();

        System.out.println("Enter 2nd number");
        int v2 = inputValue.nextInt();

        System.out.println("the largest number is: ");

        int maxValue = v1;

        if (maxValue < v2){
            maxValue = v2;
            System.out.println(maxValue);
        }else {
            System.out.println(maxValue);
        }

    }
}
