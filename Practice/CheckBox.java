package Practice;

import java.awt.event.*;
import javax.swing.*;

public class CheckBox implements ActionListener{
    JFrame f;
    JCheckBox c1,c2;
    JLabel l;
CheckBox(){
    f = new JFrame("CheckBox");
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,500);

     c1 = new JCheckBox("c++");
     c2 = new JCheckBox("java");
    c1.setBounds(100,100,50,50);
    c2.setBounds(100,170,50,50);
    f.add(c1);
    f.add(c2);

    l = new JLabel();
    l.setBounds(100, 200, 300, 100);
    f.add(l);
    c1.addActionListener(this);
    c2.addActionListener((ActionListener) this);
   }
   public void actionPerformed(ActionEvent e){

    if(e.getSource() == c1)
       l.setText("c++ is sected");

    if(e.getSource() == c2)
       l.setText("java is sected");

   }
    public static void main(String[] args) {
        new CheckBox();
    }
}
