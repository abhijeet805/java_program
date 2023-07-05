class emp
{
    int eno=101;
    String ename="om";
    float sal=23000;
    
    void accept(int eno,String ename,float sal)
    {
       // local variable assign to global variable value
        eno=this.eno;
        ename=this.ename;
        sal=this.sal;
    }

    void disp()
    {
        System.out.println("Emp no="+eno);
        System.out.println("Emp no="+ename);
        System.out.println("Emp no="+sal);
    }

    public static void main(String arg[])
    {
        emp ob=new emp();
        ob.accept(105,"aaa",45000);
        ob.disp();
    }
}