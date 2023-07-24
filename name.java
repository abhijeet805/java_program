import java.awt.*;
import java.awt.event.*;

class name extends Frame implements ActionListener
{
    Button b1;
    Label l1,l2;
    TextField t1,t2;
    name()
    {
         setVisible(true);
          setSize(500, 500);
          setLayout(new FlowLayout());
          setBackground(Color.DARK_GRAY);

          l1=new Label("Enter name");
          l2=new Label("message");
          b1=new Button("OK");
          t1=new TextField(8);
          t2=new TextField(25);

          add(l1);add(t1);add(l2);add(t2);add(b1);
          
         b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {   
        String s1;
        if(ae.getSource()==b1)
         {
             s1=t1.getText();
             s1=s1.toUpperCase();
             t2.setText("Hellow, "+s1+" nice to meet you!");
         }
    }

    public static void main(String[] args) {
        new name();
    }
}