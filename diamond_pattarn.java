class pattarn
{
    public static void main(String arg[])
     {
        int i,j,n=10;
        for(i=1;i<=n;i++)
         {
            for(j=i;j<n;j++)
             {
                System.out.print(" ");
             }
            for(j=1;j<=i;j++)
             {
                System.out.print("*");
             }
             for(j=1;j<i;j++)
             {
                System.out.print("*");
             }
             System.out.println("");
         }
         for(i=n;i>=1;i--)
         {
            for(j=i;j<n;j++)
             {
                System.out.print(" ");
             }
            for(j=1;j<=i;j++)
             {
                System.out.print("*");
             }
             for(j=1;j<i;j++)
             {
                System.out.print("*");
             }
             System.out.println("");
         }
     }
}