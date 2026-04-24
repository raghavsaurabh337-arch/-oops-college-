abstract class animal{
    void abst_meth(){
     System.out.println("abstract class / Animal");

    }
     
}
class dog extends animal{
     void child_meth(){
         System.out.println("Dogs");
     }

}
public class abstract_class{
     public static void main(String[] args){
          dog obj=new dog();
          
          obj.child_meth();
          
     }
}


// notes: abstract class is not create objects.
//  abstract class is a create top and inharit child class . 
// child class is create to object assecss the abstract class  