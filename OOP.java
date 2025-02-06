package OOP;


class Pen{
//    Pen me kiya kiya property hoskti he

    String color;
    String type;

//    Pen ks ks trh k action perform kr skta he

    public void write(){
        System.out.println("Pen is write something..");
    }

    public void printColor(){
// this -> the same object whose calling the function.
        System.out.println("Pen Color is " + this.color); // identify which object is calling the function

    }
}

class Student{
    String name;
    int age;



//    Parameterize Constructor
//    Student(String name,int age){
////        this.name and this.age refers to the class attribute which is define above
////        we have to assign value using parameter
//        this.name = name;
//        this.age = age;
//
//        System.out.println("Student is created with the name "+ name + " and age " + age);
//    }

//    Copy Constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    // Non-Parameterize Constructor
    Student(){
        System.out.println("The Student object is created using constructor");
    }

//    Polymorphism
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }


    public void printInfo(String name,int age){
        System.out.println(name+" "+ age);
    }


// Class Methods
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOP {
    public static void main(String[] args) {
        /*
         Pen 1 Object
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();
        pen1.printColor();

//        Create 2nd Object of Pen
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ball";

        pen2.write();
        pen2.printColor();

         */

//        Student Object
        Student std1 = new Student();
        std1.name = "Bilal";
        std1.age = 21;

        std1.printInfo(std1.name);
        std1.printInfo(std1.age);
        std1.printInfo(std1.name,std1.age);

    }
}
