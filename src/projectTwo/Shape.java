package projectTwo;


//    Create an Interface 'Shape' with undefined
//    methods as calculateArea and
//    calculatePerimiter. Create 2 classes Circle &
//    Square that implements functionality defined in
//    the Shape Interface. Test your code.
public interface Shape {
    void calculateArea();

    void calculatePerimeter();

}

class Circle implements Shape {


    final double pi = 3.14;
    static double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of the circle is " + (pi * (radius * radius)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the circle is " + (2*pi*radius));
    }
}

class Square implements Shape {

    static double side;

    Square(double side) {
        this.side = side;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of the square is " + (side*side));

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the sqare is " + (side*4));
    }


    public static void main(String[] args) {

        Circle cir = new Circle(3);
        cir.calculateArea();
        cir.calculatePerimeter();
        System.out.println("************************************");
        Square sq = new Square(5);
        sq.calculateArea();
        sq.calculatePerimeter();
    }
}