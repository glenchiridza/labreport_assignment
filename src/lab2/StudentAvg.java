package lab2;

import java.util.Arrays;

/**
 * Created by glenc on Aug 2021
 **/
public class StudentAvg {
    public static void main(String[] args) {

        String[] students = {"Glen","Stan","Michael","'Logic","Munyaradzi"};
        int [] ages = {23,24,21,22,19};

        System.out.print("Name: ");
        for (String item: students)
            System.out.print(item+"\t");
        System.out.println("");

        System.out.print("Age :");
        for (int age: ages)
            System.out.print(String.format("%3d \t",age));

        System.out.println("\n\nAverage age :");
        System.out.println(
                averagingInt(ages)
        );
    }

    public static double averagingInt(int [] ages){
        double sum = 0;
        for (int age : ages){
            sum += age;
        }


        return (sum / ages.length);
    }
}
