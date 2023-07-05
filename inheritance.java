import java.util.Scanner;
class student {
    
    int rno;
    String name;
    float per;
   Scanner sc=new Scanner(System.in);
   
   void accept()
   {
     System.out.println("Enter rno,name,per=");
     rno=sc.nextInt();
     name=sc.next();
     per=sc.nextFloat();

   }
}
 
 class EMP extends student{
    
    int eno;
    float sal;
    String desig;
   void accepte(){
    System.out.println("Enter eno,salary,desig=");
    eno=sc.nextInt();
    sal=sc.nextFloat();
    desig=sc.next();
   }

   void disp()
   {
    System.out.println("Name="+name);
    System.out.println("salary="+sal);
    System.out.println("Designation="+desig);
   }

    public static void main(String[] args) {
    
    EMP ob=new EMP();
    ob.accept();
    ob.accepte();
    ob.disp();
   }
 }