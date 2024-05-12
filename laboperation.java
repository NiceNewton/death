import java.awt.event.*;
import javax.swing.*;

public class laboperation implements ActionListener {

    JButton sqrButton, cubeButton, factorialButton, palindromeButton, reverseButton;
    JTextField inputField, outputField;

    public laboperation() {
        JFrame f = new JFrame("Button GUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));


        JPanel inputPanel = new JPanel();
        inputField = new JTextField(20);
        inputPanel.add(new JLabel("Input:"));
        inputPanel.add(inputField);
        f.add(inputPanel);


        JPanel outputPanel = new JPanel();
        outputField = new JTextField(20);
        outputField.setEditable(false);
        outputPanel.add(new JLabel("Output:"));
        outputPanel.add(outputField);
        f.add(outputPanel);


        JPanel buttonPanel = new JPanel();
        sqrButton = new JButton("Square");
        cubeButton = new JButton("Cube");
        factorialButton = new JButton("Factorial");
        palindromeButton = new JButton("Palindrome");
        reverseButton = new JButton("Reverse");

        buttonPanel.add(sqrButton);
        buttonPanel.add(cubeButton);
        buttonPanel.add(factorialButton);
        buttonPanel.add(palindromeButton);
        buttonPanel.add(reverseButton);

        sqrButton.addActionListener(this);
        cubeButton.addActionListener(this);
        factorialButton.addActionListener(this);
        palindromeButton.addActionListener(this);
        reverseButton.addActionListener(this);

        f.add(buttonPanel);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();

        if (input.isEmpty()) {
            outputField.setText("Please enter an input value.");
            return;
        }

        double number;
        try {
            number = Double.parseDouble(input);
        } catch (NumberFormatException ex) {
            outputField.setText("Invalid input format. Please enter a number.");
            return;
        }

        int result;
        String output;
        if (e.getSource() == sqrButton) {
            result = (int) Math.pow(number, 2);
            output = String.valueOf(result);
        } else if (e.getSource() == cubeButton) {
            result = (int) Math.pow(number, 3);
            output = String.valueOf(result);
        } else if (e.getSource() == factorialButton) {
            output = calculateFactorial((int) number);
        } else if (e.getSource() == palindromeButton) {
            output = String.valueOf(isPalindrome(input));
        } else if (e.getSource() == reverseButton) {
            output = reverseString(input);
        } else {
            output = "Unknown button";
        }

        outputField.setText(output);
    }

    private String calculateFactorial(int number) {
        if (number < 0) {
            return "Factorial is not defined for negative numbers.";
        } else if (number == 0) {
            return "1";
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return String.valueOf(factorial);
        }
    }

    private boolean isPalindrome(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private String reverseString(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        new laboperation();
    }
}