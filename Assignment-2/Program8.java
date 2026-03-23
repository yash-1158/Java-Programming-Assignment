//Develop GUI-based Investment Calculator using Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Program8 extends JFrame implements ActionListener {

    private JLabel principalLabel = new JLabel("Principal Amount:");
    private JLabel rateLabel = new JLabel("Annual Interest Rate (%):");
    private JLabel yearsLabel = new JLabel("Number of Years:");
    private JLabel resultLabel = new JLabel("Future Value: ");
    
    private JTextField principalField = new JTextField();
    private JTextField rateField = new JTextField();
    private JTextField yearsField = new JTextField();
    
    private JButton calculateButton = new JButton("Calculate");

    public Program8() {
        setTitle("Investment Calculator");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0; add(principalLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; add(principalField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; add(rateLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 1; add(rateField, gbc);

        gbc.gridx = 0; gbc.gridy = 2; add(yearsLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 2; add(yearsField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2; add(calculateButton, gbc);

        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2; add(resultLabel, gbc);

        calculateButton.addActionListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText()) / 100;
            int years = Integer.parseInt(yearsField.getText());
            double futureValue = principal * Math.pow(1 + rate, years);
            DecimalFormat df = new DecimalFormat("#.##");
            resultLabel.setText("Future Value: $" + df.format(futureValue));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Program8();
    }
}