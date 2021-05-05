/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> arrayList = new ArrayList();
        
        arrayList.add(new Employee(9, "Bob", 3000));
        arrayList.add(new Employee(1, "Apple", 10000));
        arrayList.add(new Employee(3, "Dog", 1000));
        arrayList.add(new Employee(20, "Ash", 5000000));
        arrayList.add(new Employee(6, "Brad", 500));
         
        System.out.println("By Rohit Reddy Chandupatla");
        System.out.println("---------Original---------");
        for (Employee employee: arrayList) {
            System.out.println(employee);
        }

        Collections.sort(arrayList);
        System.out.println("\n-------Natural Order-------");
        for (Employee employee: arrayList) {
            System.out.println(employee);
        }

        Comparator<Employee> bySalary = Comparator.comparing(Employee::getEmpSalary);
        Collections.sort(arrayList, bySalary);
        System.out.println("\n-------By Salary-------");
        for (Employee employee: arrayList) {
            System.out.println(employee);
        }

        Comparator<Employee> byName = Comparator.comparing(Employee::getEmpName);
        Collections.sort(arrayList, byName);
        System.out.println("\n-------By Name-------");
        for (Employee employee: arrayList) {
            System.out.println(employee);
        }
        
    
    }
}