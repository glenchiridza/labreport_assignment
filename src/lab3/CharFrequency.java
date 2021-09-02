package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class CharFrequency {

    public static void main(String[] args) {
        String sentence = "I am practicing simple Java codes and it has been great";
        char ch = 'e';
        int frequency = 0;

        for(int i = 0; i< sentence.length();i++){
            if(sentence.charAt(i)==ch)
                frequency++;
        }
        System.out.println("Frequency of "+ch+" is "+frequency);
    }
}
