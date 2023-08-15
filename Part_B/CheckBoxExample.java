package Part_B;

//3)Java JCheckBox examples.
import javax.swing.*; 
public class CheckBoxExample { 
CheckBoxExample(){ 
JFrame f= new JFrame("CheckBox Example"); 

JCheckBox checkBox1 = new JCheckBox("C++"); 
JCheckBox checkBox2 = new JCheckBox("Java"); 
checkBox1.setBounds(100,100, 50,50); 
checkBox2.setBounds(100,150, 70,50); 
f.add(checkBox1); 
f.add(checkBox2); 

JRadioButton r1=new JRadioButton("Male");
JRadioButton r2=new JRadioButton("Female");
r1.setBounds(60, 210, 70, 30);
r2.setBounds(140, 210, 70, 30);
f.add(r1);
f.add(r2);

JTextArea t=new JTextArea();
t.setBounds(100, 300, 200, 100);
f.add(t);

f.setSize(600,600); 
f.setLayout(null); 
f.setVisible(true); 
} 
public static void main(String args[]) { 
new CheckBoxExample(); 
}
} 
