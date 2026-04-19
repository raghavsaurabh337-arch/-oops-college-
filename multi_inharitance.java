interface  debit{
     void debitcard();
}


interface credit{
     default  void creditcard(){
          System.out.println("this is credit card interface");
     }

     
}


class bank implements credit , debit{
     public  void debitcard()
     {
          System.out.println("this is debit card");

     }
     public void creditcard(){
           System.out.println("this is credit card");

     }
} 
public class multi_inharitance {
     public static void main(String[] args) {
          bank obj = new bank();
          obj.creditcard();
          obj.debitcard();

         
     }
}
