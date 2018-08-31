// Joe Adcock
// Period 3
// Computing a person's income tax

import java.util.Scanner;

public class IncomeTaxCalculator
{
    public static void main(String [] args)
    {
        //setting up the constants
        final double TAX_RATE = 0.20;
        final double STANDARD_DEDUCTION = 10000.0;
        final double DEPENDENT_DEDUCTION = 2000.0;
        
        //creating a scanner
        Scanner reader = new Scanner(System.in);
        
        //declaring the variables
        double grossIncome;
        int numDependents;
        double taxableIncome;
        double incomeTax;
        
        //asking for user inputs
        System.out.print("Enter the gross income: ");
        grossIncome = reader.nextDouble();
        System.out.print("Enter the number of dependents: ");
        numDependents = reader.nextInt();
        
        //calculating the income tax
        taxableIncome = grossIncome - STANDARD_DEDUCTION - DEPENDENT_DEDUCTION * numDependents;
        incomeTax = taxableIncome * TAX_RATE;
        
        //printing the result
        System.out.println("The income tax is $" + incomeTax);
    }
}