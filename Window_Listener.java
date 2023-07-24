import java.awt.*;
import java.awt.event.*;

class window extends Frame implements WindowListener
{
       window()
       {
       setVisible(true);
       setSize(500, 500);
       setLayout(new FlowLayout());
      
       addWindowListener(this);
      }
      public void windowOpened(WindowEvent we)
      {
        setBackground(Color.blue);
        setTitle("Window Opened");
      }
      public void windowClosed(WindowEvent we)
      {
         setBackground(Color.green);
        setTitle("Window Closed");
      }
      public void windowClosing(WindowEvent we)
      {
         setBackground(Color.black);
         dispose();
        setTitle("Window closing");
      }
      public void windowIconified(WindowEvent we)
      {
         setBackground(Color.MAGENTA);
         setTitle("Window Iconified");
      }
      public void windowDeiconified(WindowEvent we)
      {
         setBackground(Color.YELLOW);
         setTitle("Window DeIconified");
      }
      public void windowActivated(WindowEvent we)
      {
         setBackground(Color.darkGray);
         setTitle("Window Activated");
      }
      public void windowDeactivated(WindowEvent we)
      {
         setBackground(Color.MAGENTA);
         setTitle("Window Deactivated");
      }
  public static void main(String[] args) {
    new window();
  }
}