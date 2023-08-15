package Practice;

import javax.swing.*;
public class CheckMenu {
    JFrame f;
    JComboBox cb;
    String s[] = {"inr","USN","ero"};
    CheckMenu(){
        f = new JFrame("checkMenu");
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        
        cb=new JComboBox(s); 
        cb.setBounds(50, 50,90,20); 
        f.add(cb); 

    }
   public static void main(String[] args) {
      new CheckMenu();

   } 
}
