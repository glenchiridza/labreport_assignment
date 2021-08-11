package lab1;

import java.util.Scanner;

/**
 * Created by glenc on Jun 2021
 **/
public class MultiplyNumbers {

    public static void main(String[] args) {

        int v1;
        int v2;

        System.out.println("Enter two numbers to multiply: ");
        Scanner input = new Scanner(System.in);
        v1 = input.nextInt();
        v2 = input.nextInt();
        int product = v1 * v2;
        System.out.println("The product is: "+product);


    }
}
