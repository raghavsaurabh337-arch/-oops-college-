
class animal{
     int a=10;
     void baise(){


          System.out.println("this is animal class");
     }
}
class dog extends animal{
     void child(){
          System.out.println("value of a:" + a);

          System.out.println("this is dog class which is extend animal class");
     }
}

public class inhertance {
     public static void main(String[] args) {
          dog obj = new dog();
          // obj.baise();
          obj.child();   
         
     }
     
}
