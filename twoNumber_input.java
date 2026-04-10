import java.util.*;

public class twoNumber_input {
     public static void main(String[] args) {
          Scanner Sc =new Scanner(System.in);
          System.out.println("Enter the values of num1 & num2");
          int num1 = Sc.nextInt();
          int num2 = Sc.nextInt();
          int sum=num1+num2;
          System.out.println("number od sum :" + sum);
          
          System.out.println("Enter the value of radius");  
          Sc.close();
     }
     
}
