package lab5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by glenc on Sep 2021
 **/
public class DeskApp {

    public static void main(String[] args) {
        String firstName = JOptionPane
                .showInputDialog("Enter your name");
        String lastName = JOptionPane
                .showInputDialog("Enter lastName");

        JOptionPane.showMessageDialog(null,
                "Hello hi "+firstName + " " +lastName,"UserDetails",
                JOptionPane.PLAIN_MESSAGE);




    }

}
