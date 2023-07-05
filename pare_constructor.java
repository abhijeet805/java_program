import java.util.*;
class Emp1
{
    int eno;
    String ename;
    float sal;

     Emp1(int eno,String ename,float sal)
     {
         this.eno=eno;
         this.ename=ename;
         this.sal=sal;
     }
     void disp()
     {
        System.out.println("emp no="+eno);
        System.out.println("emp name="+ename);
        System.out.println("emp no="+sal);
     }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter info no,name,sal=");
        int eno=sc.nextInt();
        String ename=sc.next();
        float sal=sc.nextFloat();

        Emp1 ob=new Emp1(eno,ename,sal);
        ob.disp();
    }
}