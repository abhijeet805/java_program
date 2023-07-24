import java.awt.*;
class Awt extends Frame
{ 
    Label l1,l2;
    TextField t1;
    List ls;
    Button b1,b2,b3,b4;

   Awt()
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
    
   }
   
    public static void main(String[] args) {
     Awt ob=new Awt(); 
   }
}

