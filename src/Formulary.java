import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulary extends JFrame {
    private JPanel panelMain;
    private JLabel weightLabel;
    private JTextField inputWeight;
    private JLabel heightLabel;
    private JTextField inputHeight;
    private JButton calculateButton;

    public Formulary(){
        setTitle("Calculate BMI");
        setContentPane(panelMain);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strWeight = inputWeight.getText();
                String strHeight = inputHeight.getText();

                double weight = Double.parseDouble(strWeight);
                double height = Double.parseDouble(strHeight);

                double bmi = weight / (height * height);

                JOptionPane.showMessageDialog(calculateButton, "Your body mass index is: " + bmi);
            }
        });
    }
}
