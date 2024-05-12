import javax.swing.*;
import java.awt.event.*;   
 public class random{ 
 JFrame f;
 JPanel p1;
 JTextField t1,t2,t3;
 JButton b1,b2;
  JLabel l1,l2,l3;
 JTextArea te;
 JPasswordField pass;
random(){ 
f=new JFrame("NO");
p1=new JPanel();
//te=new JTextArea();
t1=new JTextField();
pass =new JPasswordField();  
	l1=new JLabel("USER-NAME");
	l1.setBounds(0,100,150,30);																																
    t1.setBounds(200,100, 100,30);  
	//te.setBounds(0,0,50,20);
    t2=new JTextField();
l2=new JLabel("PASSWORD");
	l2.setBounds(0,150,150,30);		
    pass.setBounds(200,150, 100,30);   

  	
b1=new JButton("LOGIN");
b1.setBounds(150,250,50,50);

f.add(te);f.add(l1);f.add(l2);f.add(t1);f.add(pass);
f.setSize(500,600);
f.setVisible(true);
b1.addActionListener(new ActionListener(){

 public void actionPerformed(ActionEvent e) {       
                   String data = "Username " + t1.getText();  
                   data += ", Password: "   
                   + new String(value.getPassword());   
                   pass.setText(data);          
}});  
 }
public static void main(String Arg[]){
	new random();
 }}