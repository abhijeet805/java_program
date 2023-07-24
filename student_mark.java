class SYmarks
{
    int computer,maths,electronic;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter computer out of 500,math,electronic marks=");
    computer=sc.nextInt();
    maths=sc.nextInt();
    electronic=sc.nextInt();

}
class TYmarks extends SYmarks
{
    int theory,practicals;
    
    System.out.println("Enter Theory,practical marks=");
    theory=sc.nextInt();
    practicals=sc.nextInt();
}

class student extends TYmarks
{
   int rno;
   String name;
   float total;
   total=(computer+practicals)/
   
}