package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Multiplication Table");
        for (int i =1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.print(j * i +"\t");
            }
            System.out.println(" ");
        }
    }
}
