import java.util.Scanner;

class zeroExc extends RuntimeException
{
    public String toString()
    {
        return "Num is Zero";
    }
}

class check2
{
    public static void main(String[] args) {
        try {
            int f=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter NUM=");
            int n= sc.nextInt();

            if(n==0)
             throw new zeroExc();

           

        int num=n;
        while(n>0)
        {
            int d=n%10;
             f=f*10+d;
            n=n/10;
        }
        if(f==num)
          System.out.println("num is Palindrome");
        else
          System.out.println("num is Not Palindrome");    

        }catch(Exception e1) 
        {
              System.out.println("Input is Invalid"+e1);
        }
        catch(zeroExc e2) {
            System.out.println("Error="+e2);
            // TODO: handle exception
        }
    }
}