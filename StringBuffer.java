import java.util.*;

class StringBuffer
{
    public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        StringBuffer sbr=new StringBuffer(s1);
        sbr.insert(3,"abc");
        System.out.println(sbr);
     }
}