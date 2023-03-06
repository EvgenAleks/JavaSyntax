package class30.homework;

import java.util.HashMap;
import java.util.Map;

public class Taks_3 {
//    Create a Map that will store Employee name and salary.
//    Write a logic to retrieve an employee who gets the highest salary.
//    Output should be in the below format
//    John Smith=$100000
    public static void main(String[] args) {
        Map<String, Integer> employeeSalaryMap = new HashMap<String, Integer>();

        employeeSalaryMap.put("John Smith", 100000);
        employeeSalaryMap.put("Bob Dylan", 85000);
        employeeSalaryMap.put("Elvis Presley", 120000);

        String highestSalaryEmployee = "";
        int highestSalary = 0;
        for (Map.Entry<String, Integer> entry : employeeSalaryMap.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalaryEmployee = entry.getKey();
                highestSalary = entry.getValue();
            }
        }
        System.out.println(highestSalaryEmployee + " =$ " + highestSalary);
    }
}
