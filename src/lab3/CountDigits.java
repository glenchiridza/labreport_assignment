package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class CountDigits {

    public static void main(String[] args) {
        int count = 0;
        int num = 123456789;

        while(num !=0){
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits in "+ num +" are "+count);

    }
}
