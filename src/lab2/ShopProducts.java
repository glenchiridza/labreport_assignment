package lab2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by glenc on Aug 2021
 **/
public class ShopProducts {

    public static void main(String[] args) {
        List<String> grocery = Arrays.asList(
                "cooking oil","cooking oil","oranges bag",
                "banana","banana","bread","bread","potato bag",
                "potato bag","tequila","tequila","granadila",
                "broccoli","broccoli","broccoli","broccoli"
        );

        System.out.println("products bought by customer: ");

        Map<String,Long> grocery_map = grocery.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );

        System.out.println(grocery_map);

    }

}
