import javax.swing.*;
import java.awt.event.*;
public class CalculatorSwing1 implements ActionListener{
    JFrame f;
	JTextField t;
	JButton[] b = new JButton[17];
    String[] bTexts = {"7", "8","9","/","4","5", "6", "*","1","2", "3","-","0",".","=","+","C"};
    static double num1=0,num2=0,result=0;
	static String operator="";
       CalculatorSwing1(){
		//create the frame
        f = new JFrame("Calculator");
        t = new JTextField();
        t.setBounds(30, 40, 280, 30);
        f.add(t);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		//set buttons size
        int x = 40,y = 100,index = 0;
        for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				b[index] = new JButton(bTexts[index]);
                b[index].setBounds(x, y, 50, 40);
				f.add(b[index]);
				x += 70;
				index++;
			}
			x = 40;
			y += 70;
		}
    b[16] = new JButton(bTexts[16]);
    b[16].setBounds(110,380,100,40);
    f.add(b[16]);

	// Add action listeners to buttons
    for (JButton button : b) 
        button.addActionListener(this);
}//end of CalculatorSwing	

public void actionPerformed(ActionEvent e){
	// if(e.getSource()==b1)
	// 		t.setText(t.getText().concat("1"));
  String buttonText = ((JButton)e.getSource()).getText();
	if(buttonText.matches("[0-9.]"))
		t.setText(t.getText().concat(buttonText));
	
	 if(buttonText.matches("[+\\-*/]")){
		num1 = Double.parseDouble(t.getText());
		operator = buttonText;
		t.setText("");
	} 

	if(e.getSource()==b[14]){
		num2=Double.parseDouble(t.getText());
		switch(operator){
			case "+"-> result=num1+num2;
			case "-"-> result=num1-num2;
			case "*"-> result=num1*num2;
			case "/"-> result=num1/num2;
			default-> result=0;
			  }
		  t.setText(""+result);
	}	
	if(e.getSource()==b[16])
		t.setText("");
}
    public static void main(String[] args){
        new CalculatorSwing1();
    }
}
