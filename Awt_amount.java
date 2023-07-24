import java.awt.*;
import java.awt.event.*;

class Amt extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2,b3;
    
    Amt()
    {
       setVisible(true);
       setSize(400, 600);
       setLayout(new FlowLayout());
       setTitle("Compound Interest");
       setBackground(Color.MAGENTA);
       
    l1=new Label("Compound Interest Calculater");
    l2=new Label("Principal Amount");
    l3=new Label("Interest Rate(%)");
    l4=new Label("Time(yrs)");
    l5=new Label("Total Amount");
    l6=new Label("Interest Amount");
    t1=new TextField(15);
    t2=new TextField(2);
    t3=new TextField(2);
    t4=new TextField(8);
    t5=new TextField(10);
    b1=new Button("Calculate");
    b2=new Button("clear");    
    b3=new Button("close");

    add(l1);add(l2);add(t1);add(l3);add(t2);add(l4);add(t3);add(l5);add(t4);add(l6);add(t5);add(b1);add(b2);add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    
  }

    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource()==b1)
          {
             String s1=t1.getText();
             float p=Float.parseFloat(s1); 
             
             float R=Float.parseFloat(t2.getText()); 
             
             float y=Float.parseFloat(t3.getText());

             float A=p*(1+R/y);
             float I=A-p;
             
             String s2=""+A;
             String s3=""+I;
             t4.setText(s2);
             t5.setText(s3);
          }

          if(ae.getSource()==b2)
           {
            String s1="";
            t1.setText(s1);
            t2.setText(s1);
            t3.setText(s1);
            t4.setText(s1);
            t5.setText(s1);
           }
        if(ae.getSource()==b3)
          dispose();
    }
  public static void main(String[] args) {
    Amt ob=new Amt();
  }
}

