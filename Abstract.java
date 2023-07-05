abstract class A
{
    abstract void add(int a,int b);
    abstract void square(int n);
    void cube(int n)
    {
        System.out.println("Cube="+(n*n*n));
    }
}

class B extends A
{
    void add(int a,int b){
       System.out.println("Addition="+(a+b));
    }
    void square(int n){
        System.out.println("Square="+(n*n));
    }
}
/**
 * Abstract
 */
public class Abstract {
    public static void main(String arg[])
    {
        B ob=new B();
        ob.add(50, 80);
        ob.square(15);
        ob.cube(13);
    }
}