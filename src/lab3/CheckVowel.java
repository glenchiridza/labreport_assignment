package lab3;

import java.util.Scanner;

/**
 * Created by glenc on Aug 2021
 **/
public class CheckVowel {

    public static void main(String[] args) {

        System.out.println("Please input a character to check if its either vowel or consonants");
        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        char vc = input.next().charAt(0);

        String vowel_or_consonant =
                (vc=='a' || vc=='e' || vc=='i'
                        || vc=='o' ||vc=='u')?"vowel" : "Consonant";

        System.out.println(vc + " is a " + vowel_or_consonant);



    }

}
