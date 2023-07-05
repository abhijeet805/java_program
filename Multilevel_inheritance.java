import java.util.*;
class student{
    int rno;
    String name,sclass;
    
   Scanner sc=new Scanner(System.in);
   
   void accept()
   {
     System.out.println("Enter rno,name,sclass=");
     rno=sc.nextInt();
     name=sc.next();
     sclass=sc.next();
   }
}

class exam extends student
{  
    int a[]=new int[5];
    void accept_mark()
    {
    System.out.println("Enter 5 sub mark=");
    for(int i=0;i<5;i++)
      a[i]=sc.nextInt();
    }
}

class Result extends exam
{
    int s=0,i;
    float per;

   void calculate(){
    for(i=0;i<5;i++)
       s=s+a[i];

      per=s/5;
    }
    void disp()
    {
        System.out.println("Name="+name);
        System.out.println("class="+sclass);
        System.out.println("Total mark="+s);
        System.out.println("percentage="+per);
    }

   public static void main(String arg[])
   {
     Result ob=new Result();
     ob.accept();
     ob.accept_mark();
     ob.calculate();
     ob.disp();

   }
}




