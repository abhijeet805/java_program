import java.util.*;

public class StringBu
{
    public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        StringBuffer sbr=new StringBuffer(s1);
       sbr.reverse();
        System.out.println(sbr);
     }
}