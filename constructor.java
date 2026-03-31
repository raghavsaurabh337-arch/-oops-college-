class con
{
     int a; String name;
     con() 
     {
          a=0;
          name=null;
     }
     void show()
     {
          System.out.println(a+" "+name);
     }
}


 class constructor {
     public static void main(String[] args) {
          con obj=new con();
          obj.show();
      }
     
}
