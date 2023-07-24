class find_sum_pair
{

    static void find_sum_pair(int a[],int n,int sum)
     {
           for (int i = 0; i < a.length; i++) {
              
             for (int j = i+1; j < a.length; j++) {
                    if(a[i]+a[j]==sum)
                     {
                        System.out.println("pair= "+a[i]+" + "+a[j]+" = "+sum);
                     } 
              }
           }
     }
    
public static void main(String[] args) {
        
        int a[]={25,40,10,20,30,25};
        int n=12,sum=30;
         
        find_sum_pair(a,n,sum);
    }
}