class addnum
{
    public static void main(String arg[])
     {
        int n=12345,s=0,d;
        while(n>0)
         {
            d=n%10;
            s=s+d;
            n=n/10;
         }
         System.out.println("Sum of Number="+s);
     }
}