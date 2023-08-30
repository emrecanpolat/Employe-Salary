package com.company;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Murat",2000,45,1985);

        System.out.println("Employee Name: " + employee1.name);
        System.out.println("Current Salary: " + employee1.salary);
        System.out.println("Tax: " + Employee.tax(employee1.salary));
        System.out.println("Bonus: " + Employee.bonus(employee1.workHours));
        System.out.println("Salary Raise: " + Employee.raiseSalary(employee1.hireYear, employee1.salary));
        System.out.println("Final Salary: "+(employee1.salary-Employee.tax(employee1.salary)+
                Employee.bonus(employee1.workHours)+
                Employee.raiseSalary(employee1.hireYear, employee1.salary)) );


    }










}


