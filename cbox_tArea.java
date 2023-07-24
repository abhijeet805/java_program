import java.awt.*;
import java.awt.event.*;

class cbox_tArea extends Frame implements ActionListener
{   
    Checkbox c1,c2,c3,c4;
    Button b1;
    TextArea ta;

    cbox_tArea()
    {
        setVisible(true);
        setSize(500,500);
        setBackground(Color.lightGray);
        setLayout(new FlowLayout());

        c1=new Checkbox("Java");
        c2=new Checkbox("PHP");
        c3=new Checkbox("c++");
        c4=new Checkbox("Computer");
        ta=new TextArea(10,30);
        b1=new Button("OK");
        add(c1);add(c2);add(c3);add(c4);add(b1);add(ta);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {   
        String s1="";
        if(ae.getSource()==b1)
         {
            if(c1.getState()==true)
             {
                s1=""+"Java";
             }
            if(c2.getState()==true)
             {
                s1=s1+",PHP";
             }
            if(c3.getState())
            {
                s1=s1+",c++";
            }
            if(c4.getState())
            {
                s1=s1+",Computer";
            }
            ta.setText("Selected Subject\n");
            ta.setText(s1);
         }
    }
 public static void main(String[] args) {
        new cbox_tArea();
    }
}