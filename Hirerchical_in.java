import java.util.Scanner;
class college {
   String cname, cadd;
     String contact;
    Scanner sc = new Scanner(System.in);
     
        void acceptc()
       { 
        System.out.println("Enter CollegeName=");
        cname = sc.nextLine();
        System.out.println("Enter CollegeAdd=");
        cadd = sc.nextLine();
        System.out.println("Enter CollegeContact=");
        contact = sc.nextLine(); 
      }

       }

class Teacher extends college
{
    int tno;
    String quali;
    String Tname;

    void accept()
    {
        System.out.println("Enter Tname=");
        Tname=sc.nextLine();

        System.out.println("Enter TeachQulification=");
        quali=sc.nextLine();


        System.out.println("Enter Tno=");
        tno=sc.nextInt();
    }
    void disp()
    {
        System.out.println("Teacher Name="+Tname);
        System.out.println("Teacher No="+tno);
        System.out.println("Teacher Qulification="+quali);
        System.out.println("Teacher college name="+cname);
        System.out.println();
    }
}
class Student extends college
{
    int rno;
    String sname;
    float per;
    
    void accepts()
    {
        System.out.println("Enter Student name=");
        sname=sc.nextLine();

        System.out.println("Enter rno=");
        rno=sc.nextInt();

        System.out.println("Enter percentage=");
        per=sc.nextFloat();
    }
    void disp()
    {
        System.out.println("Student Name="+sname);
        System.out.println("Student No="+rno);
        System.out.println("Student per="+per);
        System.out.println("student college name="+cname);

    }
}
class hirerchical_inheritance {

    public static void main(String[] args) {

        Teacher ob=new Teacher();
        Student ob1=new Student();
        ob.acceptc();
        ob1.acceptc();
        ob.accept();
        ob.disp();
        ob1.accepts();
        ob1.disp();
    }
}
