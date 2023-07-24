import java.util.Scanner;

abstract class staff
{
     String name,add;
     Scanner sc=new Scanner(System.in);

     staff(String name,String add)
     {
        this.name=name;
        this.add=add;
     }
}

class fulltime extends staff
{
    String dept;
    int sal;
    fulltime(String name,String add,String dept,int sal)
    {
       super(name,add);
       this.dept=dept;
       this.sal=sal;
    }

    void disp()
    {
        System.out.println("name="+name);
        System.out.println("address="+add);
        System.out.println("Department="+dept);
        System.out.println("salary="+sal);
    }
}


class parttime extends staff
{
    int Hour;
    int rate;
    parttime(String name,String add,int Hour,int rate)
    {
       super(name,add);
       this.Hour=Hour;
       this.rate=rate;
    }

    void disp()
    {
        System.out.println("name="+name);
        System.out.println("address="+add);
        System.out.println("no_of_hour="+Hour);
        System.out.println("Rate per Hour="+rate);
        System.out.println("salary per day="+(Hour*rate));
    }
}


class Demo
{
    public static void main(String args[]) {
        fulltime ob[]=new fulltime[10];
        parttime ob1[]=new parttime[10];
        Scanner sc=new Scanner(System.in);
  
        int n,ch;
        do {
            System.out.println("1-fulltime_staff \n2-Parttime_staff");
            System.out.println("Enter choice=");
            ch=sc.nextInt();

            switch (ch) {
                case 1: System.out.println("Enter limit=");
                        n=sc.nextInt();

                        for (int i = 0; i < n; i++) {
                            System.out.println("Enter name=");
                            String name=sc.next();
                            System.out.println("Enter address=");
                            String add=sc.next();
                            System.out.println("Enter deptatment and salary=");
                            String dept=sc.next();
                            int sal=sc.nextInt();
                            
                            ob[i]=new fulltime(name,add,dept,sal);
                        }

                        for (int i = 0; i < n; i++) {
                            ob[i].disp();
                        }
                    
                    break;
                case 2: System.out.println("Enter limit=");
                        n=sc.nextInt();

                        for (int i = 0; i < n; i++) {
                            System.out.println("Enter name=");
                            String name=sc.next();
                            System.out.println("Enter address=");
                            String add=sc.next();
                            System.out.println("Enter NO_Of_Hour & rate=");
                            int hour=sc.nextInt();
                            int rate=sc.nextInt();
                            
                            ob1[i]=new parttime(name,add,hour,rate);
                        }

                        for (int i = 0; i < n; i++) {
                            ob1[i].disp();
                        }
                    
                    break;
            
            }
        } while (ch<3);
        

    }
}
