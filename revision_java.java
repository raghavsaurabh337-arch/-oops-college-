
class Encapslution{
     private int a=10;
     void setnum(int b){
          a=b;


     }
     int getnum(){
          return a;
System.out.println("this is a getter meyhod");
          


     }
}
class array{
     void arr(){

     
     int[] a={2,3,4,5};
     for (int i=0;i<=a.length;i++)
     {

          System.out.println(a[i]+" ");
     }
     }
}
class arrInput{
     void arr(){
          Scanner sc =new Scanner(System.in);
          System.out.print("Enter the array size:");
          int size=sc.nextInt();
           
          int[] arr=new int[size];
     }

}

public class revision_java{
     public static void main(String[] args){
          Encapslution obj =new Encapslution();
          obj.setnum(67);
          System.out.println(obj.getnum());
          array obj1=new array();
          obj1.arr();
          


     }
}
