import javax.swing.*;
import java.awt.event.*;
public class CalculatorSwing implements ActionListener{
    JFrame f;
	JTextField t;
	JButton[] b = new JButton[17];
    String[] bText = {"7", "8","9","/","4","5", "6", "*","1","2", "3","-","0",".","=","+","C"};
    static double n1=0,n2=0,result=0;
	static int op=0;
       CalculatorSwing(){
		//create the frame and text field
        f = new JFrame("Calculator");
        t = new JTextField();
        f.setSize(400, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
        t.setBounds(30, 40, 280, 30);
        f.add(t);
		
// 		//set buttons size
        int x = 40,y = 100,index = 0;
        for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				b[index] = new JButton(bText[index]);
                b[index].setBounds(x, y, 50, 40);
				f.add(b[index]);
				x = x+70;
				index++;
			}
			x = 40;
			y = y+70;
		}//end of for

    b[16] = new JButton(bText[16]);
    b[16].setBounds(110,380,100,40);
    f.add(b[16]);
	
	// Add action listeners to buttons
    for (JButton button : b) 
        button.addActionListener(this);
}//end of CalculatorSwing	

public void actionPerformed(ActionEvent e){
	for(int i = 0; i<= 16; i++){
		if((i==3 || i==7 || i==11 || i==15)&& (e.getSource()==b[i])){
			n1=Double.parseDouble(t.getText());
		switch(i){
			case 15 -> op=1;
			case 11 -> op=2;
			case 7  -> op=3;
			case 3  -> op=4;
		      }
	 	t.setText("");
		}
		else if(i==14 || i==16)
		      	continue;
		else{
			  if(e.getSource()==b[i])
			 	t.setText(t.getText().concat(bText[i]));
		}
	  }//end of for 

	if(e.getSource()==b[14]){
		n2=Double.parseDouble(t.getText());
		result = switch(op){
			case 1-> n1+n2;
			case 2-> n1-n2;
			case 3-> n1*n2;
			case 4-> n1/n2;
			default-> 0;
			  };//end of switch
		  t.setText(""+result);
	}	
	
	if(e.getSource()==b[16])
		t.setText("");
}
    public static void main(String[] args){
        new CalculatorSwing();
    }
}
