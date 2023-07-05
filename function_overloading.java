class demo1
{
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Add1="+c);
    }
    void add(float a,float b)
    {
        float c=a+b;
        System.out.println("Add2="+c);

    }
    void add(int a,int b,int d)
    {
        int c=a+b+d;
        System.out.println("Add2="+c);

    }

    public static void main(String arg[])
    {
        demo1 ob=new demo1();
        ob.add(10,25);
        ob.add(55,65);
        ob.add(22,33,65);
    }
    
}