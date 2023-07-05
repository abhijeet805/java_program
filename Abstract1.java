import java.util.Scanner;

abstract class shape
{  
    Scanner sc=new Scanner(System.in);
    abstract void area();
}

class Rectangle extends shape
{
    void area()
    {
        System.out.println("Enter length & Breadth=");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        float c=l*b;
        System.out.println("Area of rectangle="+c);
    }
}

class Triangle extends shape
{
    void area()
    {
        System.out.println("Enter Base & Height=");
        float b=sc.nextFloat();
        float h=sc.nextFloat();
        float c=0.5f*b*h;
        System.out.println("Area of rectangle="+c);
    }

    public static void main(String arg[])
    {
         Triangle ob=new Triangle();
         ob.area();
         Rectangle ob1=new Rectangle();
         ob1.area();
    }
}
