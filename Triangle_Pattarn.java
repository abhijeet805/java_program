class pattarn
{
    public static void main(String arg[])
     {
        int i,j,n=5;
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
     }
}