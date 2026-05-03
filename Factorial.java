
import java.util.Scanner;




class fact{
     void simple_Factorial(int num){
          int fact=1;
          for(int i=1;i<=num;i++)
          {
               fact=fact*i;   
               
          }
          System.out.println("Factorial: "+fact);
     }
}
public class Factorial {
     public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter the number:");
          int num =sc.nextInt();
     
          fact obj=new fact();
          obj.simple_Factorial(num);
     }
     
}
