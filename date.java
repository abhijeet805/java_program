import java.util.Scanner;

class InvalidDate extends RuntimeException
{
    public String toString()
    {
        return "Invalid Date";
    }
}
class date 
{
   public static void main(String[] args) {
    int dd,mm,yy;
    try{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter date,month,Year=");
    dd=sc.nextInt();
    mm=sc.nextInt();
    yy=sc.nextInt();   
        
    if(mm>12)
      throw new InvalidDate();

    if((mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12) && (dd>31))
       throw new InvalidDate();

    if((mm==4 || mm==6 || mm==8 || mm==9 || mm==11) && (dd>30))
       throw new InvalidDate();

    if((mm==2) && (yy%4==0) && (dd>29))
       throw new InvalidDate();

      if((mm==2) && (yy%4==1) && (dd>28))
        throw new InvalidDate();

     System.out.println("date="+dd+"/"+mm+"/"+yy);

    }
    catch(Exception e)
    {
        System.out.println("Error="+e);
    }
}
}