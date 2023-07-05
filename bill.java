import java.util.*;
class ebill
{
     int old_read,new_read,unit;
     float tax,tot;

     void accept()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter old & new reading");
        old_read=sc.nextInt();
        new_read=sc.nextInt();

     }
     void calculate()
     {
        unit=new_read-old_read;
        if(unit<100)
          tot=unit*5;
        else if(unit>=100 && unit <200)
          tot=unit*10;
        else if(unit>=200)
          tot=unit*15;

        tot=tot+140;//meter charges

          if(tot>1000)
           tax=tot*10/100;

       tot=tot+tax;
     }
     void disp()
     {
        System.out.println("old Reading="+old_read);
        System.out.println("new Reading="+new_read);
        System.out.println("unit="+unit);
        System.out.println("Total tax="+tax);
        System.out.println("total amount="+tot);
     }

     public static void main(String arg[])
      {
        ebill ob;
        ob=new ebill();
        ob.accept();
        ob.calculate();
        ob.disp();
      }
}