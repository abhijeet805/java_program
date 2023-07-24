import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class swing_add extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1;
   
    swing_add()
    {
        setVisible(true);
        setSize(1000, 1000);
        setLayout(null);
        
        l1=new JLabel("Addition Program");
        l1.setBounds(714, 62, 400, 80);
        Font f1=new Font("Dialog",Font.BOLD,30);
        l1.setFont(f1);
        l1.setForeground(Color.MAGENTA);

        l2=new JLabel("Enter No1=");
        l2.setBounds(485, 150, 300, 80);
        Font f2=new Font("Monospaced",Font.BOLD,25);
        l2.setFont(f2);
        l2.setForeground(Color.RED);

        l3=new JLabel("Enter No2=");
        l3.setBounds(478,250 , 300, 80);
        Font f3=new Font("Monospaced",Font.ITALIC,25);
        l3.setFont(f3);
        l3.setForeground(Color.RED);

        t1=new JTextField();
        t1.setBounds(660, 166, 200, 50);

        t2=new JTextField();
        t2.setBounds(660, 266, 200, 50);
        
        b1=new JButton("Addition");
        b1.setBounds(478, 370, 200, 50);
        
        add(l1);add(l2);add(t1);add(l3);add(t2);add(b1);
        b1.addActionListener(this);
    } 
  public void actionPerformed(ActionEvent ae)
  {
      if(ae.getSource()==b1)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t1.getText());

            int c=a+b;
            JOptionPane.showMessageDialog(this,"Addition="+c);
        }
  }
    public static void main(String[] args) {
       new swing_add();       
    }
}