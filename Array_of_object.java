import java.util.*;
class emp1
{
    int eno;
    String ename;
    float sal;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter eno,name and sal");
        eno=sc.nextInt();
        ename=sc.next();
        sal=sc.nextFloat();

    }
    void disp()
    {
        System.out.println("emp no="+eno);
        System.out.println("name="+ename);
        System.out.println("salary="+sal);
        
    }
    public static void main(String arg[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        emp1 ob[]=new emp1[10];
        System.out.println("Enter limit");
        int n=sc.nextInt();

        for(i=1;i<=n;i++)
         {
            ob[i]=new emp1();
            ob[i].accept();
            ob[i].disp();
         }
          for(i=1;i<=n;i++)
         {
            ob[i].disp();
         }

    } 
}