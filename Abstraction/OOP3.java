package OOP.Abstraction;


abstract  class Animal{

    abstract  void walk(); // jo bhi class animal class ko extend kre gi us me walk function hona hi chahiye us k liye hm abstract ka keyword lagate he.
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse can walk with 4 legs");
    }
}


interface Human{
    void walk();
}

interface Man{
    void eat();
}

class Person implements  Human,Man{

    @Override
    public void walk() {
        System.out.println("A person can walk.");
    }

    @Override
    public void eat() {
        System.out.println("A person can eat");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken can walk with 2 legs");
    }
}


public class OOP3 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();

//        Animal animal = new Animal(); //


//        Human human = new Human();

        Person p1 = new Person();
        p1.walk();
        p1.eat();

    }
}
