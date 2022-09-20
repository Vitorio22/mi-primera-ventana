package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyTitledBorderWindow {
    public static void main(String[] args) {
        JFrame windowTitledBorder = new JFrame();
        windowTitledBorder.setBounds(50, 50, 350, 600);
        windowTitledBorder.setVisible(true);
        windowTitledBorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JPanel searchPanel = new JPanel();
        searchPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray), "Search"));

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("By name");
        JRadioButton radioButton2 = new JRadioButton("By ID");
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        searchPanel.add(radioButton1);
        searchPanel.add(radioButton2);


        mainPanel.add(searchPanel);
        windowTitledBorder.setContentPane(mainPanel);
        windowTitledBorder.repaint();
        windowTitledBorder.revalidate();

    }
}
