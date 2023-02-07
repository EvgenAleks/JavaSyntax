package class19;

public class Child1 extends Parent {

    public static void main(String[] args) {

        Child1 c1 = new Child1();

        c1.hello();
        c1.bye();
        // c1.money(); 'money()' has private access
        Child1.bye();
        Parent.bye();
        c1.name = "Nugzar";
        Child1.lastName = "Berik";
    }
}
