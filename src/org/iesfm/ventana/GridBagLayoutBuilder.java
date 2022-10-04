package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutBuilder {

    public static void main(String[] args) {

        JFrame windowGridBagLayout = new JFrame("GridBagLayout Builder");
        windowGridBagLayout.setBounds(10, 10, 600, 400);
        windowGridBagLayout.setVisible(true);
        windowGridBagLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        JLabel labelName = new JLabel("Full Name", SwingConstants.RIGHT);
        GridBagConstraints constraintsLabelName = new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JTextField name = new JTextField();
        GridBagConstraints constraintsName = new GridBagConstraints(
                1, 0, 3, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JLabel labelStreet = new JLabel("Street");
        GridBagConstraints constraintsLabelStreet = new GridBagConstraints(
                1, 1, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JTextField address_street = new JTextField();
        GridBagConstraints constraintsAdress_Street = new GridBagConstraints(
                1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JLabel labelCity = new JLabel("City", SwingConstants.CENTER);
        GridBagConstraints constraintsLabelCity = new GridBagConstraints(
                2, 1, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JTextField city = new JTextField();
        GridBagConstraints constraintsCity = new GridBagConstraints(
                2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JLabel labelZipCode = new JLabel("Zip Code", SwingConstants.CENTER);
        GridBagConstraints constraintsLabelZipCode = new GridBagConstraints(
                3, 1, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JTextField ZipCode = new JTextField();
        GridBagConstraints constraintsZipCode = new GridBagConstraints(
                3, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JLabel labelAddress = new JLabel("Address", SwingConstants.RIGHT);
        GridBagConstraints constraintsLabelAddress = new GridBagConstraints(
                0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JLabel labelPhone = new JLabel("Phone", SwingConstants.RIGHT);
        GridBagConstraints constraintsLabelPhone = new GridBagConstraints(
                0, 3, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JTextField phone = new JTextField();
        GridBagConstraints constraintsPhone = new GridBagConstraints(
                1, 3, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JLabel labelAge = new JLabel("Age", SwingConstants.RIGHT);
        GridBagConstraints constraintsLabelAge = new GridBagConstraints(
                2, 3, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JTextField age = new JTextField();
        GridBagConstraints constraintsAge = new GridBagConstraints(
                3, 3, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JLabel labelDescription = new JLabel("Description", SwingConstants.RIGHT);
        GridBagConstraints constraintsLabelDescription = new GridBagConstraints(
                0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        JTextArea description = new JTextArea();
        GridBagConstraints constrainsDescription = new GridBagConstraints(
                1, 4, 3, 1, 3, 3,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0);

        JButton submit = new JButton("Submit");
        GridBagConstraints constraintsButton = new GridBagConstraints(
                3, 5, 2, 1, 0, 0,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0);

        mainPanel.add(labelName, constraintsLabelName);
        mainPanel.add(name, constraintsName);
        mainPanel.add(labelStreet, constraintsLabelStreet);
        mainPanel.add(address_street, constraintsAdress_Street);
        mainPanel.add(labelCity, constraintsLabelCity);
        mainPanel.add(city, constraintsCity);
        mainPanel.add(labelZipCode, constraintsLabelZipCode);
        mainPanel.add(ZipCode, constraintsZipCode);
        mainPanel.add(labelAddress, constraintsLabelAddress);
        mainPanel.add(labelPhone, constraintsLabelPhone);
        mainPanel.add(phone, constraintsPhone);
        mainPanel.add(labelAge, constraintsLabelAge);
        mainPanel.add(age, constraintsAge);
        mainPanel.add(labelDescription, constraintsLabelDescription);
        mainPanel.add(description, constrainsDescription);
        mainPanel.add(submit, constraintsButton);

        windowGridBagLayout.setContentPane(mainPanel);
        windowGridBagLayout.revalidate();
        windowGridBagLayout.repaint();

    }
}
