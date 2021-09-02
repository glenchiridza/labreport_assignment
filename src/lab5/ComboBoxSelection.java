package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
        listCombo.setMaximumRowCount(3);

        listCombo.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent itemEvent) {
                        if (itemEvent.getStateChange() == ItemEvent.SELECTED){
                            label.setText(programs[listCombo.getSelectedIndex()]);
                        }
                    }
                }
        );
        add(listCombo);
        label = new JLabel(programs[0]);
        add(label);
    }

    public static void main(String[] args) {
        ComboBoxSelection listCombo = new ComboBoxSelection();
        listCombo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listCombo.setSize(350, 350);
        listCombo.setVisible(true);
    }
}

