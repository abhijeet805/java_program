
class demo
{
    public static void main(String[] args) {
       int n=0;
        int a[]=new int[5];
        try{
           
             n=8;
            a[2]=555;
            a[8]=123;
            System.out.println("Value="+a[2]);
            System.out.println("Value="+a[1]);
            System.out.println("Value="+n);
        }
        catch(Exception e1)
        {
            System.out.println("Error="+e1);
        }
        finally
        {
            System.out.println("Value="+a[2]);
            System.out.println("Value="+a[1]);
            System.out.println("Value="+n);
        } 
          System.out.println("Value="+n);
    }
}
