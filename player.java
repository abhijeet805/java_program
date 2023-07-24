import java.util.Scanner;

class playear
{
    int pid;
    int totalrun;
    int Inning,Not_out;
    
    String pname;
    float avg;
   
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter name=");
        pname=sc.nextLine();

        System.out.println("Enter pid=");
        pid=sc.nextInt();
        
        System.out.println("Enter totalrun");
        totalrun=sc.nextInt();
        
        System.out.println("Enter Not_out");
        Not_out=sc.nextInt();
      
        System.out.println("Enter Inning");
        Inning=sc.nextInt();

       avg=Not_out-(totalrun/Inning);
       System.out.println("Average="+avg);
    }
     void disp()
     {
        System.out.println("Max Average==");
         System.out.println("pid="+pid);
         System.out.println("pname="+pname);
         System.out.println("totalrun="+totalrun);
         
         System.out.println("Inning="+Inning);
     }

    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter limit=");
         int n=sc.nextInt();

         playear ob[]=new playear[10];
          for(int i=0;i<n;i++)
           {
              ob[i]=new playear();
              ob[i].accept();
           }
           float max;
           max=ob[0].avg;
           int s=0;
           for(int i=0;i<n;i++)
            {
               if(ob[i].avg > max)
                {
                   s=i;
                   max=ob[i].avg;
                }
            }
            ob[s].disp();

    }
}