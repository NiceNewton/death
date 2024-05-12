import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    JTextField displayField = new JTextField(20);
    displayField.setEditable(false); 
    JButton addButton = new JButton("Add");
    JButton subtractButton = new JButton("Subtract");
    JButton multiplyButton = new JButton("Multiply");
    JButton divideButton = new JButton("Divide");
    class ButtonListener implements ActionListener {
      double firstNumber = 0;
      String operation = "";
      public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();

        if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
          firstNumber = Double.parseDouble(displayField.getText());
          operation = buttonText;
          displayField.setText("");
        } else {
          double secondNumber = Double.parseDouble(displayField.getText());
          double result = 0;
          switch (operation) {
            case "+":
              result = firstNumber + secondNumber;
              break;
            case "-":
              result = firstNumber - secondNumber;
              break;
            case "*":
              result = firstNumber * secondNumber;
              break;
            case "/":
              if (secondNumber == 0) {
                result = Double.NaN;
              } else {
                result = firstNumber / secondNumber;
              }
              break;
          }
          displayField.setText(String.valueOf(result));
        }
      }
    }
    LLMM
    multiplyButton.addActionListener(listener);
    divideButton.addActionListener(listener);
    JPanel buttonPanel = new JPanel();
    buttonPanel.add(addButton);
    buttonPanel.add(subtractButton);
    buttonPanel.add(multiplyButton);
    buttonPanel.add(divideButton);

    frame.add(displayField, BorderLayout.NORTH);
    frame.add(buttonPanel, BorderLayout.CENTER);

    frame.setVisible(true);
  }
}
