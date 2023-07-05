import java.util.*;
class Array2
{
    public static void main(String arg[])
     {  
        int i,j;
        Scanner sc=new Scanner(System.in);
        int a[][]=new int [3][3];
        int b[][]=new int [3][3];
        int c[][]=new int [3][3];

        System.out.println("Enter 2 Matrix=");
       
        for(i=0;i<3;i++)
          for(j=0;j<3;j++)
            a[i][j]=sc.nextInt();
        
        for(i=0;i<3;i++)
          for(j=0;j<3;j++)
            b[i][j]=sc.nextInt();
        
        
        for(i=0;i<3;i++)
          for(j=0;j<3;j++)
            c[i][j]=a[i][j]+b[i][j];
        
        System.out.println("Addition=");
        for(i=0;i<3;i++)
        {
          for(j=0;j<3;j++)
          {
              System.out.print(c[i][j]+" ");   
          }
          System.out.println();
        }
        
        
    }
}