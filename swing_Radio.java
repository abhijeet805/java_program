import javax.swing.*;
import java.awt.*;

class button extends JFrame
{
     JCheckBox c1,c2,c3;
     JRadioButton r1,r2,r3;
     JList lst;
     button()
     {
       setVisible(true);
       setSize(500,500);
       setLayout(new FlowLayout());
       c1=new JCheckBox("Java");
       c2=new JCheckBox("PHP");
       c3=new JCheckBox("python");

       r1=new JRadioButton("FY");
       r2=new JRadioButton("SY");
       r3=new JRadioButton("TY");
    add(c1);add(c2);add(c3);add(r1);add(r2);add(r3); 
    }
     public static void main(String[] args) {
       new button();        
     }  
}
