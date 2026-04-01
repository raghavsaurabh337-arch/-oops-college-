class copy_con{
     int a;
     String b;  // instance variables



    copy_con() {
     a=100;
     b="saurabh";
     System.out.println(a+" "+b);
    }



    copy_con (copy_con ref)
    {
     a=ref.a;
     b=ref.b;
     System.out.println(a+" "+b);
    }
     
}

public class copy_cons {
          public static void main(String[] args) {
               copy_con obj1 = new copy_con();
               copy_con obj2 = new copy_con(obj1);

              
          }
}
