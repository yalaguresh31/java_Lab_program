package Part_B;

import javax.swing.*; 
import java.awt.event.*;
public class CheckBoxExample1 implements ActionListener{ 
JCheckBox checkBox1,checkBox2;
JLabel l1;
CheckBoxExample1(){ 
JFrame f= new JFrame("CheckBox Example"); 
f.setSize(400,400); 
f.setLayout(null); 
f.setVisible(true); 

checkBox1 = new JCheckBox("C++"); 
checkBox2 = new JCheckBox("Java"); 
checkBox1.setBounds(100,100, 50,50); 
checkBox2.setBounds(100,150, 70,50);

l1=new JLabel();
l1.setBounds(100, 200, 100, 30);

f.add(checkBox1); 
f.add(checkBox2);
f.add(l1);

checkBox1.addActionListener(this);
checkBox2.addActionListener(this);
} 
public void actionPerformed(ActionEvent e){

if(e.getSource()==checkBox1)
l1.setText("C++ selected");

if(e.getSource()==checkBox2)
l1.setText("Java selected");

}
public static void main(String args[]) { 
new CheckBoxExample1(); 
}
}
