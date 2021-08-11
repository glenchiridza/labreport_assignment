package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by glenc on Aug 2021
 **/
public class Quiz {
    static int points = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Programiz Quiz Game");


        String[] answers = {"T", "T", "F"};

        Scanner input = new Scanner(System.in);

        System.out.println("Answer the following questions \n");
        System.out.println("Java is an Object Oriented Language : T / F");
        String answer1 = input.next();
        if (answer1.equalsIgnoreCase("T"))
            points +=  1;
        System.out.println("Inheritance is the passing on of super class attributes to the subclass : T / F");
        String answer2 = input.next();
        if (answer2.equalsIgnoreCase("T"))
            points +=  1;
        System.out.println("Java is not platform independent : T / F");
        String answer3 = input.next();
        if (answer3.equalsIgnoreCase("F"))
            points +=  1;

        //print date of completion
        Date currentDate  = new Date();
        SimpleDateFormat format = new SimpleDateFormat("EEE dd/mm/yyyy HH:mm");
        String date = format.format(currentDate);

        System.out.println("Date :"+date + "\n Points: " + points);
        System.out.println("Your Answers:");
        System.out.println(answer1+ answer2 + answer3);
        System.out.println("Expected Answers:");
        System.out.println("T"+" T"+" F");

    }
}
