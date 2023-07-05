import java.lang.*;
class Area
{
    void circle(double r)
     {
        double a=3.14f*r*r;
        System.out.println("Area of circle="+a);
     }
     void rectangle(double l,double b)
     {
        double a=l*b;
        System.out.println("Area of Rectangle="+a);
     }
     void square(int s)
     {
        int a=s*s;
        System.out.println("Area of square="+a);
     }

     public static void main(String arg[])
      {
        Area ob=new Area();
        ob.circle(3.6);
        ob.rectangle(4.5,6.6);
        ob.square(10);
      }
}