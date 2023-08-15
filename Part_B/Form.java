package Part_B;

//6)
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class Form implements ActionListener{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField t1,t2,t3;
JRadioButton r1,r2;
JCheckBox c1,c2,c3,c4;
JButton b1,b2;
JPanel p1,p2,p3;
JTabbedPane tp;
JComboBox d,m,y;
JTextArea t;
ButtonGroup g1;
String dates[]
= { "1", "2", "3", "4", "5",
"6", "7", "8", "9", "10",
"11", "12", "13", "14", "15",
"16", "17", "18", "19", "20",
"21", "22", "23", "24", "25",
"26", "27", "28", "29", "30",
"31" };
String months[]
= { "Jan", "feb", "Mar", "Apr",
"May", "Jun", "July", "Aug",
"Sup", "Oct", "Nov", "Dec" };
String years[]
= { "1995", "1996", "1997", "1998",
"1999", "2000", "2001", "2002",
"2003", "2004", "2005", "2006",
"2007", "2008", "2009", "2010",
"2011", "2012", "2013", "2014",
"2015", "2016", "2017", "2018",
"2019" };
Form()
{
f=new JFrame("Form");
l1=new JLabel("Name:");
l1.setFont(new Font("Times new roman",Font.BOLD,20));
t1=new JTextField();
l2=new JLabel("Phone:");
l2.setFont(new Font("Times new roman",Font.BOLD,20));
t2=new JTextField();
l3=new JLabel("E_mail:");
l3.setFont(new Font("Times new roman",Font.BOLD,20));
t3=new JTextField();
l4=new JLabel("Gender");
l4.setFont(new Font("Arial",Font.BOLD,15));

r1=new JRadioButton("Male");
r2=new JRadioButton("Female");

l5=new JLabel("Known Languages");
l5.setFont(new Font("Arial",Font.BOLD,15));
l6=new JLabel("Date of Birth");
l6.setFont(new Font("Arial",Font.BOLD,15));
l7=new JLabel("Address");
l7.setFont(new Font("Arial",Font.BOLD,15));
c1=new JCheckBox("English");
c2=new JCheckBox("Kannada");
c3=new JCheckBox("Hindi");
c4=new JCheckBox("Tulu");
b1=new JButton("Submit");
b2=new JButton("Clear");
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
tp=new JTabbedPane();
g1= new ButtonGroup();
d=new JComboBox(dates);
m=new JComboBox(months);
y=new JComboBox(years);
t=new JTextArea();
tp.setBounds(10, 10, 120, 30);
l1.setBounds(20, 50, 70, 30);
t1.setBounds(90, 50, 230, 30);
l2.setBounds(20, 90, 70, 30);
t2.setBounds(90, 90, 230, 30);
l3.setBounds(20, 140, 70, 30);
t3.setBounds(90, 140, 230, 30);
l4.setBounds(30, 180, 70, 30);
r1.setBounds(60, 210, 70, 30);
r2.setBounds(140, 210, 70, 30);
l5.setBounds(30, 230, 150, 30);
c1.setBounds(60, 260, 70, 30);
c2.setBounds(140, 260, 90, 30);
c3.setBounds(240, 260, 70, 30);
c4.setBounds(60, 290, 70, 30);
l6.setBounds(30, 340, 150, 30);
d.setBounds(130, 340, 40, 30);
m.setBounds(170, 340, 50, 30);
y.setBounds(220, 340, 60, 30);
l7.setBounds(30, 380, 150, 30);
t.setBounds(100, 400, 200, 100);
b1.setBounds(40, 550, 90, 30);
b2.setBounds(150, 550, 90, 30);
tp.add("visit",p2);
tp.add("help",p3);
f.add(tp);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(l4);
f.add(r1);
f.add(r2);
f.add(l5);
f.add(c1);
f.add(c2);
f.add(c3);
f.add(c4);
f.add(b1);
f.add(b2);

g1.add(r1);
g1.add(r2);

f.add(l6);
f.add(d);
f.add(m);
f.add(y);
f.add(l7);
f.add(t);
f.setSize(400,650);
f.setLayout(null);
f.setVisible(true);
f.setResizable(false);
b1.addActionListener(this);
b2.addActionListener(this);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new Form();
}
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
if(e.getSource()==b1)
{
JOptionPane.showMessageDialog(f, "Form Submitted Sucessfully");
}
if(e.getSource()==b2)
{
t1.setText("");
t2.setText("");
t3.setText("");
t.setText("");
}
}
}

