class  overloading{
     void show(){
          System.out.println("this is first method" );
     
     }
     void show(int a){
          System.out.println("this is second method A : " + a);
     
     }
     void show(int a ,int b){
          System.out.println("this is third method A & b : " + a+" "+b);
     
     }
    
}

class overloading_con{
     public static void main(String[] args) {
          overloading obj=new overloading();
          obj.show();
          obj.show(10);
          obj.show(10,20);

         
     }
}