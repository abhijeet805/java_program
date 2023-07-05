class demo
{
  
 static int a=10;
     void disp()
    {  
        a++;
        System.out.println("Value="+a);
    }
    public static void main(String arg[])
     {
        demo ob=new demo();
        ob.disp();
        System.out.println("Value="+a);
        demo ob1=new demo();
        ob1.disp();
        demo ob2=new demo();
        ob2.disp();

     }

     /* i) Static variable(static int a=5) can access both static and non static function
       ii)non-static(int a=5;) variable can not acces in static function
      iii)Static variable common for all object(ob,ob1,ob2)
       iv) static variable access by default value is 0*/ 
}
