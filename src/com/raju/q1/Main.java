package com.raju.q1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Employee> employees = new TreeSet<> (new EmployeeSalaryComparator());
        int count = 1;
        while(count<=4){
            System.out.println("Enter Employee "+count+" details :");
            System.out.println("Enter employee id :");
            int empId = sc.nextInt();
            System.out.println("Enter employee name :");
            String empName = sc.next();
            System.out.println("Enter employee salary :");
            double empSalary = sc.nextInt();
            employees.add(new Employee(empId,empName,empSalary));
            count++;
        }
        for (Employee e :employees) {
            System.out.println(e);
        }
    }
}