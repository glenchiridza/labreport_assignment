package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class ExceptionHandling {
    public static void divideByZero(){
        throw new ArithmeticException(("Trying to divide by zero, not allowed"));
    }
    public static void main(String[] args) {

        int x = 5;
        int y = 0;

        try {
            int quotient = x / y;
        }catch (Exception e){
            divideByZero();
        }
    }
}
