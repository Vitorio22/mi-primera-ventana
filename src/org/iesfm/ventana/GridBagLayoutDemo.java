package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame( "GridBagLayoutDemo" );
        f.setBounds(10, 10, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        JButton button1 = new JButton("Button 1");
        GridBagConstraints constraintsButton1 = new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button2 = new JButton("Button 2");
        GridBagConstraints constraintsButton2 = new GridBagConstraints(
                1, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button3 = new JButton("Button 3");
        GridBagConstraints constraintsButton3 = new GridBagConstraints(
                2, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button4 = new JButton("Long-Named Button 4");
        GridBagConstraints constraintsButton4 = new GridBagConstraints(
                0, 1, 3, 1, 1, 5,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button5 = new JButton("5");
        GridBagConstraints constraintsButton5 = new GridBagConstraints(
                1, 2, 2, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        mainPanel.add(button1, constraintsButton1);
        mainPanel.add(button2, constraintsButton2);
        mainPanel.add(button3, constraintsButton3);
        mainPanel.add(button4, constraintsButton4);
        mainPanel.add(button5, constraintsButton5);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
