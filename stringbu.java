import java.util.Scanner;

class name
{
    
    void disp(String s1)
    {
        StringBuffer sbr=new StringBuffer(s1);
        String s2[]=s1.split(" ");
        
        System.out.println(s2[2]+" "+s2[0]+" "+s2[1]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name first,middle,last=");
        String s1=sc.nextLine();
        name ob=new name();
        ob.disp(s1);
    }
}