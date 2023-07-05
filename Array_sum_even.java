import java.util.*;
class array
{
    public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit=");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         int s=0;
         for(int i=0;i<n;i++)
         { 
           if(a[i]%2==0)
             s=s+a[i];
         }
         System.out.print("Sum of Even="+s);
     }
}