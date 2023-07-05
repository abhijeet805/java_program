final class base
{   
    final int a=5;
    final void add(int a,int b)
    {   
        a++;//Not increment because it a declare final variable
         System.out.println("Addition2="+(a+b));
         System.out.println("value="+(a));
    }
}

class derived1 extends base
{
    void add(int a,int b)
    {
        System.out.println("Addition1="+(a+b));
    }
}/* 
 * final_keyword
 */
public class final_keyword {
    public static void main(String[] args) {
        derived1 ob=new derived1();
        ob.add(11,55);
    }
}