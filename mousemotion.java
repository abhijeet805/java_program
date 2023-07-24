import java.awt.*;
import java.awt.event.*;

class Mouse_motion extends Frame implements MouseMotionListener
{  
    TextField t1,t2;
    Label l1;
    Mouse_motion()
    {
       setVisible(true);
       setSize(500, 500);
       setBackground(Color.MAGENTA);
       setLayout(new FlowLayout());

       l1=new Label("Mouse Location");
       t1=new TextField(30);
       t2=new TextField(30);
       add(l1);add(t1);add(t2);
       addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent me)
    {
        t1.setText("Move X-Direction"+me.getX()+"Move Y-Direction"+me.getY());
    }
    public void mouseDragged(MouseEvent me)
    {
      t2.setText("Mouse Dragged");
    }
    public static void main(String[] args) {
        new Mouse_motion();
    }
}