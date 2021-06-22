import java.util.Scanner;

/**
 * Created by glenc on Jun 2021
 **/
public class ReadStrings {

    public static void main(String[] args) {

        System.out.println("Please type in some text string: ");

        Scanner input = new Scanner(System.in);

        String value = input.nextLine();

        System.out.println("you typed the following statement: \n"+value);
    }
}
