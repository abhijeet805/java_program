import java.util.Scanner;

class union_intersection
{
   

    static void union(int a[],int b[],int n)
    {
        int visited[]=new int[10];
            for (int j = 0; j < n; j++) {
                visited[j]=0;
            }

        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i]==b[j])
                   visited[j]=1;
            }
        }
      
        System.out.println("Union of two array=");
        for (int j = 0; j < n; j++) {
            System.out.print("\t"+a[j]);

        }

         for (int j = 0; j < n; j++) {
            if(visited[j]==0)
               System.out.print("\t"+b[j]);           
        }

    }


    static void intersection(int a[],int b[],int n)
    {
        int k=0;
        System.out.println("\nIntersection arrray=");
           for (int i = 0; i < n; i++) {
            k=0;
            for (int j = 0; j < n; j++) {
                if(a[i]==b[j])
                 { 
                    if(k==0)
                    {
                     System.out.print("\t"+a[i]);  
                      k++; 
                    }
                }
             } 
           }
    }
    public static void main(String[] args) {
        int a[]=new int[10];
        int b[]=new int[10];
        int n=8;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter  1st Array Element=");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
         System.out.println("Enter  2nd Array Element=");
         for (int i = 0; i < n; i++) {
            b[i]=sc.nextInt();
        }
        union(a,b,n);
        intersection(a,b,n);
    }
}