import javax.swing.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
    JFrame f;
    JTextFeild t;
    JButton[] b = JButton[17];
    String[] bTexts = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+","C"};
    Calculator(){
        f = new JFrame("Calculator");
        t = new JTextFeild();
        f.setSize(400,500);
        f.setLayout(null);
        f.setvisible(true);
    }
    public static void main(String[] args) {
      new  Calculator();
    }
}