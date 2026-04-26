
import java.util.Random;

interface pencard{
     void pen_card();
}
class adharcard implements pencard{
     public void pen_card(){
          Random r =new Random();
         long num = 100000000000L + (long)(r.nextDouble() * 900000000000L);

          System.out.println("Random 12 Digit Number:: "+num);
     }
}
public class interfaces {
     public static void main(String[] args) {
          adharcard obj=new adharcard();
          obj.pen_card();
     }

}
