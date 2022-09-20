package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBoxWindow {
    public static void main(String[] args) {
        JFrame windowComboBox = new JFrame();
        windowComboBox.setBounds(50, 50, 350, 600);
        windowComboBox.setVisible(true);
        windowComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.gray);

        String selectText = "Programming language selected: ";
        JLabel labelSelected = new JLabel(selectText);
        mainPanel.add(labelSelected);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Java");
        comboBox.setActionCommand("Java");
        comboBox.addItem("C++");
        comboBox.setActionCommand("C++");
        comboBox.addItem("Python");
        comboBox.setActionCommand("Python");
        comboBox.addItem("C#");
        comboBox.setActionCommand("C#");
        comboBox.addItem("JavaScript");
        comboBox.setActionCommand("JavaScript");


        JButton button = new JButton("Show");

        // Lambda expression is better than Anonymous class
        button.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            labelSelected.setText(selectText + selected);
            JOptionPane.showMessageDialog(windowComboBox, "Has seleccionado " + selected);
        });

        // Anonymous class
        /*button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();

                labelSelected.setText(selectText + selected);
                JOptionPane.showMessageDialog(windowComboBox, "Has seleccionado " + selected);
            }
        });*/

        mainPanel.add(comboBox);
        mainPanel.add(button);

        windowComboBox.setContentPane(mainPanel);
        windowComboBox.repaint();
        windowComboBox.revalidate();

    }
}
