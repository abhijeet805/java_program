import java.util.Scanner;

class smallnumExe extends Exception
{
    public String toString()
    {
        return "Small num";
    }
}
class GreterNumExe extends Exception{
    public String toString(){
      return "Greter num";
    }
}

class check
{
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter num=");
            int n=sc.nextInt();
            if(n<5)
              throw new smallnumExe();
            if(n>10)
              throw new GreterNumExe();
             
              int f=1;
            for(int i=1;i<=n;i++)
               {
                f=f*i;
               }
           System.out.println("Factorial of num="+f);

        } catch (Exception e) {
            // TODO: handle exception
             System.out.println("Error="+e);
        }
    }
}