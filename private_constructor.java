private class private_const{
     int a;
     double b;
     String c;
    private_const() {
     a=10;
     b=900.98;
     c="Saurabh Raghav";

        System.out.println(" this is private constructor" +a+" "+b+" "+c);
        
    }

     
}
class b{
               private_const obj =new private_const();

     
}

public class private_constructor {
     public static void main(String[] args) {
          // private_const obj =new private_const();
          b ob=new b();

         
     }
     
}
