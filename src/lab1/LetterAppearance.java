package lab1;

/**
 * Created by glenc on Jun 2021
 **/
public class LetterAppearance {

    public static void main(String[] args) {
        System.out.println("number of times the letter i exits on my name Chiridza");
        String name = "Chiridza";
        char letter = 'i';

        int count = 0;
        for (int b =0;b<name.length();b++) {
            if (name.charAt(b) == letter){
                ++count;
            }
        }
        System.out.println("letter i appears "+count +" times");
    }
}
