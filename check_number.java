import java.lang.*;
class check
{
    void even_odd(int n)
    {
        if(n%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
    void posi_nege(int n)
     {
        if(n>0)
         System.out.println("No is +ve");
        else 
         System.out.println("NO is -ve");
     }
    void prime(int n)
     {
        int i;
        for(i=2;i<n;i++)
         {
            if (n%i==0)
             break;
         }
         if(i==n)
          System.out.println("no is prime");
        else
          System.out.println("No is Not prime");
     }

     public static void main(String arg[])
     {
        check ob=new check();
        ob.even_odd(13);
        ob.posi_nege(-10);
        ob.prime(13);
     }
}