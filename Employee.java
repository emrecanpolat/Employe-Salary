package com.company;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    public static double tax(double salary){

        if (salary>1000){
            return salary * 0.03;

        }else {
            return 0;
        }

    }

    public static double bonus(int workHours){

        if (workHours>40){
            return  (workHours-40)*30;
        }else {
            return 0;
        }

    }
    public static double raiseSalary(int hireYear,double salary){

        if (2021-hireYear<10){
            return  salary*0.05;
        }else if (2021-hireYear < 20){
            return salary*0.1;
        }else {
            return salary*0.15;
        }

    }








}

