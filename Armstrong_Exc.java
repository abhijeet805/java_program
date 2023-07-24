import java.util.Scanner;

class InvalidException extends Exception
{
    public String toString()
    {
       return "Invalid Number";
    }
}
class Armstrong
{
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Num=");
            int n=sc.nextInt();

            if(n<=0)
             {
                throw new InvalidException();
             }

             int num=n,s=0;
             while(n>0)
              {
                 int d=n%10;
                 s=s+d*d*d;
                 n=n/10;
              }
              if(s==num)
               System.out.println("Aremstrong");
            else 
            {
                System.out.println("Not Armstrong");
            }
              
        } catch (Exception e) {
            System.out.println("Error="+e);
            // TODO: handle exception
        }
    }
}