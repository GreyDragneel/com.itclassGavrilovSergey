package com.itclass.lesson6.homework.task1;

public class SalaryCounter {

    public double count(double hourlySalary, byte hoursWorked)
            throws SalaryCounterException{
        double salary = 0;
        if (hoursWorked > 40 & hoursWorked <= 60 & hourlySalary >= 8) {
            salary = hourlySalary * 40 + hourlySalary * 1.5 * (hoursWorked - 40);
        } else if(hoursWorked >= 0 & hoursWorked <=40 & hourlySalary >= 8) {
            salary = hourlySalary * hoursWorked;
        } else {
            throw new SalaryCounterException("Invalid arguments. HoursWorked must be"
                    + " more than 0 and less than 60; hourlySalary must be more than 7");
        }
        return salary;
    }
}
