import javax.swing.*;
import java.awt.*;

public class MyRadioButtonsWindow {
    public static void main(String[] args) {
        JFrame windowRadioButton = new JFrame();
        windowRadioButton.setBounds(50, 50, 400, 400);
        windowRadioButton.setVisible(true);
        windowRadioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRadioButton radioButton1 = new JRadioButton("Linux");
        JRadioButton radioButton2 = new JRadioButton("Windows");
        JRadioButton radioButton3 = new JRadioButton("Macintosh");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        JButton button = new JButton("Aceptar");


        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.black);

        JPanel primaryPanel = new JPanel();
        primaryPanel.setBounds(50, 50, 500, 500);
        primaryPanel.setBackground(Color.gray);





        mainPanel.add(primaryPanel);
        primaryPanel.add(radioButton1);
        primaryPanel.add(radioButton2);
        primaryPanel.add(radioButton3);
        primaryPanel.add(button);

        windowRadioButton.setContentPane(mainPanel);
        windowRadioButton.repaint();
        windowRadioButton.revalidate();

    }

}
