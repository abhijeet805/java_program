import java.util.Scanner;

abstract class Order
{
    Scanner sc=new Scanner(System.in);
   int id;
   String discri;

   void accept()
   {
      System.out.println("Enter ID=");
      id=sc.nextInt();
      System.out.println("Enter Discription=");
      discri=sc.nextLine();
   }
   disp()
   {
    System.out.println("ID="+id);
    System.out.println("Discription="+discri);   
}
}
class PurchseOrder extend Order
{
     String C_name,V_name;
   void accept()
   {
     System.out.println("Enter coustomername=");
      C_name=sc.next();

     System.out.println("Enter vendorName=");
      V_name=sc.next();
   }

   void disp()
   {
     System.out.println("Customer Name="+C_name);
     System.out.println("Vendor Name="+V_name);
    }
}

class SalesOrder extend Order
{
     String C_name,V_name;
   void accept()
   {
     System.out.println("Enter coustomername=");
      C_name=sc.next();

     System.out.println("Enter vendorName=");
      V_name=sc.next();
   }

   void disp()
   {
     System.out.println("Customer Name="+C_name);
     System.out.println("Vendor Name="+V_name);
    }
}

/**
 * abstract_order
 */
public class abstract_order {

    public static void main(String[] args) {
    
        
    }
}