package lab21;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class traficlight extends JPanel implements ActionListener {
JRadioButton buttonred,buttongreen,buttonyellow;
Color red,green,yellow;
traficlight(){
setBounds(0,0,400,480);
buttonred= new JRadioButton("RED");
buttongreen= new JRadioButton("GREEN");
buttonyellow= new JRadioButton("YELLOW");
buttonred.setSelected(true);
red=Color.red;
yellow=getBackground();
green=getBackground();
ButtonGroup g=new ButtonGroup();
g.add(buttongreen);
g.add(buttonred);
g.add(buttonyellow);
add(buttongreen);
add(buttonred);
add(buttonyellow);
buttonred.addActionListener(this);
buttongreen.addActionListener(this);
buttonyellow.addActionListener(this);
}
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawOval(50,50,50,50);
g.drawOval(50,110,50,50);
g.drawOval(50,170,50,50);
g.setColor(red);
g.fillOval(50,50,50,50);
g.setColor(green);
g.fillOval(50,110,50,50);
g.setColor(yellow);
g.fillOval(50,170,50,50);
}
public static void main(String[] args) {
JFrame f=new JFrame();
f.setVisible(true);
f.setSize(400,400);
f.setLayout(null);
traficlight t =new traficlight();
   f.add(t);


}
@Override
public void actionPerformed(ActionEvent e) {
if(buttonred.isSelected()==true)
{
red=Color.red;
yellow=getBackground();
green=getBackground();
}
else if(buttongreen.isSelected()==true)
{
red=getBackground();
yellow=getBackground();
green=Color.green;
}
else if(buttonyellow.isSelected()==true)
{
red=getBackground();
yellow=Color.yellow;
green=getBackground();
}
repaint();
}
}
