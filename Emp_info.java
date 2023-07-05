class Emp2
{ 
    int eno;
    float sal;
    String ename,dept;

     Emp2()
     {
        eno=123;
        ename="om";
        sal=2543;
        dept="comp";
     }
  Emp2(int eno,String ename,float sal,String dept)
  {
     this.eno=eno;
     this.ename=ename;
     this.sal=sal;
     this.dept=dept;

  }
 void disp()
 {
    System.out.println("name="+ename);
    System.out.println("eno="+eno);
    System.out.println("sal="+sal);
    System.out.println("dept name="+dept);
 }


    public static void main(String arg[])
    {
         Emp2 ob=new Emp2(101,"om",30000,"comp");
        Emp2 ob1=new Emp2(102,"sai",40000,"BSC");
        Emp2 ob2=new Emp2(103,"sai",70000,"comp");
        ob.disp();
        ob1.disp();
        ob2.disp();
    }
}