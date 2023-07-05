class volume1
{
    void volume(float r)
    {
      System.out.println("sphere="+1.3f*3.14f*r*r*r);
    }
    void volume(float r,float h)
    {
      System.out.println("cone="+0.3f*3.14f*r*r*h);
    }
    void volume(double r,double h)
    {
      System.out.println("cylinder="+3.14f*r*r*h);
    }

    static public void main(String arg[])
     {
        volume1 ob=new volume1();
        ob.volume(4.5f);
        ob.volume(4.66f,8.9f);
        ob.volume(2.65,3.2);
     }
}