package lab1;

import java.util.Scanner;

/**
 * Created by glenc on Jun 2021
 **/
public class ReadNumbers {

    public static void main(String[] args) {

        System.out.println("Please type in number");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        System.out.println("you entered the number: "+num);

    }
}
