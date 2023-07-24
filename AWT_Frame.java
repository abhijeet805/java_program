import java.awt.*;
import java.awt.event.*;

class Demo extends Frame implements ActionListener
{   
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    Demo()
    {
        setVisible(true);
        setSize(500,400);
        setTitle("Addition");
        setLocation(500,200);
        setBackground(Color.RED);
       
       setLayout(new FlowLayout());
      l1=new Label("Enter Number 1=");
      l2=new Label("Enter number 2=");
      l3=new Label("Result=");
      t1=new TextField(10);
      t2=new TextField(10);
      t3=new TextField(10);
      b1=new Button("OK");
      b2=new Button("Exit");

      add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
         {
            String s1=t1.getText();
            int a=Integer.parseInt(s1);
            String s2=t2.getText();
            int b=Integer.parseInt(s2);
            
            int c=a+b;
            String s3=""+c;
            t3.setText(s3);
         }
        if(ae.getSource()==b2)
         {
            dispose();
         }
    }
    public static void main(String[] args) {
       new Demo();
    }
}