package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridLayout {
    public static void main(String[] args) {

        JFrame windowGridLayout = new JFrame();
        windowGridLayout.setTitle("Calculadora");
        windowGridLayout.setBounds(50, 50, 500, 400);
        windowGridLayout.setVisible(true);
        windowGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout( 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0,0));

        JPanel panel1 = new JPanel();
        panel1.add(new JTextField(25));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new java.awt.GridLayout(5, 4, 10, 10));
        panel2.setBorder(BorderFactory.createEmptyBorder(50, 0,0,0));
        JButton button1 = new JButton("Rtc");
        JButton button2 = new JButton("CE");
        JButton button3 = new JButton("CL");
        JButton button4 = new JButton("+/-");
        JButton button5 = new JButton("7");
        JButton button6 = new JButton("8");
        JButton button7 = new JButton("9");
        JButton button8 = new JButton("/");
        JButton button9 = new JButton("4");
        JButton button10 = new JButton("5");
        JButton button11 = new JButton("6");
        JButton button12 = new JButton("*");
        JButton button13 = new JButton("1");
        JButton button14 = new JButton("2");
        JButton button15 = new JButton("3");
        JButton button16 = new JButton("-");
        JButton button17 = new JButton("0");
        JButton button18 = new JButton(".");
        JButton button19 = new JButton("=");
        JButton button20 = new JButton("+");

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
        panel2.add(button17);
        panel2.add(button18);
        panel2.add(button19);
        panel2.add(button20);

        mainPanel.add(panel1, BorderLayout.NORTH);
        mainPanel.add(panel2, BorderLayout.CENTER);

        windowGridLayout.setContentPane(mainPanel);
        windowGridLayout.repaint();
        windowGridLayout.revalidate();

    }
}
