package lab5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by glenc on Sep 2021
 **/
public class ComboBoxSelection extends JFrame {

    private JComboBox listCombo;
    private JLabel label;

    private static final String [] programs = {
            "Computer Science","Telecommunications",
            "Medicine","Software Engineering","Computer Systems Engineering",
    };

    public ComboBoxSelection(){
        super("Program Choices");
        setLayout(new FlowLayout());

        listCombo = new JComboBox(programs);

    }
}
