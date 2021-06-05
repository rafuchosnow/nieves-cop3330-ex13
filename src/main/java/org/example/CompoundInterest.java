package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String principalString = input.nextLine();
        float principalNumber = Float.parseFloat(principalString);

        System.out.print("Enter the rate of interest: ");
        String rateString = input.nextLine();
        float rateNumber = Float.parseFloat(rateString);

        System.out.print("Enter the number of years: ");
        String yearString = input.nextLine();
        int yearNumber = Integer.parseInt(yearString);

        System.out.print("What is the number of times the interest is compounded per year? ");
        String compoundString = input.nextLine();
        int compoundNumber = Integer.parseInt(compoundString);

        double formula = principalNumber * (Math.pow( 1 +((rateNumber / 100) / compoundNumber), compoundNumber * yearNumber));
        DecimalFormat dfDollar = new DecimalFormat("#.##");

        System.out.println("$" + principalNumber + " invested at " + rateNumber + "% for " + yearNumber + "" +
                           " years compounded " + compoundNumber + " times per year is $" + dfDollar.format(formula) + ".");


    }
}
