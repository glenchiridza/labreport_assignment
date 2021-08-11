package lab2;

/**
 * Created by glenc on Aug 2021
 **/
public class ConcatStrings {
    public static void main(String[] args) {
        String name = " Glen ";
        String surname = "Chiridza";

        System.out.println("before concat");
        System.out.println(name);
        System.out.println(surname);

        //concat
        String fullName = name.concat(surname);
        System.out.println("\nafter concat");
        System.out.println(fullName);

    }
}
