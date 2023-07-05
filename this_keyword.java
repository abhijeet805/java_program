class this_key
{
    int a=10;

    void show()
    {
        int a=50;  //Local Variable 
        System.out.println("value1="+a);
        System.out.println("value2="+this.a);

        this.a=1000;
        a=5000;
        System.out.println("value3="+this.a);
        System.out.println("value1="+a);
                
    }

    public static void main(String arg[]){
    this_key ob=new this_key();
    ob.show();
    }
}