import java.awt.*;
import java.awt.event.*;
class mouse extends Frame implements MouseListener
{
   Label l1;
   TextField t1;
   mouse()
   {
     setVisible(true);
     setBackground(Color.LIGHT_GRAY);
     setLayout(new FlowLayout());

     l1=new Label("Mouse massage=");
     t1=new TextField(10);
     add(l1);add(t1);
   
    addMouseListener(this);
    }
   public void mouseClicked(MouseEvent me)
   {
     t1.setText("Mouse is clicked");
   }
   public void mousePressed(MouseEvent me)
   {
      t1.setText("Mouse is Pressed");
   }
   public void mouseReleased(MouseEvent me)
   {
      t1.setText("Mouse is Realeasd");
   }
   public void mouseEntered(MouseEvent me)
   {
      t1.setText("Mouse is Etered");
   }
   public void mouseExited(MouseEvent me)
   {
      t1.setText("Mouse is Exited");
   }

   public static void main(String[] args) {
    new mouse();
   }
}