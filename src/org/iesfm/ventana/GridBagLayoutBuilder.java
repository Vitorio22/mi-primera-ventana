package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutBuilder {

    public static void main(String[] args) {

        JFrame windowGridBagLayout = new JFrame("GridBagLayout Builder");
        windowGridBagLayout.setBounds(10, 10, 522, 385);
        windowGridBagLayout.setVisible(true);
        windowGridBagLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        JLabel labelFullName = new JLabel("Full Name");
        GridBagConstraints constraintsLabelName = new GridBagConstraints(
                0, 0, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(labelFullName, constraintsLabelName);

        JLabel street = new JLabel("Street", SwingConstants.CENTER);
        GridBagConstraints constraintsLabelStreet = new GridBagConstraints(
                1, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(street, constraintsLabelStreet);

        JLabel city = new JLabel("City", SwingConstants.CENTER);
        GridBagConstraints constraintsLabelCity = new GridBagConstraints(
                2, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(city, constraintsLabelCity);

        JLabel zipCode = new JLabel("Zip Code", SwingConstants.CENTER);
        GridBagConstraints constraintsLabelZipCode = new GridBagConstraints(
                3, 1, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(zipCode, constraintsLabelZipCode);

        JLabel address = new JLabel("Address");
        GridBagConstraints constraintsLabelAddress = new GridBagConstraints(
                0, 2, 3, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(address, constraintsLabelAddress);

        JLabel phone = new JLabel("Phone");
        GridBagConstraints constraintsLabelPhone = new GridBagConstraints(
                0, 3, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(phone, constraintsLabelPhone);

        JLabel Age = new JLabel("Age", SwingConstants.RIGHT);
        GridBagConstraints constraintsLabelAge = new GridBagConstraints(
                2, 3, 1, 1, 0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(Age, constraintsLabelAge);

        JLabel description = new JLabel("Description");
        GridBagConstraints constraintsLabelDescription = new GridBagConstraints(
                0, 4, 1, 1, 0, 0,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(description, constraintsLabelDescription);

        JTextField textFieldFullName = new JTextField();
        GridBagConstraints constraintsTextFieldName = new GridBagConstraints(
                1, 0, 3, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(textFieldFullName, constraintsTextFieldName);

        JTextField textFieldStreet = new JTextField();
        GridBagConstraints constraintsTextFieldStreet = new GridBagConstraints(
                1, 2, 1, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(textFieldStreet, constraintsTextFieldStreet);

        JTextField textFieldCity = new JTextField();
        GridBagConstraints constraintsTextFieldCity = new GridBagConstraints(
                2, 2, 1, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(textFieldCity, constraintsTextFieldCity);

        JTextField textFieldZipCode = new JTextField();
        GridBagConstraints constraintsTextFieldZipCode = new GridBagConstraints(
                3, 2, 1, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(textFieldZipCode, constraintsTextFieldZipCode);

        JTextField textFieldPhone = new JTextField();
        GridBagConstraints constraintsTextFieldPhone = new GridBagConstraints(
                1, 3, 1, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(textFieldPhone, constraintsTextFieldPhone);

        JTextField textFieldAge = new JTextField();
        GridBagConstraints constraintsTextFieldAge = new GridBagConstraints(
                3, 3, 1, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(textFieldAge, constraintsTextFieldAge);

        JTextArea textAreaDescription = new JTextArea();
        GridBagConstraints constraintsTextAreaDescription = new GridBagConstraints(
                1, 4, 3, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(textAreaDescription, constraintsTextAreaDescription);

        JButton buttonSubmit = new JButton("Submit");
        GridBagConstraints constraintsButtonSubmit = new GridBagConstraints(
                2, 5, 2, 1, 1, 0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);
        mainPanel.add(buttonSubmit, constraintsButtonSubmit);


        windowGridBagLayout.setContentPane(mainPanel);
        windowGridBagLayout.revalidate();
        windowGridBagLayout.repaint();

    }
}
