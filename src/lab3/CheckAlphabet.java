package lab3;

import java.util.Scanner;

/**
 * Created by glenc on Aug 2021
 **/
public class CheckAlphabet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input single character to check: ");
        char b = input.next().charAt(0);
        int a = 0;
        while(a <= 127){

            if (a== (int) b) {
                System.out.format("%c is in english alphabet", b);
                break;
            }
            a++;
        }
    }
}
