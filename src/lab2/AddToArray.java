package lab2;

import java.util.Formatter;

/**
 * Created by glenc on Aug 2021
 **/
public class AddToArray {

    public static void main(String[] args) {
        double[] arr = new double[]{3.5,1.8,4.2,1.4};
        double sum = 0;
        double largest = arr[0];
        double smallest = arr[arr.length-1];
        StringBuilder elem= new StringBuilder();
        for (double item : arr){
            //list of the array elements
            elem.append(item).append(", ");

            //sum up
            sum += item;

            //find largest and smallest
            if (item > largest)
                largest = item;
            else if (item < smallest)
                smallest = item;

        }

        System.out.println("Elements in array are "+elem);
        System.out.print("total sum \t Largest \t Smallest\n");
        Formatter f = new Formatter();
        f.format("%7.1f %9.1f %12.1f",sum,largest,smallest);
        System.out.println(f);


    }
}
