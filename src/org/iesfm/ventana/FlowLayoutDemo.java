package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 550, 150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Long-Named Button 4");
        JButton button5 = new JButton("5");
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(button4);
        mainPanel.add(button5);

        ButtonGroup orientation = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("Left to right");
        radioButton1.setSelected(true);
        orientation.add(radioButton1);
        JRadioButton radioButton2 = new JRadioButton("Right to left");
        orientation.add(radioButton2);
        JButton button = new JButton("Apply orientation");
        button.addActionListener(e -> {
            FlowLayout layout = (FlowLayout) mainPanel.getLayout();
            if (radioButton1.isSelected()) {
                layout.setAlignment(FlowLayout.LEFT);
            } else  {
                layout.setAlignment(FlowLayout.RIGHT);
            }
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        mainPanel.add(radioButton1);
        mainPanel.add(radioButton2);
        mainPanel.add(button);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
