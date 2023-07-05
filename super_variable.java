class base
{  int a;
    base()
    {
         a=50;
    }
}

class derived1 extends base
{
    derived1()
    {
     int a=100;
     System.out.println("Value1="+a);
     System.out.println("Value2="+super.a);
     super.a=200;
     System.out.println("value3="+a);
     System.out.println("value3="+super.a);
     
    }
}

public class super_variable {
    public static void main(String[] args) {
        derived1 ob=new derived1();
    }

}
