class def_con
{
     int a;String b;boolean c;
     def_con()  // DEfault 
     {
          a=100;
          b="saurabh Raghav ";
          c=true;

     }
     void display()
     {
          System.out.println(a+" "+b+" "+c);

     }
}


public class default_constructor {
     public static void main(String[] args) {
          def_con obj=new def_con();
          obj.display();
     }
     
}
