import java.util.Scanner;

class clock{

    int hr,min,sec;

    clock(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter hour,minute,second=");
    hr=sc.nextInt();
    min=sc.nextInt();
    sec=sc.nextInt();
    }
    void check()
    {
        if((hr>=1&&hr<24) && (min>=0 && min<60) && (sec>=0 && sec<60))
         {
             if(hr>=1 && hr<12)
              {
                System.out.println(hr+":"+min+":"+sec+"AM");
              }
             else{
                
                System.out.println(hr+":"+min+":"+sec+"PM");
             }
         }
        else{
            System.out.println("Time is invalid");
        }
    }

    public static void main(String[] args) {
        clock ob=new clock();
        ob.check();
    }
}