import java.awt.*;
import java.awt.event.*;
class Awt1 extends Frame implements ActionListener
{ 
    Label l1,l2;
    TextField t1;
    List ls;
    Button b1,b2,b3,b4;

   Awt1()
   {
      setVisible(true);
      setSize(700, 800);
      setBackground(Color.MAGENTA);
      setLayout(new FlowLayout());

      l1=new Label("Enter Product=");
      l2=new Label("All Product");
      t1=new TextField(8);
      ls=new List(10);
      b1=new Button("Add");
      b2=new Button("Remove");
      b3=new Button("clear");
      b4=new Button("Exit");

      add(l1);add(t1);add(l2);add(ls);add(b1);add(b2);add(b3);add(b4);
     
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
   }
       public void actionPerformed(ActionEvent ap)  //call Automatically
      {
        if(ap.getSource()==b1)
        {
            String s1=t1.getText();
            ls.add(s1);
        }
        if(ap.getSource()==b2)
        {
            ls.remove(ls.getSelectedItem());
        }
        if(ap.getSource()==b3)
        {
            ls.removeAll();
        }
        if(ap.getSource()==b4)
        {
            dispose();
        }
      }
   
    public static void main(String[] args) {
     Awt1 ob=new Awt1(); 
   }
}

