class car{
     String name;
     int model_no;
     car(String name1,int model_no2)
     {
          name=name1;
          model_no=model_no2;    
               
     }
     void show()
     {
          System.out.println(name+" "+model_no);

     }
}
class parmeterrized_constuctor
{
     public static void main(String[] args) {
          car obj=new car("thar",2388);
          obj.show();
          
     }
}
