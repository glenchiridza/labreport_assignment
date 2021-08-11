package lab2;

import java.util.Arrays;

/**
 * Created by glenc on Aug 2021
 **/
public class UsingParallelSort {
    public static void main(String[] args) {

        int[] arr = {1,7,3,9,4};
        System.out.println("Before sort");
        Arrays.stream(arr).forEach(System.out::print);

        Arrays.parallelSort(arr);
        System.out.println("\nAfter sort");
        Arrays.stream(arr).forEach(System.out::print);


    }
}
