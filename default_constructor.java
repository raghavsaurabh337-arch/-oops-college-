class def_con
{
     int a;String b;boolean c; double d;
     def_con()  // DEfault 
     {
          a=100;
          b="saurabh Raghav ";
          c=true;
          d=4543.78;
          System.out.println("I am Default Constructor");

     }
     void display()
     {
          System.out.println(a+" "+b+" "+c+" "+d );

     }
}


public class default_constructor {
     public static void main(String[] args) {
          def_con obj=new def_con();
          obj.display();
     }
     
}
