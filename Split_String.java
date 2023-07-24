/**
 * Split_String
 */
import java.util.*;
public class Split_String {
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String=");
        String s1=sc.nextLine();
        String s2[]=s1.split(" ");
        
        for(int i=0;i<s2.length;i++)
         {
             StringBuffer sbr=new StringBuffer(s2[i]);
             sbr.reverse();
             System.out.print(sbr+" ");
         }
    }
    
}