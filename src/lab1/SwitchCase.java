package lab1;

import java.util.Scanner;

/**
 * Created by glenc on Jun 2021
 **/
public class SwitchCase {
    public static void main(String[] args) {

        System.out.println("Please enter student Grade from A B C D E F");
        Scanner input =  new Scanner(System.in);
        String val = input.next();
        switch (val){

            case "A":
                System.out.println("got grade A");
                break;
            case "B":
                System.out.println("got grade B");
                break;
            case "C":
                System.out.println("got grade C");
                break;
            case "D":
                System.out.println("got grade D");
                break;
            case "E":
                System.out.println("got grade E");
                break;
            case "F":
                System.out.println("got grade F");
                break;
            default:
                System.out.println("wrong grade value, exiting system");

        }

    }
}
