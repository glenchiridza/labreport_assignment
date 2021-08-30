package lab4;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by glenc on Aug 2021
 **/
public class ShopCart {
    public static void main(String[] args) {
        HashMap<String,Double> item = new HashMap<>();
        item.put("Television",200.99);
        item.put("Bed",990.0);
        item.put("Stove",400.0);
        item.put("DishWasher",9.9);
        item.put("Couch",900.99);
        item.put("Table",800.0);
        item.put("Laptop",1200.0);

        AtomicReference<Double> totalPrice = new AtomicReference<>(0.0);
        System.out.println("The items in store are: ");
        item.forEach((itm,price) -> {System.out.println(itm + " costs $" +price); totalPrice.updateAndGet(v -> (v + price));});

        System.out.println(" ");
        System.out.println("total cost of all items is ZWL$"+totalPrice);
    }
}
