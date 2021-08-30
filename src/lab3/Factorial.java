package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class Factorial {

    public static void main(String[] args) {
        int num = 20;
        long factorial = 1;
        for (int i =0;i<num;i++){
            factorial *= i;
        }

        System.out.println("Factorial of "+num+" = "+factorial);
    }
}

