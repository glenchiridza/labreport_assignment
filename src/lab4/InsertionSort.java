package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class InsertionSort {
    static int[] a = {1,3,2,7,3,8,3,5,2,1,90,22,17};

    public static void main(String[] args) {

        insertionSort();
    }

    public static void insertionSort(){
        System.out.println("Array before sort");
        for (int i : a){
            System.out.print(i + " ");
        }

        int nmElem = 13;
        int in, out;

        for (out=1;out<nmElem;out++){
            int temp = a[out];
            in = out;
            while(in > 0 && a[in-1]>=temp){
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
        System.out.println("\nsorted array");
        for (int i : a){
            System.out.print(i +" ");
        }
    }
}
