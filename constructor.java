class Emp
{
    int eno;
    String name;
    float sal;
    Emp()
    {
        eno=101;
        name="om";
        sal=23000;

        System.out.println("Emp number="+eno);
        System.out.println("Emp name="+name);
        System.out.println("Emp salary="+sal);
    }
    public static void main(String arg[])
    {
        Emp ob=new Emp();
    }
    
}