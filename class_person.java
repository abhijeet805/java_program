class product
{
    int pid,qty;
    String pname;
    float cost;
    static int cnt=0;
    product()
    {    cnt++;
        System.out.println("object_count="+cnt);
         pid=101;
         pname="bat";
         qty=30;
         cost=1500;
    }
    
 product(int pid,String pname,int qty,float cost)
 {
    cnt++;
    System.out.println("object_count="+cnt);
    this.pid=pid;
    this.pname=pname;
    this.cost=cost;
    this.qty=qty;
 }
 void display()
 {  
    System.out.println();
     
    System.out.println("Product id="+pid);

    System.out.println("Product name="+pname);
    System.out.println("Product quantity="+qty);
    System.out.println("Product cost="+cost); 
}
    public static void main(String[] args) {
        product ob=new product();
        product ob1=new product(102,"pen",150,50);
        product ob2=new product(103,"pensil",100,40);
        product ob3=new product(104,"shoes",231,800);
        product ob4=new product(105,"Watch",80,1600);
        ob.display();
        ob1.display();
        ob2.display();
        ob3.display();
        ob4.display();
    }
}
