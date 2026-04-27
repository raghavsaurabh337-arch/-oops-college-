class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal obj = new Dog();  // parent reference, child object
        obj.sound();
    }
}