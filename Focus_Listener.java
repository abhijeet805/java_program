import java.awt.*;
import java.awt.event.*;

class focus extends Frame implements FocusListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    focus()
    {
         setVisible(true);
          setSize(500, 500);
          setLayout(new FlowLayout());
          setBackground(Color.ORANGE);
         
          l1=new Label("Enter no");
          l2=new Label("Enter no");
          l3=new Label("Addition");
          l4=new Label("Multiplication");
          t1=new TextField(8);
          t2=new TextField(8);
          t3=new TextField(8);
          t4=new TextField(8);

          add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);
      t1.addFocusListener(this);
      t2.addFocusListener(this);        
        t3.addFocusListener(this);
        t4.addFocusListener(this);
     
    }
    public void focusGained(FocusEvent fe)
    {  
        if(fe.getSource()==t1)
          t1.setBackground(Color.CYAN);

        if(fe.getSource()==t2)
          t2.setBackground(Color.yellow);
        
          
        if(fe.getSource()==t3)
        {
           t3.setBackground(Color.green);

           int a=Integer.parseInt(t1.getText());
           int b=Integer.parseInt(t2.getText());
           int c=a+b; 
           t3.setText(""+c);
        }
        if(fe.getSource()==t4){
           t4.setBackground(Color.green);
           int a=Integer.parseInt(t1.getText());
           int b=Integer.parseInt(t2.getText());
           int c=a*b;
           t4.setText(""+c);
        }
    }

    public void focusLost(FocusEvent fe)
    {
        t4.setBackground(Color.CYAN);
        t3.setBackground(Color.yellow);
        t2.setBackground(Color.gray);
        t1.setBackground(Color.green);
        
    }
   public static void main(String[] args) {
     new focus(); 
   }

}