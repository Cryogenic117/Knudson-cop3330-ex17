/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String userInput;
        double a, w, r=0, h, bac, par;
        par = 0.08;

            System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
            userInput = input.nextLine();
            int checker = Integer.parseInt(userInput);

            if(checker == 1)
                r = 0.73;
            if(checker == 2)
                r = 0.66;
            if(r == 0)
                return;


        System.out.print("How many ounces of alcohol did you have? ");
        userInput = input.nextLine();
        a = Double.parseDouble(userInput);

        System.out.print("What is your weight, in pounds? ");
        userInput = input.nextLine();
        w = Double.parseDouble(userInput);

        System.out.print("How many hours has it been since your last drink? ");
        userInput = input.nextLine();
        h = Double.parseDouble(userInput);
        bac = a * 5.14 / w * r - .015 * h;
        System.out.printf("%nYour BAC is %f%n", bac);
        String temp = bac >= par ? "It is not legal for you to drive." : "It is legal for you to drive.";
        System.out.println(temp);






    }
}
