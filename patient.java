import java.util.Scanner;

class CovidExe extends Exception
{
    public String toString()
    {
        return "patient is covid +ve need to hospatlize";
    }
}

class patient
{
    String pname;
    int age,oxy_level,HRCT;
    Scanner sc=new Scanner(System.in);
    void accept()
    {   try{
        System.out.println("Enter pname,age,oxygen,HRCT");
        pname=sc.next();
        age=sc.nextInt();
        oxy_level=sc.nextInt();
        HRCT=sc.nextInt();
       }catch(Exception e)
       {
        System.out.println("Error="+e);
       }
    }
    void check()
    {
         try {
            if(oxy_level<95 && HRCT>10)
              throw new CovidExe();
               disp();
         } catch (Exception e) {
             System.out.println("Error="+e);
            // TODO: handle exception
         }
    }
   void disp()
   {
     System.out.println("Patient name="+pname);
     System.out.println("Patient age="+age);
     System.out.println("Patient Oxy_level="+oxy_level);
     System.out.println("Patient HRCT Score="+HRCT);
   }
}

class demo{
    public static void main(String[] args) {
        patient ob=new patient();
        ob.accept();
        ob.check();
    }
}