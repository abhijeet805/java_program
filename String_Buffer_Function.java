class demo
{
    public static void main(String[] args) {
        String s1=" My Name is Abhijeet";
        StringBuffer sbr=new StringBuffer(s1);
       
        System.out.println("Length="+sbr.length());
       // System.out.println("Reverse="+sbr.reverse());
        
       sbr.append(" Vetal");
        System.out.println("append="+sbr);
        
        sbr.delete(0, 4);
         System.out.println("delete String="+sbr);
         
         sbr.deleteCharAt(4);
          System.out.println("deleteCharAt String="+sbr);
        
         sbr.insert(4," ");
          sbr.insert(7," ");
         sbr.setCharAt(8, 'a');
          sbr.insert(9," ");

          System.out.println("setCharAt & insert String="+sbr);
         
        }
}