import java.util.Scanner;

/**
 * peak
 */
public class peak {

   static void peak(int a[],int n)
     {
        if(n==1)
          System.out.println(a[0]+" is peak Element, because its only one ");

        if(a[0]>a[1])
          System.out.println(a[0]+" is peak Element, its greter than its neigbour "+a[1]);

        if(a[n-1]>a[n-2])
           System.out.println(a[n-1]+" is peak Element, its greter than its neigbour "+a[n-2]);

        for (int i = 1; i < n-1; i++) {
            if(a[i-1]<=a[i] && a[i+1]<=a[i])
             System.out.println(a[i]+" is peak Element, its greter than its neigbour "+a[i-1]+" & "+a[i+1]);
        }
   
        }

    
    public static void main(String[] args) {
       
       
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit");
        int n=sc.nextInt();

        int a[]=new int[10];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
      
        peak(a,n);
       
    }
}