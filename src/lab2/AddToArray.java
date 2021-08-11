package lab2;

/**
 * Created by glenc on Aug 2021
 **/
public class AddToArray {

    public static void main(String[] args) {
        double[] arr = new double[]{3.5,1.8,4.2,1.4};
        double total = 0;
        System.out.println("total sum of array elements");
        for (double item : arr){
            total += item;
        }
        System.out.println(total);



    }
}
