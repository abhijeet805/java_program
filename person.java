import java.util.Scanner;

class person
{
    long adharno,pno;
    String pname;

    void accept(long pno,String pname,long adharno)
    {
        this.pno=pno;
        this.pname=pname;
        this.adharno=adharno;
    }
    void disp()
    {
        System.out.println("pan no="+pno);
        System.out.println("person name="+pname);
        System.out.println("Adhar no="+adharno);
    }

    public static void main(String[] args) {
        
        long pno,adharno;
        String pname;
        person ob[]=new person[10];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            ob[i]=new person();
            System.out.println("Enter pname=");
            pname=sc.next();
            System.out.println("Enter pan no=");
            pno=sc.nextLong();
            System.out.println("Enter Adhar no=");
            adharno=sc.nextLong();

            
            ob[i].accept(pno,pname,adharno);
        }
        for (int i = 0; i < ob.length; i++) {
            
            ob[i].disp();
        }
    }
}