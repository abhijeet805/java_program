interface shape
{
    void area(float r);
    final float pi=3.142f;
}

class circle implements shape
{
    public void area(float r)
    {
        System.out.println("Area of circle="+(pi*r*r));
    }
}
class sphere implements shape
{
    public void area(float r)
    {
        System.out.println("Area of sphere="+(4*pi*r*r));
    }

    public static void main(String[] args) {
        circle ob=new circle();
        sphere ob1=new sphere();
        ob.area(6.5f);
        ob1.area(5.5f);

    }
}