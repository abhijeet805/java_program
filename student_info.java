import java.util.*;
class student
{
   int Rno;
   String sname;
   String class1;
   
   void accept()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Roll no=");
    Rno=sc.nextInt();
    System.out.println("Enter name=");
    sname=sc.next();
    System.out.println("Enter class=");
    class1=sc.next();
   }

   void disp()
   {
     System.out.println("Roll no="+Rno);
     System.out.println("Roll name="+sname);
     System.out.println("Roll no="+class1);
   }

   public static void main(String arg[])
    {
        student ob=new student();
        ob.accept();
        ob.disp();
    }
}
