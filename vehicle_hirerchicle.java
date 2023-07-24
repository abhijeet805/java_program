import java.util.Scanner;

class vehicle
{
    String company;
    float price;

    Scanner sc=new Scanner(System.in);
    void acceptv()
    {
        System.out.println("Enter company,price=");
        company=sc.next();
        price=sc.nextFloat();
        
    }
    void dispv()
    {
        System.out.println("Company="+company);
        System.out.println("price="+price);
    }
}
class LMV extends vehicle
{
    int miledge;
    void acceptlmv()
    {
        System.out.println("Enter mildge=");
        miledge=sc.nextInt();      

    }
    void displmv()
    {
         
        System.out.println("miledge="+miledge);
    }
}


class HMV extends vehicle
{
    int capacity;
    void accepthmv()
    {
        System.out.println("Enter capacity_in_tons=");
        capacity=sc.nextInt();      
    }
     void disphmv()
    {
        System.out.println("capacity_in_tons="+capacity);
              
    }
}

class VDemo
{
    public static void main(String[] args) {
        int n1,n2,ch;
        LMV ob[]=new LMV[15];
        HMV ob1[]=new HMV[15];
         
        Scanner sc=new Scanner(System.in);
        do{
          System.out.println("1-LMV 2-HMV");
         System.out.println("Enter choice=");
          ch=sc.nextInt();

         switch(ch)
         {
            case 1:
               System.out.println("Enter limit for LMV=");
               n1=sc.nextInt();

               for (int j = 0; j < n1; j++) {
                   ob[j]=new LMV();
                   ob[j].acceptv();
                   ob[j].acceptlmv();
               }

               System.out.println("Display=\n");

               for (int i = 0; i < n1; i++) {
                  ob[i].displmv();
                  ob[i].dispv();
               }
               break;

            case 2:
                System.out.println("Enter limit for HMV=");
               n2=sc.nextInt();

               for (int j = 0; j < n2; j++) {
                   ob1[j]=new HMV();
                   ob1[j].acceptv();
                   ob1[j].accepthmv();
               }

               System.out.println("Display=\n");

               for (int i = 0; i < n2; i++) {
                  ob1[i].disphmv();
                  ob1[i].dispv();
               }
               break;
                    
         }
        }while(ch<3);
    }
} 