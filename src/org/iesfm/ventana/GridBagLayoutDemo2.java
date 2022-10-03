package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo2 {
    public static void main(String[] args) {

        JFrame windowGridBag = new JFrame();
        windowGridBag.setBounds(50, 50, 500, 300);
        windowGridBag.setVisible(true);
        windowGridBag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        JButton button1 = new JButton("One");
        GridBagConstraints constraintsButton1 = new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button2 = new JButton("Two");
        GridBagConstraints constraintsButton2 = new GridBagConstraints(
                1, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button3 = new JButton("Three");
        GridBagConstraints constraintsButton3 = new GridBagConstraints(
                2, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button4 = new JButton("Four");
        GridBagConstraints constraintsButton4 = new GridBagConstraints(
                0, 1, 2, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button5 = new JButton("Five");
        GridBagConstraints constraintsButton5 = new GridBagConstraints(
                2, 1, 1, 2, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button6 = new JButton("Six");
        GridBagConstraints constraintsButton6 = new GridBagConstraints(
                0, 2, 1, 1, 0, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button7 = new JButton("Seven");
        GridBagConstraints constraintsButton7 = new GridBagConstraints(
                1, 2, 1, 1, 0, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);


        mainPanel.add(button1, constraintsButton1);
        mainPanel.add(button2, constraintsButton2);
        mainPanel.add(button3, constraintsButton3);
        mainPanel.add(button4, constraintsButton4);
        mainPanel.add(button5, constraintsButton5);
        mainPanel.add(button6, constraintsButton6);
        mainPanel.add(button7, constraintsButton7);

        windowGridBag.setContentPane(mainPanel);
        windowGridBag.repaint();
        windowGridBag.revalidate();
    }
}
