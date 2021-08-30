package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class GradingSystem {

    public static void main(String[] args) {
        int [] ratings = {1,2,3,6,9,0,0,0,0,4};

        int frequency = 0;
        for (int i = 0; i<10;i++){
            if (i==0)
                System.out.println(" 0 -- 9 : " + ratings[i]);
            else if(i==9)
                System.out.println("90 -- 100 : "+ratings[i]);
            else {
                frequency += 10;
                System.out.format("%d -- %d : %d \n", frequency, frequency+9, ratings[i]);
            }

        }
    }
}

