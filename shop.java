import javax.swing.*;
import java.awt.event.*;   
 public class shop implements ActionListener{ 
 JFrame f;
 JPanel p1;
 JTextField t1,t2,t3;
 JButton b1,b2;
  JLabel l1,l2,l3;
  JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
   shop(){
  f=new JFrame("bill");
p1=new JPanel();
l1=new JLabel("shopping");
b1=new JButton("ORDER");
l1.setBounds(50,50,300,30);
c1 = new JCheckBox("Milk @14.57");
c1.setBounds(50,100,200,30);
c2 = new JCheckBox("Loaf of Fresh White Bread @10.34 ");
c2.setBounds(50,150,200,30);
c3 = new JCheckBox("Rice @5.86 ");
c3.setBounds(50,200,200,30);
c4 = new JCheckBox("Eggs @15.97 ");
c4.setBounds(50,250,200,30);
c5 = new JCheckBox("Local Cheese @44.46");
c5.setBounds(50,300,200,30);
c6 = new JCheckBox("Apples @53.69");
c6.setBounds(50,350,200,30);
c7 = new JCheckBox("Banana @15.46");
c7.setBounds(50,400,200,30);
 c8 = new JCheckBox("Oranges @27.63");
 c8.setBounds(50,450,200,30);
 c9 = new JCheckBox("Tomato @8.84 ");
 c9.setBounds(50,500,200,30);
 c10 = new JCheckBox("Potato @6.02 ");
 c10.setBounds(50,550,200,30);
 c11= new JCheckBox("Onion @3.38");
 c11.setBounds(50,600,200,30);
 b1.setBounds(200,700,100,50);
  b1.addActionListener(this);
f.add(b1);f.add(l1);f.add(c1);f.add(c2);f.add(c3);f.add(c4);f.add(c5);f.add(c6);f.add(c7);f.add(c8);f.add(c9);f.add(c10);f.add(c11);
f.setSize(800,800);
f.setLayout(null); 
f.setVisible(true);
 }
  public void actionPerformed(ActionEvent e) {  
  float amount;
  String out="";
  if(c1.isSelected()){
	  amount+=14.57;
	   out="Milk:14.57\n";
  }
  else if(c2.isSelected()){
	   amount+=10.34;
	   out="Loaf of Fresh White Bread :10.34\n ";
  }
  else if(c3.isSelected()){
	   amount+=5.86;
	    out="Rice :5.86\n ";
  }
  else if(c4.isSelected()){
	   amount+=15.97;
	    out="Eggs :15.97 \n";
  }
  else if(c5.isSelected()){
	   amount+=44.46;
	    out="Local Cheese :44.46\n";
  }
  else if(c6.isSelected()){
	   amount+=53.69;
	    out="Apples :53.69\n";
  }
  else if(c7.isSelected()){
	   amount+=15.46;
	    out="Banana :15.46\n";
  }
  else if(c8.isSelected()){
	   amount+=27.63;
	    out="Oranges :27.63\n";
  }
 else if(c9.isSelected()){
	  amount+=8.84;
	   out="Tomato :8.84\n ";
  }
 else if(c10.isSelected()){
	  amount+=6.02;
	   out="Potato :6.02\n ";
  }
 else if(c11.isSelected()){
	  amount+=3.38;
	   out="Onion :3.38\n";
  }
  out +="-----------\n";
  JOptionPane.showMessageDialog(this,out+"TOTAL:"+amount);
  }
 public static void main(String[] args) {  
    new shop();  
} }  	


 
 
 
 


 