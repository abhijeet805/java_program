import java.util.Scanner;

class NegetiveAgeExe extends RuntimeException
{
    public String toString()
    {
        return "Negetive Age";
    }
}
class Age{
    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter Age=");
            int age=sc.nextInt();

            if(age<0)
             throw new NegetiveAgeExe();

            if(age>=18)
              System.out.println("Voter");
            else 
            
              System.out.println("Not Eligible Voter");
        }
        catch(NegetiveAgeExe e)
        {
            System.out.println("Error="+e);
        }
    }
}