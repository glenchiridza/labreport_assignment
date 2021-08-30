package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class SelectionSort {
    static int[] a = {1,3,2,7,3,8,3,5,2,1,90,22,17};

    public static void main(String[] args) {

    }

    public static void selectionSort(){
        int nmElems = 13;
        int out,in,min;
        for (out=0;out<nmElems-1;out++){
            min = out;
            for (in = out+1;in<nmElems;in++)
                if(a[in] < a[min])
                    min = in;
            swap(out,min);
        }
    }
    public static void swap(int out, int min){
        int temp = a[out];
        a[out] = a[min];
        a[min] = temp;
    }
}
