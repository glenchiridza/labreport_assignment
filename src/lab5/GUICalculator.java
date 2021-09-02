package lab5;

import javax.swing.*;

/**
 * Created by glenc on Sep 2021
 **/
public class GUICalculator {

    public static void main(String[] args) {
        String num1 = JOptionPane
                .showInputDialog("Enter first integer");
        String num2 = JOptionPane
                .showInputDialog("Enter second integer");

        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null,
                "Sum of  "+num1 + " + " +num2 + " = "+ sum,"Addition of Two Numbers",
                JOptionPane.PLAIN_MESSAGE);




    }

}

