// Joe Adcock
// Period 3
// Calculating an employee's total weekly pay

import java.util.Scanner;

public class Project3_4_Pay
{
    public static void main(String [] args)
    {
        //creating a scanner
        Scanner reader = new Scanner(System.in);
        
        //declaring the variables
        double hourlyWage;
        double regularHours;
        double overtimeHours;
        double weeklyPay;
        
        //
        System.out.print("Enter the employee's hourly wage: ");
        hourlyWage = reader.nextDouble();
        System.out.print("Enter the employee's regular hours: ");
        regularHours = reader.nextDouble();
        System.out.print("Enter the employee's overtime hours: ");
        overtimeHours = reader.nextDouble();
        
        //
        weeklyPay = (hourlyWage * regularHours) + (hourlyWage * 1.5 * overtimeHours);
        
        //
        System.out.println("The employee's total weekly pay is $" + weeklyPay);
    }
}
