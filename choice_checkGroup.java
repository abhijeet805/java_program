import java.awt.*;
import java.awt.event.*;
class Bframe extends Frame implements ActionListener
{
   
    Label l1,l2,l3,l4,l5,l6;
    TextField t1;
    TextArea ta1,ta2;
    Checkbox c1,c2,c3,c4,c5;
    CheckboxGroup cg;
    Choice ch1;
    Button b1,b2,b3;
   
    Bframe()
    {
          setVisible(true);
          setSize(500, 500);
          setBackground(Color.MAGENTA);
          
          setLayout(new FlowLayout());
          l1=new Label("Name");
          l2=new Label("Address");
          l3=new Label("Gender");
          l4=new Label("Subject");
          l5=new Label("class");
          l6=new Label("Information");
          ta1=new TextArea(8,30);
          ta2=new TextArea(8,30);
          t1=new TextField(5);
           cg=new CheckboxGroup();
          c1=new Checkbox("Male",cg,true);
          c2=new Checkbox("Female",cg,false);
          c3=new Checkbox("C lang");
          c4=new Checkbox("c++");
          c5=new Checkbox("TCS");
          ch1=new Choice();
          ch1.add("Fy");
          ch1.add("Sy");
          ch1.add("Ty");
          b1=new Button("Submit");
          b2=new Button("Clear");
          b3=new Button("Exit");
          add(l1);add(t1);add(l2);add(ta1);add(l3);add(c1);add(c2);add(l4);add(c3);add(c4);add(c5);add(l5);add(ch1);add(b1);
          add(b2);add(b3);add(l6);add(ta2);

          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
        }
       public void actionPerformed(ActionEvent ae)
       { 
          
          if(ae.getSource()==b1)
          {
             String Name=t1.getText();
             ta2.append("\nName="+Name);
             String add=ta1.getText();
            ta2.append("\nAddress="+add);
            
            if(c1.getState())
               ta2.append("\nGender=Male");
            else
               ta2.append("\nGender=Female");

            if(c3.getState())
               ta2.append("\nSubject= c lang");
            if(c4.getState())
               ta2.append("\n C++");
            if(c5.getState())
               ta2.append("\n TCS");

            ta2.append("\nClass"+ch1.getSelectedItem());

          }
          if(ae.getSource()==b2)
          {
            t1.setText("");
            ta1.setText("");
            ta2.setText("");
            c1.setState(false);
            c2.setState(false);
            c3.setState(false);
            c4.setState(false);
            c5.setState(false);
          }
        if(ae.getSource()==b3)
          dispose();
       }
        public static void main(String[] args) {
            new Bframe();
        }
}