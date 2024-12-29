// Exercise - 4:
package example_038;
class Circle{
    int radius;
    Circle(int r){
        radius = r;
        System.out.println("I am in parameterize constructor of Circle");
    }
    public void area(){
        System.out.println("Area of circle is : "+3.14*radius*radius);
    }
}
class Cylinder extends Circle{
    int height;
    Cylinder(int r, int h){
        super(r);
        height = h;
        System.out.println("I am in parameterized constructor of Cylinder");
    }
    public void volume(){
        System.out.println("Volume of Cylinder is : "+3.14*this.radius*super.radius*this.height);
    }
}

public class Main {
    public static void main(String[] args) {
        // Problem - 1Q
        // Circle c = new Circle(5);
        // c.area();
        Cylinder cy = new Cylinder(5, 10);
        cy.area();
        cy.volume();


        // Problem - 2Q
    }
}