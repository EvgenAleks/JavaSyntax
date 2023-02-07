package class19.homework;

// Write program to inherit class A that has method printF
// which is static and call or reuse that method into class B.
public class NewClass {
     static void printF() {
        System.out.println("Great job!");
    }

    static class B extends NewClass {
        public void printFFF() {
            printF();
        }
    }


        public static void main(String[] args) {

            B classB = new B();
            classB.printFFF();
        }
    }

