import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class operationframe implements ActionListener {
    JFrame f1;
    JPanel p1;
    JTextField t1, t2;
    JLabel l1, l2;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;

    public operationframe() {
        f1 = new JFrame("operation changing buttons");
        f1.setVisible(true);
        f1.setSize(400, 400);
        p1 = new JPanel();
        f1.getContentPane().add(p1);
        l1 = new JLabel("enter Name");
        l2 = new JLabel("converted Name");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEditable(false);
        jb1 = new JButton("uppercase");
        jb2 = new JButton("lowercase");
        jb3 = new JButton("reverse");
        jb4 = new JButton("vowels");
        jb5 = new JButton("words");
        jb6 = new JButton("begin caps");
        jb7 = new JButton("letters");

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(jb1);
        p1.add(jb2);
        p1.add(jb3);
        p1.add(jb4);
        p1.add(jb5);
        p1.add(jb6);
        p1.add(jb7);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("uppercase")) {
            String str1 = t1.getText();
            t2.setText(str1.toUpperCase());
        } else if (e.getActionCommand().equals("lowercase")) {
            String str2 = t1.getText();
            t2.setText(str2.toLowerCase());
        } else if (e.getActionCommand().equals("reverse")) {
            String str3 = t1.getText();
            StringBuffer revString = new StringBuffer(str3);
            revString.reverse();
            t2.setText(revString.toString());

        } else if (e.getActionCommand().equals("vowels")) {
            String str4 = t1.getText();
            int count = 0;
            for (int i = 0; i < str4.length(); i++) {
                if (str4.charAt(i) == 'a' || str4.charAt(i) == 'e' || str4.charAt(i) == 'i' || str4.charAt(i) == 'o'
                        || str4.charAt(i) == 'u') {
                    count++;
                }
            }
            t2.setText(Integer.toString(count));
        } else if (e.getActionCommand().equals("words")) {
            String str5 = t1.getText();
            int countWords = str5.split("\\s").length;
            t2.setText(Integer.toString(countWords));
        } else if (e.getActionCommand().equals("begin caps")) {
            String str6 = t1.getText();
            t2.setText(Character.toUpperCase(str6.charAt(0)) + str6.substring(1));

        } else if (e.getActionCommand().equals("letters")) {
            String str7 = t1.getText();
            int y = 0;
            for (int i = 0; i < str7.length(); i++) {
                if (str7.charAt(i) != ' ')
                    y++;
            }
            t2.setText(Integer.toString(y));

        }

    }

    public static void main(String args[]) {
        operationframe obj = new operationframe();
    }
}