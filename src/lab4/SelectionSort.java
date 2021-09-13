package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class SelectionSort {
    static int[] a = {10,3,20,70,31,81,32,55,26,17,92,40,227};

    public static void main(String[] args) {

        selectionSort();
    }
    public static void selectionSort(){
        System.out.println("Selection sort");
        System.out.println("Before sorting array");
        for (int i : a){
            System.out.print(i +" ");
        }
        int nmElems = 13;
        int out,in,min;
        for (out=0;out<nmElems-1;out++){
            min = out;
            for (in = out+1;in<nmElems;in++)
                if(a[in] < a[min])
                    min = in;
            swap(out,min);
        }
        System.out.println("\nsorted array");
        for (int i : a){
            System.out.print(i +" ");
        }
    }
    public static void swap(int out, int min){
        int temp = a[out];
        a[out] = a[min];
        a[min] = temp;
    }
}
