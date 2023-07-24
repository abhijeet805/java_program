import java.util.Scanner;

 class book1 {
    int bno;
    String bname;
    int qty;
     Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter book no=");
        bno=sc.nextInt();
        System.out.println("Enter book name=");
        bname=sc.next();
        System.out.println("Enter book qty=");
        qty=sc.nextInt(); 
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Limit=");
         int n=sc.nextInt();

         book1 ob[]=new book1[10];
         for(int i=0;i<n;i++)
          {
            ob[i]=new book1();
            ob[i].accept();  
        }

         System.out.println("Enter book to search=");
        String s1=sc.next();
        for (int i = 0; i < ob.length; i++) {
            
            if(s1.equals(ob[i].bname))
              {
                System.out.println("Quantity="+ob[i].qty);
              }
        }
        
    }
}