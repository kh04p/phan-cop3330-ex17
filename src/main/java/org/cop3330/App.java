package org.cop3330;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        bac bac = new bac();
        Scanner input = new Scanner(System.in);
        String weight = " ";
        String alcohol = " ";
        String hours = " ";
        double bacLevel;

        System.out.print("What is your gender? ");
        String gender = input.nextLine().trim().toLowerCase();

        if (gender.equals("man") || gender.equals("male") || gender.equals("m")) {
            bacLevel = bac.prompt(0.73);
            System.out.printf("Your BAC is %.4f.%n", bacLevel);
            String output = (bacLevel < 0.08) ? ("It is legal for you to drive.") : ("It is not legal for you to drive.");
            System.out.println(output);
        }
        else if (gender.equals("woman") || gender.equals("female") || gender.equals("f")) {
            bacLevel = bac.prompt(0.66);
            System.out.printf("Your BAC is %.4f.%n", bacLevel);
            String output = (bacLevel < 0.08) ? ("It is legal for you to drive.") : ("It is not legal for you to drive.");
            System.out.println(output);
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
