class demo {
    
    public static void main(String[] args) {
        try{
            int a[]=new int[-5];
            a[0]=555;
            a[3]=123;
            System.out.println("Value="+a[0]);
        }
        catch(Exception e1)
        {
            System.out.println("Error="+e1);
        } 
    }
}
