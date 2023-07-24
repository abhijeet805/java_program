import java.awt.*;
import java.awt.event.*;
class Number_check extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    Number_check()
    {
       setVisible(true);
       setSize(500, 500);
       setBackground(Color.DARK_GRAY);
       setLayout(new FlowLayout());

       l1=new Label("Enter Numer=");
       l2=new Label("Result=");

       t1=new TextField(4);
       t2=new TextField(15);
       b1=new Button("Palindrome");
       b2=new Button("Armstrong");
       b3=new Button("Even/odd");
       b4=new Button("Exit");
       

       add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);add(b3);add(b4);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);

    }
     public void actionPerformed(ActionEvent ae)
       {
          if(ae.getSource()==b1)
          {
            int a=Integer.parseInt(t1.getText());
            int num=a;
            int s=0;
            while(a>0)
            {
                int d=a%10;
                s=(s*10)+d;
                a=a/10;
            }
            if(s==num)
              t2.setText("Number is palindrome");
            else 
            t2.setText("Number is Not palindrome");

          }

          int s=0;
          if(ae.getSource()==b2)
          {
            int n=Integer.parseInt(t1.getText());
            int num=n;
            while (n>0) {
                int d=n%10;
                s=s+(d*d*d);
                n=n/10;
            }
            if(s==num)
              t2.setText("Number is Armstrong");
            else
               t2.setText("Number is Not Armstrong");
          }
          if(ae.getSource()==b3)
          {
            int n=Integer.parseInt(t1.getText());
            if(n%2==0)
              t2.setText("Number is Even");
            else 
                t2.setText("Number is Odd");
            
          }
          if(ae.getSource()==b4)
            dispose();
        }
    public static void main(String[] args) {
        Number_check ob=new Number_check();
    }
 
}
   
