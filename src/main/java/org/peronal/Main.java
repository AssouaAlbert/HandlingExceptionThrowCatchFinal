package org.peronal;

import org.peronal.exception.InvalidInputException;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome To Age Validator");
        try {
            System.out.println("Are You 18+: ");
            double numerator = getInput();
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double getInput() throws InvalidInputException {
        try {
            double input = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Please Try Again; Enter a valid input.");
        }
        return Double.parseDouble(sc.nextLine());
    }
}