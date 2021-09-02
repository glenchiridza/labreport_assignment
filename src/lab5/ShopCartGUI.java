package lab5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by glenc on Sep 2021
 **/
public class ShopCartGUI  extends JFrame {

    private JTextArea listItems;
    private JLabel label;

        public ShopCartGUI(){

        super("Shop Items Bought");
        setLayout(new FlowLayout());

            HashMap<String,Double> item = new HashMap<>();
            item.put("Television",200.99);
            item.put("Bed",990.0);
            item.put("Stove",400.0);
            item.put("DishWasher",9.9);
            item.put("Couch",900.99);
            item.put("Table",800.0);
            item.put("Laptop",1200.0);

            AtomicReference<Double> totalPrice = new AtomicReference<>(0.0);
            item.forEach((itm,price) -> {System.out.println(itm + " costs $" +price); totalPrice.updateAndGet(v -> (v + price));});


            label = new JLabel("Shop Cart List ");
            add(label);

            ArrayList<Object> items = new ArrayList<>();
            for (Map.Entry entry : item.entrySet()){
                items.add(entry+"\n");
            }

        listItems = new JTextArea("\nItems in Store \n");
            listItems.append((item.keySet())+"\n");
        listItems.append("\nBought Items \n");
        listItems.append(items+"");

        listItems.append("\nTotal cost of Items Bought \n");
        listItems.append("$"+totalPrice+"\n");
        add(listItems);

        }

    public static void main(String[] args) {
        ShopCartGUI shopCartGUI = new ShopCartGUI();
        shopCartGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shopCartGUI.setSize(450, 450);
        shopCartGUI.setVisible(true);
    }
    }

