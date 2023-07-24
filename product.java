import java.util.Scanner;

class product
{
    int pid;
    String pname;
    float price;
    Scanner sc=new Scanner(System.in);
    void accept()
    {  
        System.out.println("Enter pid,paname,price=");
        pid=sc.nextInt();
        pname=sc.next();
        price=sc.nextFloat();
    }
    void disp()
    {
            System.out.println(" product id="+pid);
            System.out.println(" product name="+pname);
            System.out.println(" product price="+price);
    }

public static void main(String[] args) {
        
    product ob[]=new product[10];
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit=");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
      {
        ob[i]=new product();
         ob[i].accept();
      }
      float s=0;
    for(int i=0;i<n;i++)
      {
          s=s+ob[i].price;
           ob[i].disp();
      }
      System.out.println("Total Amount="+s);
}
}
