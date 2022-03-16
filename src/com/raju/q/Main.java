package com.raju.q;

public class Main {
    public static void main(String[] args) {
        EmployeeBonus eb = new EmployeeBonus();
        try {
            double bonus = eb.bonus("2022/02/02");
            System.out.println("You got "+bonus+" as bonus.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
