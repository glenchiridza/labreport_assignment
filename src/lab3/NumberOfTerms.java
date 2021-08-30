package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class NumberOfTerms {
    public static void main(String[] args) {

        int num =100;
        int c1 = 0;
        int c2 = 1;

        System.out.println("Fibonacci Series Upto "+100);
        while(c1 <= num){
            System.out.print(c1 + "+ ");
            int sum = c1 +c2;
            c1 = c2;
            c2 = sum;
        }

    }
}
