import java.util.*;
class student
{
  int rno,mark1,mark2,mark3;
  String name;
  float per;
  
 void accept()
  {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter rno and name=");
    rno=sc.nextInt();   
    name=sc.next();
    System.out.println("Enter Subject marks=");
    mark1=sc.nextInt();
    mark2=sc.nextInt();  
    mark3=sc.nextInt();
}

 void calculate()
 {
   per=(mark1+mark2+mark3)/3;
 }

 void disp()
 {
   System.out.println("Stud rno="+rno);
   System.out.println("stud name="+name);
   System.out.println("java mark="+mark1);
   System.out.println("php mark="+mark2);
   System.out.println("cpp mark="+mark3);
   System.out.println("stud name="+per);
 }
 public static void main(String arg[])
 {
    student ob=new student();
    ob.accept();
    ob.calculate();
    ob.disp();
 }  
}