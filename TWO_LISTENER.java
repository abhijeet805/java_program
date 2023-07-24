import java.awt.*;
import java.awt.event.*;

class Mouse_motion1 extends Frame implements MouseMotionListener,MouseListener
{  
    TextField t1,t2;
    Label l1,l2;
    Mouse_motion1()
    {
       setVisible(true);
       setSize(500, 500);
       setBackground(Color.MAGENTA);
       setLayout(new FlowLayout());

       l1=new Label("Mouse Moved Location");
       l2=new Label("Mouse clicked Location");
       t1=new TextField(30);
       t2=new TextField(30);
       add(l1);add(t1);add(l2);add(t2);
       addMouseMotionListener(this);
       addMouseListener(this);
    }
    public void mouseMoved(MouseEvent me)
    {
        t1.setText("Move X-Direction"+me.getX()+"Move Y-Direction"+me.getY());
    }public void mouseClicked(MouseEvent me)
   {
         t2.setText("Move X-Direction"+me.getX()+"Move Y-Direction"+me.getY());
   }
   public void mousePressed(MouseEvent me)
   {  
   }
   public void mouseReleased(MouseEvent me)
   {     
   }
   public void mouseEntered(MouseEvent me)
   {
   }
   public void mouseExited(MouseEvent me)
   {
    
   }
    public void mouseDragged(MouseEvent me)
    {
    }
    public static void main(String[] args) {
        new Mouse_motion1();
    }
}