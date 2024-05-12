import javax.swing.*;
 import java.awt.event.*; 
 import java.awt.*;
class color extends JFrame{
    JPanel panel;
    JLabel label;
    color(){
        setSize(500,150);
        setTitle("Color Specification");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel();
        add(panel);
        setVisible(true);
        
        
    }
    
    void Panel(){
        
        label=new JLabel("Hit The Button And see the Magic");
        panel=new JPanel();
        JButton red=new JButton("Red");
        JButton blue=new JButton("Blue");
        JButton green=new JButton("Green");
        JButton yellow=new JButton("Yellow");
        panel.add(label);
        
        
        red.addActionListener(new forred());
        blue.addActionListener(new forblue());
        green.addActionListener(new forgreen());
        yellow.addActionListener(new foryellow());
        
        
        
        panel.add(red);
        panel.add(blue);
        panel.add(green);
        panel.add(yellow);
        
        
    }
    
    
    private class forred implements ActionListener{
        
        public void actionPerformed(ActionEvent a){
            
            label.setForeground(Color.GREEN);
            panel.setBackground(Color.RED);
            
        }
    } 
    
    
    private class forblue implements ActionListener{
        
        public void actionPerformed(ActionEvent a){
            
            label.setForeground(Color.YELLOW);
            panel.setBackground(Color.BLUE);
            
        }
  
}
    private class forgreen implements ActionListener{
        
        public void actionPerformed(ActionEvent a){
            
            label.setForeground(Color.DARK_GRAY);
            panel.setBackground(Color.GREEN);
            
        }
  
}
    private class foryellow implements ActionListener{
        
        public void actionPerformed(ActionEvent a){
            
            label.setForeground(Color.black);
            panel.setBackground(Color.YELLOW);
            
        }
  
}


}

public class colorchng {

    
    public static void main(String[] args) {
 
        new color();
  
    }
    
}