
import java.util.Scanner;
public class  insert_ele_array{
     public static  void main(String[] args){
          Scanner sc= new Scanner(System.in);
          int n =sc.nextInt();
          int[] num = new int[n];
          System.out.println("enter the element of size:");
          for(int i=0;i<=5;i++){
               num[i]=sc.nextInt();
          }
          for(int i=0;i<5;i++){
               System.out.println(num[i]+"");
          }
     }
}
