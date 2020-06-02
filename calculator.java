import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
public class calculator implements ActionListener
{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextArea textarea = new JTextArea(2,10);
JButton b1 = new JButton("1");
JButton b2 = new JButton("2");
JButton b3 = new JButton("3");
JButton b4 = new JButton("4");
JButton b5 = new JButton("5");
JButton b6 = new JButton("6");
JButton b7 = new JButton("7");
JButton b8 = new JButton("8");
JButton b9 = new JButton("9");
JButton b0 = new JButton("0");
JButton badd = new JButton("+");
JButton bsub = new JButton("-");
JButton bmul = new JButton("*");
JButton bdiv = new JButton("/");
JButton bequal = new JButton("=");
JButton bclear = new JButton("C");
JButton bdot = new JButton(".");
double n1 , n2 , result ;
int addc = 0;
int subc =0;
int mulc = 0;
int divc =0;
public calculator()
{
frame.setSize(340,450);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setTitle("FIRST PROJECT");
frame.add(panel);
frame.setBackground(Color.RED);
Border border =   BorderFactory.createLineBorder(Color.BLACK);
panel.add(textarea);
textarea.setBackground(Color.WHITE);
textarea.setBorder(border);
Font  f = new Font("arial",Font.BOLD,33);
textarea.setFont(f);
textarea.setBackground(Color.WHITE);
textarea.setForeground(Color.BLACK);
textarea.setPreferredSize(new Dimension(2,10));
textarea.setLineWrap(true);
b7.setPreferredSize(new Dimension(100,40));
b8.setPreferredSize(new Dimension(100,40));
b9.setPreferredSize(new Dimension(100,40));
b4.setPreferredSize(new Dimension(100,40));
b5.setPreferredSize(new Dimension(100,40));
b6.setPreferredSize(new Dimension(100,40));
b1.setPreferredSize(new Dimension(100,40));
b2.setPreferredSize(new Dimension(100,40));
b3.setPreferredSize(new Dimension(100,40));
b0.setPreferredSize(new Dimension(100,40));
badd.setPreferredSize(new Dimension(100,40));
bsub.setPreferredSize(new Dimension(100,40));
bmul.setPreferredSize(new Dimension(100,40));
bdiv.setPreferredSize(new Dimension(100,40));
bdot.setPreferredSize(new Dimension(100,40));
bclear.setPreferredSize(new Dimension(100,40));
bequal.setPreferredSize(new Dimension(100,40));
panel.setBackground(Color.RED);
panel.add(b7);
panel.add(b8);
panel.add(b9);
panel.add(b4);
panel.add(b5);
panel.add(b6);
panel.add(b1);
panel.add(b2);
panel.add(b3);
panel.add(b0);
panel.add(badd);
panel.add(bsub);
panel.add(bmul);
panel.add(bdiv);
panel.add(bclear);
panel.add(bequal);
panel.add(bdot);
b0.setBackground(Color.BLACK);
b1.setBackground(Color.BLACK);
b2.setBackground(Color.BLACK);
b3.setBackground(Color.BLACK);
b4.setBackground(Color.BLACK);
b5.setBackground(Color.BLACK);
b6.setBackground(Color.BLACK);
b7.setBackground(Color.BLACK);
b8.setBackground(Color.BLACK);
b9.setBackground(Color.BLACK);
badd.setBackground(Color.BLACK);
bsub.setBackground(Color.BLACK);
bmul.setBackground(Color.BLACK);
bdiv.setBackground(Color.BLACK);
bequal.setBackground(Color.BLACK);
bdot.setBackground(Color.BLACK);
bclear.setBackground(Color.BLACK);
b0.setForeground(Color.WHITE);
b1.setForeground(Color.WHITE);
b2.setForeground(Color.WHITE);
b3.setForeground(Color.WHITE);
b4.setForeground(Color.WHITE);
b5.setForeground(Color.WHITE);
b6.setForeground(Color.WHITE);
b7.setForeground(Color.WHITE);
b8.setForeground(Color.WHITE);
b9.setForeground(Color.WHITE);
bequal.setForeground(Color.WHITE);
badd.setForeground(Color.WHITE);
bsub.setForeground(Color.WHITE);
bdiv.setForeground(Color.WHITE);
bmul.setForeground(Color.WHITE);
bclear.setForeground(Color.WHITE);
bdot.setForeground(Color.WHITE);
b1.addActionListener((ActionListener)this);
b0.addActionListener((ActionListener)this);
b2.addActionListener((ActionListener)this);
b3.addActionListener((ActionListener)this);
b4.addActionListener((ActionListener)this);
b5.addActionListener((ActionListener)this);
b6.addActionListener((ActionListener)this);
b7.addActionListener((ActionListener)this);
b8.addActionListener((ActionListener)this);
b9.addActionListener((ActionListener)this);
badd.addActionListener((ActionListener)this);
bsub.addActionListener((ActionListener)this);
bmul.addActionListener((ActionListener)this);
bdiv.addActionListener((ActionListener)this);
bclear.addActionListener((ActionListener)this);
bequal.addActionListener((ActionListener)this);
bdot.addActionListener((ActionListener)this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==bclear)
{
n1 = 0.0;
n2 = 0.0;
textarea.setText("");
}
if(e.getSource()==b1)
{
textarea.append("1");
}
if(e.getSource()==b2)
{
textarea.append("2");
}
if(e.getSource()==b0)
{
textarea.append("0");
}
if(e.getSource()==b3)
{
textarea.append("3");
}
if(e.getSource()==b4)
{
textarea.append("4");
}
if(e.getSource()==b5)
{
textarea.append("5");
}
if(e.getSource()==b6)
{
textarea.append("6");
}
if(e.getSource()==b7)
{
textarea.append("7");
}
if(e.getSource()==b8)
{
textarea.append("8");
}
if(e.getSource()==b9)
{
textarea.append("9");
}
if(e.getSource()==bdot)
{

textarea.append(".");
}
if(e.getSource()==badd)
{
n1 = number();
textarea.setText("");
addc = 1;
subc = 0;
mulc = 0;
divc = 0;
}
if(e.getSource()==bsub)
{
n1 = number();
textarea.setText("");
addc = 0;
subc = 1;
mulc = 0;
divc = 0;
}
if(e.getSource()==bmul)
{
n1 = number();
textarea.setText("");
addc = 0;
subc = 0;
mulc = 1;
divc = 0;
}
if(e.getSource()==bdiv)
{
n1 = number();
textarea.setText("");
addc = 0;
subc = 0;
mulc = 0;
divc = 1;
}


if(e.getSource()==bequal)
{
n2 = number();
if(addc > 0)
{
result = n1+n2;
textarea.setText(Double.toString(result));
}
if(subc > 0)
{
result = n1-n2;
textarea.setText(Double.toString(result));
}
if(mulc > 0)
{
result = n1*n2;
textarea.setText(Double.toString(result));
}
if(divc > 0)
{
result = n1/n2;
textarea.setText(Double.toString(result));
}
}
}

public double number()
{
double n1 = 0.0;
String s;
s = textarea.getText();
n1 = Double.valueOf(s);
return n1;
}
}
