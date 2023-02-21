package projectTwo;

import class26.Dog;

//        We have to calculate the average of marks
//        obtained in three subjects by student A and by
//        student B. Create class 'Marks' with an abstract
//        method 'getPercentage' that will be returning
//        the average percentage of marks. Provide
//        implementation of abstract method in classes
//        'A' and 'B'. The constructor of student A takes the
//        marks in three subjects as its parameters and
//        the marks in four subjects as its parameters for
//        student B. Test your code
public class StudentAB {

    public static void main(String[] args) {

        A stA = new A(8,6,7);
        System.out.println(stA.getPercentage());

        B stB = new B(8,6,7,2);
        System.out.println(stB.getPercentage());
    }
}

abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {

    double mark1, mark2, mark3;

    A(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
   public double getPercentage() {
        double total = (mark1 + mark2 + mark3)/3;
        return total;
    }
}
class B extends Marks {
    double mark1, mark2, mark3, mark4;

    B(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    public double getPercentage() {
        double total = (mark1 + mark2 + mark3+mark4)/4;
        return total;
    }
}
