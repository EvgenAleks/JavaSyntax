package class20.homework;

/*
Shape class has a constructor that takes the radius and has a subclass as  circle class.
In circle class create a method to calculate the area of circle. Test your code.
        */
public class Shape {

    double radius;

    Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {
    static double pI;

    Circle(double radius, double pI) {
        super(radius);
        this.pI = pI;
    }

    double getArea() {
        return (super.radius * super.radius) * pI;
    }
}

