
class book
{
    int bno,qty;
    String bname,author;
    float price,tot;

    void accept(int bno1,String bname1,String author1,int price1,int qty1)
     {
        bno=bno1;
        bname=bname1;
        author=author1;
        price=price1;
        qty=qty1;
     }

     void calculate()
     {
        tot=qty*price;
     }

     void disp()
     {
       System.out.println("book no="+bno);
       System.out.println("book name="+bname);
       System.out.println("book author="+author);
       System.out.println("Book price="+price);
       System.out.println("Book total="+tot);

     }

     public static void main(String arg[])
      {
        book ob=new book();
        ob.accept(101,"java","mr.aaa",300,2);
        ob.calculate();
        ob.disp();
      }
}