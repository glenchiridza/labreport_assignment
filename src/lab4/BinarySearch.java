package lab4;

import java.util.Scanner;

/**
 * Created by glenc on Aug 2021
 **/
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Enter Search number: ");
        Scanner input = new Scanner(System.in);

        int searchValue = input.nextInt();

        sendValue(searchValue);
    }
    private static void sendValue(int searchValue) {
        int nmElems = 0;

        int[] items = new int[1000];
        for (int i=0;i<items.length;i++){
            items[i] = i * 2;
            nmElems++;
        }

        int lowerBound = 0;
        int upperBound = nmElems - 1;
        int currentIndex;

        while (true){
            currentIndex = (lowerBound + upperBound) / 2;

            if (items[currentIndex] == searchValue){
                System.out.println("found at position " + currentIndex);
                break;
            }
            else if (lowerBound > upperBound){
                System.out.println("not found");
                break;
            }
            else{
                if (items[currentIndex] < searchValue)
                    lowerBound = currentIndex + 1;
                else
                    upperBound = currentIndex - 1;
            }
        }
    }
}
