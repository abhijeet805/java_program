import java.util.*;


class emp
{
    int eno;
    String ename;
    float sal;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter eno,name and sal");
        eno=sc.nextInt();
        ename=sc.next();
        sal=sc.nextFloat();

    }
    void disp()
    {
        System.out.println("emp no="+eno);
        System.out.println("name="+ename);
        System.out.println("salary="+sal);
        
    }
   static void sort_by_name(emp ob[],int n)
    {
      int pass,i;
      emp temp;
      for(pass=1;pass<n;pass++)
       {
        for(i=1;i<=n-pass;i++)
         {
          if(ob[i].ename.compareTo(ob[i+1].ename)>0)
          {
           temp=ob[i+1];
           ob[i+1]=ob[i];
           ob[i]=ob[i+1];
         }
       }
    }
        System.out.println("eno\tename\tsal");
  
    for(i=1;i<=n;i++)
       System.out.println(ob[i].eno+"\t"+ob[i].ename+"\t"+ob[i].sal);
  }

    public static void main(String arg[])
    {
        int i,ch,s=0,n=0;
         Scanner sc=new Scanner(System.in);
         emp ob[]=new emp[10];

     do{
         System.out.println("\n1-accept \n2-disp \n3-display max sal emp \n4-search by name");
         System.out.println("Enter choice=");
          ch=sc.nextInt();
         switch(ch)
         {
        case 1:
              System.out.println("Enter limit");
               n=sc.nextInt();
              for(i=1;i<=n;i++)
               {
                 ob[i]=new emp();
                 ob[i].accept();
               }
               break;
        case 2:
               
              for(i=1;i<=n;i++)
               { 
                 ob[i].disp();
               }
               break;
        case 3:
             float max; 
              max=ob[1].sal;
             
             for(i=1;i<=n;i++)
              {
                if(ob[i].sal > max){
                   max=ob[i].sal;
                   s=i;
                }
              }
               ob[s].disp();
             break;
        case 4:
            System.out.println("Enter ename to search=");
            String name=sc.next();
            for(i=1;i<=n;i++)
             {
                if(name.equals(ob[i].ename))
                {
                  ob[i].disp();
                 break;
                
                }
             }
          break;
         case 5:
            sort_by_name(ob,n);

            break;
         }
       
     }while(ch<6);
  } 
}