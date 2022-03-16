package com.raju.q;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {
    public double bonus(String date) throws InvalidAgeException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if (date.length()!=10 || date.charAt(4)!='-' || date.charAt(7)!='-')
        throw new InvalidAgeException("Please pass the date in correct format");
        LocalDate joiningDate = LocalDate.parse(date, formatter);
        LocalDate currentDate = LocalDate.now();
        Period exp = Period.between(joiningDate, currentDate);
        if(exp.isNegative())
            throw new InvalidAgeException("Age should not be in the future");
        if(exp.getYears()<1)
            return 5000.0;
        else if(exp.getYears()<2)
            return 8000;
        else if(exp.getYears()>2)
            return 10000;
        else
            throw new InvalidAgeException("Please pass the date in correct format");
    }
}
