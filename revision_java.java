
class Encapslution{
     private int a=10;
     void setnum(int b){
          a=b;


     }
     int getnum(){
          return a;

     }
}

public class revision_java{
     public static void main(String[] args){
          Encapslution obj =new Encapslution();
          obj.setnum(67);
          System.out.println(obj.getnum());
          


     }
}
