import java.util.Scanner;

class college
{
    int cno;
    String cname,add;
    Scanner sc=new Scanner(System.in);

    void accept()
    {
        System.out.println("Enter college name,add,no=");
        cname=sc.nextLine();
        add=sc.nextLine();
        cno=sc.nextInt();
    }
}
class dept extends college{

    int dno;
    String dname;

    void accept_d()
    {
       System.out.println("Enter department name,no");
        dno=sc.nextInt();
        dname=sc.nextLine();
    }

    void disp()
    {
        System.out.println("college name="+cname);
        System.out.println("college no="+cno);
        System.out.println("college address="+add);
        System.out.println("department no="+dno);
        System.out.println("department name="+dname);
    }
}

class coll{
  public static void main(String[] args) {
    dept ob=new dept();
    ob.accept();
    ob.accept_d();
    ob.disp();
  }
}