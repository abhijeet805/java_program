import java.util.*;
class array1
{
    public static void main(String arg[])
     {
       int j=0,n1;
        Scanner sc=new Scanner(System.in);
       int a[]=new int[10];
       System.out.println("Enter limit=");
       int n=sc.nextInt();
        System.out.println("Enter n number=");
       for(int i=0;i<n;i++)
        {
           int num=sc.nextInt();
           n1=num;
           int s=0;
           while(num>0)
            {
              int d=num%10;
              s=s+d*d*d;
              num=num/10;
            }
            if(n1==s)
             {
              a[j++]=s;
             }
        }

        for(int i=0;i<j;i++)
           System.out.print("\t"+a[i]);
     }
}