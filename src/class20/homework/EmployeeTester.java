package class20.homework;

public class EmployeeTester {
    public static void main(String[] args) {

        FullTimeEmployee fte = new FullTimeEmployee("Barry", 30, "Marketing", 6);
        fte.ftEmpInfo();

        Tester tester =
                new Tester("Tony", 44, "IT", 12, "Certified tester");
        tester.testerInfo();

        PartTimeEmployee pte = new PartTimeEmployee("Mary", 34, "Sales", "Works on weekends");
        pte.partTimeInfo();
    }
}
