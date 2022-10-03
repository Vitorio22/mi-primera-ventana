package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagWindow2 {
    public static void main(String[] args) {

        JFrame windowGridBag = new JFrame();
        windowGridBag.setBounds(50, 50, 500, 300);
        windowGridBag.setVisible(true);
        windowGridBag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        JTextArea textArea = new JTextArea("Area texto");
        GridBagConstraints constraintsTextArea = new GridBagConstraints(
                0, 0, 2, 2, 0, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button1 = new JButton("Button 1");
        GridBagConstraints constraintsButton1 = new GridBagConstraints(
                2, 0, 1, 1, 0, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button2 = new JButton("Button 2");
        GridBagConstraints constraintsButton2 = new GridBagConstraints(
                2, 1, 1, 1, 0, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button3 = new JButton("Button 3");
        GridBagConstraints constraintsButton3 = new GridBagConstraints(
                0, 2, 1, 1, 0, 0,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton button4 = new JButton("Button 4");
        GridBagConstraints constraintsButton4 = new GridBagConstraints(
                2, 2, 1, 1, 0, 0,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JTextField textField = new JTextField("Campo texto");
        GridBagConstraints constraintsTextField = new GridBagConstraints(
                1, 2, 1, 1, 2, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        mainPanel.add(textArea, constraintsTextArea);
        mainPanel.add(button1, constraintsButton1);
        mainPanel.add(button2, constraintsButton2);
        mainPanel.add(button3, constraintsButton3);
        mainPanel.add(button4, constraintsButton4);
        mainPanel.add(textField, constraintsTextField);

        windowGridBag.setContentPane(mainPanel);
        windowGridBag.repaint();
        windowGridBag.revalidate();

    }
}
