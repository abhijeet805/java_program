class check_num
{   
     private int n;
     check_num()
     {
        n=0;
     }
     check_num(int n)
     {
        this.n=n;
     }

     boolean isnegetive()
     {
         if(n<0)
           return true;
        
        return false;
     }
     boolean ispositive()
     {
        if(n>0)
         return true;

         return false;
     }
     boolean iszero()
     {
        if(n==0)
         return true;

         return false;
     }


     boolean iseven()
     {
        if(n%2==0)
         return true;

         return false;
     }

     boolean isodd()
     {
        if(n%2==1)
         return true;

         return false;
     }

    

  public static void main(String[] args) {
    check_num ob=new check_num(50);

    if(ob.isnegetive())
     System.out.println("number is negetive");

    if(ob.ispositive())
     System.out.println("number is positive");  
    
    if(ob.iszero())
    System.out.println("number is zero");
   
    if(ob.iseven())
     System.out.println("number is even");
     
    if(ob.isodd())
     System.out.println("number is odd");
     
     
   }
}