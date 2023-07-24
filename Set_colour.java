import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class set extends Frame implements ActionListener
{
    Button b1,b2;
    set()
    {
         setVisible(true);
          setSize(500, 500);
          setLayout(new FlowLayout());

          b1=new Button("Gray");
          b2=new Button("Megenta");
         add(b1);add(b2);
          b1.addActionListener(this);
          b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
         {
            setBackground(Color.GRAY);
         
         }
         
        if(ae.getSource()==b2)
         {
            setBackground(Color.MAGENTA);
         }
    }
    public static void main(String[] args) {
        new set();
    }
}