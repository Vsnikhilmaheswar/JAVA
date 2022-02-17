package lab21;
import java.awt.*;
import java.awt.event.*;
class  Mousehanding extends Frame implements MouseListener,MouseMotionListener
{
public Mousehanding()
{
  setSize(400,400);
  setVisible(true);
//close button
  addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent we) {
         System.exit(0);
       }
    });

addMouseListener(this);
addMouseMotionListener(this);

}

@Override
public void mouseDragged(MouseEvent e) {
// TODO Auto-generated method stub
setTitle("Draged");
System.out.println("MOUSE draged");
Graphics g= getGraphics();
g.fillOval(e.getX(),e.getY(),10,10);  

}

@Override
public void mouseMoved(MouseEvent e) {
// TODO Auto-generated method stub
setBackground(Color.yellow);
setTitle("MOVED");
Graphics g= getGraphics();
g.drawString("hi my mouse is Moved",getMousePosition().x,getMousePosition().y);
}

@Override
public void mouseClicked(MouseEvent e) {
// TODO Auto-generated method stub
setBackground(Color.green);
setTitle("Clicked");
System.out.println("MOUSE CLICKED");
}

@Override
public void mousePressed(MouseEvent e) {
// TODO Auto-generated method stub
setBackground(Color.red);
setTitle("PRESSED");
System.out.println("mousePressed");
}

@Override
public void mouseReleased(MouseEvent e) {
// TODO Auto-generated method stub
setBackground(Color.blue);
setTitle("RELEASED");
System.out.println("  mouseReleased");
}

@Override
public void mouseEntered(MouseEvent e) {
// TODO Auto-generated method stub
setBackground(Color.gray);
setTitle("ENTERED");
System.out.println(" mouseEntered");

}

@Override
public void mouseExited(MouseEvent e) {
// TODO Auto-generated method stub
setBackground(Color.black);
System.out.println("MOUSE exited");

}
public static void main(String[] args) {
new Mousehanding();
}

}
