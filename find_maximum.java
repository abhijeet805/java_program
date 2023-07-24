import java.util.Scanner;

class find_sec_maximum
{
    Scanner sc=new Scanner(System.in);
    
    int find_sec_maximum(int n)
    {
        int max1,max2;

        int a[]=new int[10];
        System.out.println("Enter Arry Element=");
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
          
          max1=a[0];//put first number
        for (int j = 0; j < n; j++) {
            
            if(a[j] > max1)
              max1=a[j];
        }
         
        max2=a[0];
        for (int j = 0; j < n; j++) {
            if(a[j] > max2)
             {
                if(max1 != a[j])
                {
                    max2=a[j];  
                }
                
             }
        }
       System.out.println("first Maximum="+max1);
        return max2;
    }

    public static void main(String[] args) {
     int num;   
      find_sec_maximum ob=new find_sec_maximum();
      num=ob.find_sec_maximum(6);

      System.out.println("Second Maximum="+num);
    }
}