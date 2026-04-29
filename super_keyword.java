class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);        // black (child)
        System.out.println(super.color);  // white (parent)
    }
}
public class super_keyword {
     public static void main(String[] args) {
         Dog obj= new Dog();
         obj.printColor();
     }
     
}
