class move_negetive
{ 
    
    static void move_negetive(int a[],int n)
    {
        int digit;

        for (int i=a.length-2; i >=0 ; i--) {

          if(a[i]<0)
            {
                digit=a[i];
             for (int j = i+1; j < a.length; j++) {
                a[j-1]=a[j];
               }
                a[n-1]=digit;
            }
             
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("  "+a[i]);
        }
    }

    public static void main(String[] args) {
        
        int a[]={25,-5,78,-99,-80,-90,88,-44,34,25,-87,-5};
        int n=12;
         
        move_negetive(a,n);
    }
}