import java.util.*;
class string
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    if(s1.equals(s2))
      System.out.println("same"); 
    else 
      System.out.println("Not same");

      System.out.println("string s1 length="+s1.length());
      System.out.println("string s2 length="+s2.length());
      

       s1=s1.toUpperCase();
       s2=s2.toLowerCase();

       System.out.println("string s1 Uppercase="+s1);
       System.out.println("string s2 Lowercase="+s2);
      

     s1=s1.replace("R","A");
      System.out.println("s1 replace String="+s1);

     int k=s1.compareTo(s2);
        if(k==0)
           System.out.println("same"); 
        else if(k<0) 
          System.out.println("1st is greter");
        else if(k>0)
          System.out.println("2nd is greter");
 //   if(s1.equalsIgnore(s2))
//   System.out.println("same"); 
  //  else 
    //  System.out.println("Not same");
     
    }
}