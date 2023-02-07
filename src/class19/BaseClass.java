package class19;

public class BaseClass {

    String name = "John";

    void hello() {
        System.out.println("Hello method from BaseClass");
    }
}

class Child extends BaseClass {

    String name = "Jane";

    void callMe() {
        System.out.println(this.name); // Jane
        System.out.println(super.name); // John
    }

    void hello() {
        System.out.println("Hello method from ChildClass");
    }

    void callingParentMethod() {
        hello(); // child
        super.hello(); // parent
    }
}