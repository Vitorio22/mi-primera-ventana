package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridLayout {
    public static void main(String[] args) {

        JFrame windowGridLayout = new JFrame();
        windowGridLayout.setTitle("Calculadora");
        windowGridLayout.setBounds(10, 10, 300, 500);
        windowGridLayout.setVisible(true);
        windowGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout( 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0,0));

        Font font = new Font("Arial", Font.BOLD, 45);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(10, 10));
        panel1.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 5));
        JTextField textField = new JTextField("0", 20);
        textField.setPreferredSize(new Dimension(80, 80));
        textField.setFont(font);
        textField.setLayout(new BorderLayout());
        textField.setHorizontalAlignment(JTextField.RIGHT);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new java.awt.GridLayout(4, 4, 10, 10));
        JButton button1 = new JButton("7");
        JButton button2 = new JButton("8");
        JButton button3 = new JButton("9");
        JButton button4 = new JButton("DEL");
        button4.setBackground(Color.BLUE);
        button4.setForeground(Color.WHITE);
        button4.setBackground(new Color(29,127,135));
        JButton button5 = new JButton("4");
        JButton button6 = new JButton("5");
        JButton button7 = new JButton("6");
        JButton button8 = new JButton("+");
        JButton button9 = new JButton("1");
        JButton button10 = new JButton("2");
        JButton button11 = new JButton("3");
        JButton button12 = new JButton("-");
        JButton button13 = new JButton(".");
        JButton button14 = new JButton("0");
        JButton button15 = new JButton("/");
        JButton button16 = new JButton("*");

        JPanel panel3 = new JPanel();
        panel3.setLayout(new java.awt.GridLayout(1,2,10,10));
        panel3.setPreferredSize(new Dimension(50, 50));
        JButton button17 = new JButton("RESET");
        button17.setBackground(new Color(29,127,135));
        button17.setForeground(Color.WHITE);
        JButton button18 = new JButton("=");
        button18.setBackground(new Color(207,83,29));
        button18.setForeground(Color.WHITE);

        panel1.add(textField);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button10);
        panel2.add(button11);
        panel2.add(button12);
        panel2.add(button13);
        panel2.add(button14);
        panel2.add(button15);
        panel2.add(button16);
        panel3.add(button17);
        panel3.add(button18);

        mainPanel.add(panel1, BorderLayout.NORTH);
        mainPanel.add(panel2, BorderLayout.CENTER);
        mainPanel.add(panel3, BorderLayout.SOUTH);

        windowGridLayout.setContentPane(mainPanel);
        windowGridLayout.repaint();
        windowGridLayout.revalidate();

    }
}
