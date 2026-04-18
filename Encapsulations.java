class student{
     private int age;
     public  void setage(int age){
          this.age=age;
     }
     int  getage(){
          return age;


     }
}

public class Encapsulations {
     public static void main(String[] args) {
          student obj = new student();
          obj.setage(46);
          System.out.println(obj.getage());
         
     }
     
}
