package Part_B;

//1)Examples of JTextField, JPasswordField, JLabel, JButton, Background color& JOptionPane.
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class DesignSample implements ActionListener{
JFrame f;
JTextField t;
JPasswordField p;
JLabel l1,l2;
JButton b1,b2;
DesignSample(){
f=new JFrame("Design");
t=new JTextField();
p=new JPasswordField();
l1=new JLabel("User Name:");
l2=new JLabel("Password:");
b1=new JButton("Submit");
b2=new JButton("Clear");
t.setBounds(100, 40, 70, 30);
p.setBounds(100,80,70,30);
l1.setBounds(20, 30, 70, 40);
l2.setBounds(20, 80, 70, 40);
b1.setBounds(30, 130, 90, 50);
b2.setBounds(140, 130, 90, 50);
f.add(l1);
f.add(t);
f.add(l2);
f.add(p);
f.add(b1);
f.add(b2);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
f.setResizable(false);

f.getContentPane().setBackground(Color.pink);

b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {

if(e.getSource()==b1)
JOptionPane.showMessageDialog(f,"Login Successfully");

if(e.getSource()==b2){
t.setText("");
p.setText("");
  }

}
public static void main(String[] args){

new DesignSample();
}
}
