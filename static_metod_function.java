class demo
{
  
 static int a=10;
   static void disp()
    {  
        a++;
        System.out.println("Value="+a);
    }

    public static void main(String arg[])
     {
       demo ob=new demo();
       ob.disp();//with object
       demo.disp();//with class(create static method for calling)
       disp();//without class and object
     }
}
/* 1) 3 way to call method
     i) with object
    ii) with class(create static method for calling)
   iii) without class and object*/