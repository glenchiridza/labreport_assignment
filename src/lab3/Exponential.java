package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class Exponential {

    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        int result = 1;

        while (exponent !=0){
            result *=base;
            --exponent;
        }

        System.out.format("%d to the power 4 = %d",base,result);
    }
}
