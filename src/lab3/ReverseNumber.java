package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int reversedNum = 0;

        System.out.println();
        System.out.println("Number before reversal = "+num);

        while(num != 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Number in reverse = "+reversedNum);
    }
}
