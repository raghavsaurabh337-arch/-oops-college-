
public class exception_handle {

    public static void main(String[] args) {
        try {
            int a = 50, b = 0, c;
            c = a / b;
            System.out.println(c);
          }
          catch(ArithmeticException e) {
              System.out.println(e);
          }
          finally{
               System.out.println("Always execute ");
          }
         
    }

}
