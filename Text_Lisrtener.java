import java.awt.*;
import java.awt.event.*;

class text_listener extends Frame implements TextListener
{
    TextField t1,t2,t3;
    TextArea ta;
    Label l1,l2,l3;
    text_listener()
    {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());

        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        l1=new Label("Enter Name=");
        l2=new Label("Enter Address=");
        l3=new Label("Enter Contact=");
        ta=new TextArea(10,50);
        add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(ta);
        ta.addTextListener(this);
    }
    public void textValueChanged(TextEvent te)
    {
        String s1=t1.getText();
        ta.setText("name="+s1);
        s1=t2.getText();
        ta.setText("\nAddress="+s1);
        s1=t3.getText();
        ta.setText("\nContact="+s1);
        ta.setBackground(Color.GREEN);
    }
    public static void main(String[] args) {
        new text_listener();
    }
}