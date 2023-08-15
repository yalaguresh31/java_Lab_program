package Part_B;

import javax.swing.*;
import java.awt.event.*;
public class radio implements ActionListener{
JFrame f;
JRadioButton r1,r2,r3;
ButtonGroup g1;
JLabel l1;
radio(){
f=new JFrame("Radio Button");
r1=new JRadioButton("CSE");
r2=new JRadioButton("ISE");
r3=new JRadioButton("AD");
l1=new JLabel();
g1=new ButtonGroup();
r1.setBounds(20, 20, 50, 30);
r2.setBounds(70, 20, 50, 30);
r3.setBounds(120, 20, 50, 30);
l1.setBounds(40, 70, 120, 30);
f.add(r1);
f.add(r2);
f.add(r3);
g1.add(r1);
g1.add(r2);
g1.add(r3);
f.add(l1);
f.setLayout(null);
f.setSize(300,200);
f.setVisible(true);
f.setResizable(false);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==r1)
l1.setText("CSE Selected");
if(e.getSource()==r2)
l1.setText("ISE Selected");
if(e.getSource()==r3)
l1.setText("AD Selected");
}
public static void main(String[] args) {
new radio();
}
}
