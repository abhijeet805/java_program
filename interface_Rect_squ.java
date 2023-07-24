interface I1
{
    void area();
}

class Rectangle implements I1{
    float l,b;
    Rectangle(float l,float b)
    {
        
            this.l=l;
            this.b=b;

    }    
        public void area()
        {
            System.out.println("Area of Rectangle="+(l*b));
        }
    
}

class Square extends Rectangle
{
    float s;
    Square(float l,float b)
    {
        super(l,b);
        s=l;
    }

    public void area()
    {
        System.out.println("Area of square="+(s*s));
        
    
    }
}

class circle implements I1
{
    float r;
    circle(float r)
    {
        this.r=r;
    }
    public void area()
    {
         System.out.println("Arae of circle="+(3.14f*r*r));
    }
    
   
    public static void main(String[] args) {
     
        Square ob=new Square(5.5f, 6.5f);
        ob.area();
        circle ob1 =new circle(2.5f);
        ob1.area();
    }
}

