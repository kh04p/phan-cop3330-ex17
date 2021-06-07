/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class bac {
    private double weight;
    private double alcohol;
    private double hours;

    //check to see if String is numeric
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public double prompt(double ratio) {
        Scanner input = new Scanner(System.in);
        String a = "";
        String w = "";
        String h = "";
        while (!isNumeric(w)) {
            System.out.print("What's your weight? ");
            w = input.nextLine().trim();
        }
        this.weight = Double.parseDouble(w); //converts string to double
        while (!isNumeric(a)) {
            System.out.print("How much alcohol did you consume in ounces? ");
            a = input.nextLine();
        }
        this.alcohol = Double.parseDouble(a); //converts string to double
        while (!isNumeric(h)) {
            System.out.print("How many hours has it been since your last drink? ");
            h = input.nextLine();
        }
        this.hours = Double.parseDouble(h); //converts string to double
        return (this.alcohol * 5.14 / this.weight * ratio) - 0.015 * this.hours;
    }
}
