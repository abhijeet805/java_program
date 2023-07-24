import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class scrollbardemo extends JFrame implements AdjustmentListener
{
    JScrollBar s1;
    JTextField t1;
   
    scrollbardemo()
    {
        setVisible(true);
        setSize(500, 500);
        setLayout(null);

        s1=new JScrollBar();
        s1.setMinimum(0);
        s1.setMaximum(300);
        s1.setOrientation(JScrollBar.HORIZONTAL);
        s1.setBounds(100, 50, 350, 70);
        t1=new JTextField();
        t1.setBounds(250, 160, 100, 50);

        add(s1);add(t1);
        s1.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
       t1.setText(""+s1.getValue());
    }
    public static void main(String[] args) {
        new scrollbardemo();
    }
}