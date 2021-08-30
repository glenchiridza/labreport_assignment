package lab3;

/**
 * Created by glenc on Aug 2021
 **/
public class LetterCount {
    public static void main(String[] args) {
        System.out.println("Counting nummber of letters");

        String paragraph = " I have been learning java and it has been fun." +
                " There are many opportunities in java, though there has been an improved " +
                "in writing less verbose code in Kotlin, but Java is still cool";
        int letters = 0;

        for (int i = 0; i < paragraph.length();i++){
            letters++;
        }

        System.out.println("There are "+ letters +" letters in this paragraph");
    }
}
