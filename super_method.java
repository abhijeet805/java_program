class base
{   
    void add(int a,int b)
    {
         System.out.println("Addition2="+(a+b));
    }
}

class derived1 extends base
{
    void add(int a,int b)
    {
        System.out.println("Addition1="+(a+b));
        super.add(a,b);
        super.add(25,96);
        super.add(44,68);
        super.add(a,b);
    }
}
/**
 * super_method
 */
public class super_method {
    public static void main(String[] args) {
        derived1 ob=new derived1();
        ob.add(11,55);
    }
}