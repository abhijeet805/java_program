import java.util.*;

class contry
{
    String cname;
    Scanner sc=new Scanner(System.in);
   void accept_c()
    {
        System.out.println("Enter contry name=");
       cname=sc.next();
    }

}
class state extends contry
{
      String sname;
    void accept_s()
      {
        System.out.println("Enter state name=");
        sname=sc.next();
      }
}


class city extends state
{
     String city_name;
     int area;
     void Acceptc()
     {
        System.out.println("Enter area in arc and city_name=");
        area=sc.nextInt();
        city_name=sc.next();
     }
     void disp()
     {
         System.out.println("Contry name="+cname);
         System.out.println("State name="+sname);
         System.out.println("city name="+city_name);
         System.out.println("Area="+area);
     }
      public static void main(String[] args) {
       
        city ob=new city();
        ob.accept_c();
        ob.accept_s();
        ob.Acceptc();
        ob.disp();
     }
}