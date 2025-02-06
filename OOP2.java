package OOP;

class Shape{
    String color;

    public void printColor(){
        System.out.println(this.color);
    }

    public void area(){
        System.out.println("Display Area");
    }
}

//Inherited Class
class Triangle extends Shape{

    public void area(int l, int h) {
        System.out.println("triangle Area is: " + (1/2 * (l*h) ));
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println("triangle Area is: " + (1/2 * (l*h) ));
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class OOP2 {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle();

        tri1.color = "Red";
        tri1.area(2,20);
    }
}
