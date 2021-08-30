package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class BubbleSort {
    static int[] nums = {1,4,2,7,6,8,3,5,2,11,90,22,17,10};

    public static void main(String[] args) {
        bubbleSort();
    }
    public static void bubbleSort(){
        System.out.println("BubbleSort");
        System.out.println("Array before sort");
        for (int i : nums){
            System.out.print(i + " ");
        }

        int nmElems = 13;

        int out,in;
        for (out=nmElems;out>1;out--){
            for (in=0;in<out;in++){
                if (nums[in] > nums[in+1]){
                    int temp = nums[in];
                    nums[in] = nums[in+1];
                    nums[in+1] = temp;
                }
            }
        }
        System.out.println("\nsorted array");
        for (int i : nums){
            System.out.print(i +" ");
        }
    }
}
