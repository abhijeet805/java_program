class table
{
    int n;
    table()
    {
        n=5;
    }
}
class printtable extends table
{
      
    printtable()
    {
     int i;
    for(i=1;i<=10;i++)
        System.out.print(n*i+" ");
    }
    public static void main(String arg[])
     {
        printtable ob=new printtable();            
     }
}