class base
{  int a;
   
    base(int n)
    {
         System.out.println("Square1="+(n*n));
    }
}

class derived1 extends base
{
   
    derived1(int n)
    {
      super(n);    
      System.out.println("Square2="+(n*n));
    }

}
public class super_parameterise_constructor {

    public static void main(String[] args) {
        derived1 ob=new derived1(10);
    }
}
