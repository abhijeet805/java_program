import java.util.Scanner;

/**
 * char_occurence
 */
public class char_occurence {

    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String=");
       String s1=sc.next();
  int i,j,s;

       for(i=0;i<s1.length();i++)
        {    s=0;
            for(j=0;j<s1.length();j++)
             {
                if(s1.charAt(i)==s1.charAt(j))
                 {
                    s++;
                 }
                
             }
              System.out.println(s1.charAt(i)+"  "+"occure="+s);
        }
    }
}