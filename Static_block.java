class demo
{
  
 static int a=10;
    static
    {
        System.out.println("Value="+a);
        System.out.println("I am a static block");

    }

    public static void main(String arg[])
     {
        demo ob=new demo();
       a++;
        System.out.println("Value="+a);
        
     }
}
/* i)static block can execute before the main function */