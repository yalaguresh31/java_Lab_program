package Part_B;

//4) Java ComboBox Example
import javax.swing.*; 
public class ComboBoxExample { 
JFrame f; 
ComboBoxExample(){ 
f=new JFrame("ComboBox Example"); 

String country[]={"India","Aus","U.S.A","England","Newzealand"}; 
JComboBox cb=new JComboBox(country); 
cb.setBounds(50, 50,90,20); 
f.add(cb); 
f.setLayout(null); 
f.setSize(300,300); 
f.setResizable(false);
f.setVisible(true); 
} 
public static void main(String[] args) { 
new ComboBoxExample(); 
} 
} 

