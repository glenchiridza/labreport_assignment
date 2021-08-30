package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class QuadraticRoots {
    public static void main(String[] args) {
        double a = 2.4;
        double b = 3.3;
        float c = 4;

        double root1;
        double root2;
        String output;

        double determinant = b*b - 4.0 *a*c;

        if(determinant > 0){
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            output = String.format("root1 = %.2f and root2 = %.2f", root1,root2);

        }
        else if(determinant == 0.0) {
            root2 = -b/(2*a);
            root1 = root2;
            output = String.format("root1 = root2 = %.2f", root1);

        }
        else{
            double realPart = -b / (2* a);
            double imaginaryPart = Math.sqrt(-determinant)/(2*a);
            output = String.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);


        }
        System.out.println(" ");
        System.out.println("roots of the given equation are ");
        System.out.println(output);
    }
}
