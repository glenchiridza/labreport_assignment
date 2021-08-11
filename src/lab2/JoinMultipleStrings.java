package lab2;

import java.util.StringJoiner;

/**
 * Created by glenc on Aug 2021
 **/
public class JoinMultipleStrings {

    public static void main(String[] args) {
        String code = "HCSE 224";
        String program = "Object Oriented Programming";
        String level = "level 2.2";
        String adder = "with";
        String lecturer = "Mrs Ruvinga";

        StringJoiner joiner = new StringJoiner("*");
        joiner.add(code).add(program).
                add(level).add(adder).add(lecturer);
        System.out.println("joined string :\n");
        System.out.println(joiner);



    }
}
