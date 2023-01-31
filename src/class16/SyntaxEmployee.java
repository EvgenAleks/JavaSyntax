package class16;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects.
     */
    String empID;
    double salary;
    static String cEO = "Smmair";


    public static void main(String[] args) {

        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp1.empID = "123ABC";
        emp1.salary = 10000;
        System.out.println(emp1.empID + " " + emp1.salary + " " + emp1.cEO);

        SyntaxEmployee emp2 = new SyntaxEmployee();
        emp2.empID = "126ABC";
        emp2.salary = 12000;
        System.out.println(emp2.empID + " " + emp2.salary + " " + emp2.cEO);
    }
}
