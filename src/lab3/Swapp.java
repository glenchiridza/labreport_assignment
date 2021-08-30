package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class Swapp {

    public static void main(String[] args) {

        System.out.println("Swapping Numbers");

        int a = 7;
        int b = 10;

        System.out.println("Before swapping");
        System.out.format("a = %d, b = %d",a,b);

        a -=b;
        b +=a;
        a = b - a;

        System.out.println("\nAfter swapping");
        System.out.format("a = %d, b = %d",a,b);


    }

}
