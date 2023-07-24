import java.awt.*;
import java.awt.event.*;
class string extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3;
    string()
    {
       setVisible(true);
       setSize(500, 500);
       setBackground(Color.DARK_GRAY);
       setLayout(new FlowLayout());

       l1=new Label("Enter String 1=");
       l2=new Label("Enter String 2=");
       l3=new Label("Result=");
       t1=new TextField(8);
       t2=new TextField(8);
       t3=new TextField(15);
       b1=new Button("Concatnet");
       b2=new Button("Reverse");
       b3=new Button("Exit");

       add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);add(b3);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
    }
   
    public void actionPerformed(ActionEvent ae)
    {  
        String s1,s2,s3;
       if(ae.getSource()==b1)
         {
             s1=t1.getText();
             s2=t2.getText();
             s3=s1+s2;
            t3.setText(s3);
         }
        if(ae.getSource()==b2)
        {    s1=t1.getText();
             s2=t2.getText();
             s3=s1+s2;
           StringBuffer sbr=new StringBuffer(s3);
            sbr.reverse();
            s3=""+sbr;
            t3.setText(s3);
        }
        if(ae.getSource()==b3)
          dispose();
    }
    public static void main(String[] args) {
        string ob=new string();
    }
}