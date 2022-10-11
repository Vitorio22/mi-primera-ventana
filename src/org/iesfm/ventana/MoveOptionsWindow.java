package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MoveOptionsWindow extends JFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame("Move Options");
    }

    public MoveOptionsWindow() throws HeadlessException {
        this.setBounds(10,10,350,400);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JPanel mainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        return mainPanel;
    }
}
