import java.util.*;
class student
{
    int rno;
    String name;
    float per;

     student()
     {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter info rno,name,percentage=");
        rno=sc.nextInt();
        name=sc.next();
        per=sc.nextFloat();
     }
    void disp()
     {
        System.out.println(rno+"\t"+name+"\t"+per+"\t");
     }

   static  void sort_by_per(student ob[],int n)
    {
      int pass,i;
       student t;
      for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
             {
                if(ob[i].per > ob[i+1].per)
                 {
                    t=ob[i+1];
                    ob[i+1]=ob[i];
                    ob[i]=t;
                 }
             }
        }
        System.out.println("sorted data \nrno\tname\tper");
        for(i=0;i<n;i++)
           ob[i].disp();
    }
   


     public static void main(String arg[])
      {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter limit=");
        int n=sc.nextInt();

        student ob[]=new student[20];
        for(int i=0;i<n;i++)
         {
            ob[i]=new student();
         }
         System.out.println("original data \nrno\tname\tper");
         for(int i=0;i<n;i++)
            ob[i].disp();
      
       sort_by_per(ob,n);
        
      }
}