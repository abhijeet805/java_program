import java.util.Scanner;

abstract class order
{
    int id;
    String disc;
    Scanner sc=new Scanner(System.in);
    void accepto()
    {
        System.out.println("Enter discription=");
        disc=sc.nextLine();
        System.out.println("Enter ID=");
        id=sc.nextInt();

    }
}

class purchseorder extends order{
    String cname;
    void accept()
    {
        System.out.println("Enter customer name=");
        cname=sc.next();

    }

    void disp()
    {
        System.out.println("Id="+id);
        System.out.println("Discription="+disc);
        System.out.println("customer name="+cname);
    }
}

class salesorder extends order{
    String vname;
    void accept()
    {
        System.out.println("Enter vendor name=");
        vname=sc.next();

    }

    void disp()
    {
        System.out.println("Id="+id);
        System.out.println("Discription="+disc);
        System.out.println("customer name="+vname);
    }
}

/**
 * abstract_purchse
 */
public class abstract_purchse {

    public static void main(String[] args) {
        purchseorder ob[]=new purchseorder[10];
        salesorder ob1[]=new salesorder[10];

        for (int i = 0; i < 3; i++) {
            ob[i]=new purchseorder();
            ob[i].accepto();
            ob[i].accept();
        }
        
        for (int i = 0; i < 3; i++) {
            ob[i].disp();
        }

         for (int i = 0; i < 3; i++) {
            ob1[i]=new salesorder();
            ob1[i].accepto();
            ob1[i].accept();
        }
        
        for (int i = 0; i < 3; i++) {
            ob1[i].disp();
        }


        

    }
}