import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class color_shade extends Frame implements AdjustmentListener
{
    JScrollBar s1,s2,s3;  //s1=red,s2=green,s3=blue;
    TextField t1,t2,t3;
    
    color_shade()
    {
        setVisible(true);
        setSize(500, 500);
      
        s1=new JScrollBar();
        s1.setMinimum(0);
        s1.setMaximum(255);
        s1.setOrientation(JScrollBar.HORIZONTAL);
      
        s2=new JScrollBar();
        s2.setMinimum(0);
        s2.setMaximum(255);
        s2.setOrientation(JScrollBar.HORIZONTAL);
        
        s3=new JScrollBar();
        s3.setMinimum(0);
        s3.setMaximum(255);
        s3.setOrientation(JScrollBar.HORIZONTAL);
        
          
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        
    Panel p2=new Panel();
    p2.setLayout(new GridLayout(1,3,5,5));
    p2.add(t1);

      Panel p1=new Panel();
       p1.setLayout(new GridLayout(3, 1,2,2));
       p1.add(s1);
       p1.add(s2);
       p1.add(s3);

        add(p1,BorderLayout.NORTH);
        //add(p2);
       s1.addAdjustmentListener(this);
       s2.addAdjustmentListener(this);
       s3.addAdjustmentListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
         Color c=new Color(s1.getValue(),s2.getValue(),s3.getValue());
         setBackground(c);
    }

    public static void main(String[] args) {
        new color_shade();
    }
}


/* 
        t1=new JTextField();
        t1.setBounds(230, 30, 30, 100);
        t2=new JTextField();
        t2.setBounds(270, 30, 30, 100);
        t3=new JTextField();
        t3.setBounds(310, 30, 30, 100);

       add(t1);add(t2);add(t3);*/
     