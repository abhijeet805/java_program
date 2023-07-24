import java.util.Scanner;

class check_email
{
    
    static int check_email(String s1)
    {
        int f=0;

        if(s1.charAt(0)>'0' && s1.charAt(0)<'9')
          {
             return 1;
          }

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == '@')
             {
                return 0;
            }   
        }
       return 1;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int k=0;

        String s1;
        System.out.println("Enter Email=");
        s1=sc.nextLine();

        k=check_email(s1);
       
        if(k==0)
          System.out.println("Valid Email");
        else
          System.out.println("InValid Email");
    }
}