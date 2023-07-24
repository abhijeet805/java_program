import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calculator extends Frame implements ActionListener
{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,badd,bsub,bmul,bequal,bdiv,bc;
    Panel p1;
    TextField t1;
    Label l1;
    float a,b,c;
    int ch;
    calculator()
    {
        setVisible(true);
          setSize(500, 500);
          setBackground(Color.MAGENTA);
          setLayout(new FlowLayout());
          bc=new Button("Clear");
          l1=new Label("Simple Calculater");
          b1=new Button("1");
          b2=new Button("2");
          b3=new Button("3");
          b4=new Button("4");
          b5=new Button("5");
          b6=new Button("6");
          b7=new Button("7");
          b8=new Button("8");
          b9=new Button("9");
          b0=new Button("0");
          bdiv=new Button("/");
          bsub=new Button("-");
          bmul=new Button("*");
          badd=new Button("+");
          bequal=new Button("=");
          bdot=new Button(".");
          t1=new TextField(17);
          p1=new Panel();
          p1.setLayout(new GridLayout(4,4,4,4));
                                    
          p1.add(b1);p1.add(b2);p1.add(b3);p1.add(badd);
          p1.add(b4);p1.add(b5);p1.add(b6);p1.add(bsub);
          p1.add(b7);p1.add(b8);p1.add(b9);p1.add(bmul);
          p1.add(b0);p1.add(bdot);p1.add(bequal);p1.add(bdiv);
          
          add(l1);add(t1);
          add(p1);add(bc);

          b1.addActionListener(this);
          b2.addActionListener(this);
          b4.addActionListener(this);
          b5.addActionListener(this);
          b6.addActionListener(this);
          b7.addActionListener(this);
          b8.addActionListener(this);
          b9.addActionListener(this);
          b0.addActionListener(this);
          badd.addActionListener(this);
          bsub.addActionListener(this);
          bmul.addActionListener(this);
          bdiv.addActionListener(this);
          bdot.addActionListener(this);
          bequal.addActionListener(this);
          b3.addActionListener(this); 
          bc.addActionListener(this);  
    }   
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==b1)
        {
          t1.setText(t1.getText()+"1");//its concat previous Entered Number and New Number
        }
      
       if(ae.getSource()==b2)
        {
          t1.setText(t1.getText()+"2");
        }
       if(ae.getSource()==b3)
        {
          t1.setText(t1.getText()+"3");
        } 
       if(ae.getSource()==b4)
        {
          t1.setText(t1.getText()+"4");
        }
       if(ae.getSource()==b5)
        {
          t1.setText(t1.getText()+"5");
        }
       if(ae.getSource()==b6)
        {
          t1.setText(t1.getText()+"6");
        }
       if(ae.getSource()==b7)
        {
          t1.setText(t1.getText()+"7");
        }
       if(ae.getSource()==b8)
        {
          t1.setText(t1.getText()+"8");
        }
       if(ae.getSource()==b9)
        {
          t1.setText(t1.getText()+"9");
        }
       if(ae.getSource()==b0)
        {
          t1.setText(t1.getText()+"0");
        }
        if(ae.getSource()==bdot)
        {
          t1.setText(t1.getText()+".");
        }
        // operators
        if(ae.getSource()==badd)
         {
           ch=1;
           a=Float.parseFloat(t1.getText());
           t1.setText("");

         }
         if(ae.getSource()==bsub)
         {
           ch=2;
           a=Float.parseFloat(t1.getText());
           t1.setText("");

         }
      if(ae.getSource()==bmul)
         {
           ch=3;
           a=Float.parseFloat(t1.getText());
           t1.setText("");

         }
      if(ae.getSource()==bdiv)
         {
           ch=4;
           a=Float.parseFloat(t1.getText());
           t1.setText("");

         }


         //operation
         if(ae.getSource()==bequal)
         {
           b=Float.parseFloat(t1.getText());
         switch(ch)
         {
           case 1: c=a+b; break;
           case 2:c=a-b;break;
           case 3:c=a*b;break;
           case 4:c=a/b;break;
           
         }
         t1.setText(""+c);
        }

        if(ae.getSource()==bc)
         {
          t1.setText("");
         }
         
      }

    public static void main(String[] args) {
        new calculator();
    }
}