import java.util.*;
public class fabonnaci {
    public static void main(String[] args) {
        int f=0,s=1,t;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit=");
        int n=sc.nextInt();

        System.out.print(f+"\t");
        System.out.print(s+"\t");
        while(n>0)
        {
            t=f+s;
            System.out.print(t+"\t");
            f=s;
            s=t;
           n--;
        }
    }
}
