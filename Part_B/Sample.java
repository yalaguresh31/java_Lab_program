package Part_B;

import javax.swing.*;
import java.awt.event.*;
public class Sample implements ActionListener{
	JFrame f;
	JButton b1,b2;
	JLabel l1;
	Sample()
	{
		f=new JFrame("4su21cs001");
		l1=new JLabel();
		b1=new JButton("A");
		b2=new JButton("B");
		b1.setBounds(30, 20, 50, 30);
		b2.setBounds(120, 20, 50, 30);
		l1.setBounds(50, 70, 180, 30);
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.setSize(200,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Sample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			l1.setText("A is Clicked");
		}
		if(e.getSource()==b2)
		{
			l1.setText("B is Clicked");
		}
	}

}
