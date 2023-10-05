package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {

    public static void main(String []args) {

        //declare variables
        Scanner keyboard = new Scanner(System.in);
        double num1;
        double num2;
        double answer;
        String operator;
        System.out.print("Enter the first number: ");
        num1 = keyboard.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = keyboard.nextDouble();
        System.out.println();
        System.out.println("Possible calculations:");
        System.out.println("   (A)dd");
        System.out.println("   (S)ubtract");
        System.out.println("   (M)ultiply");
        System.out.println("   (D)ivide");
        keyboard.nextLine();
        System.out.print("Please select an option: ");
        operator = keyboard.nextLine();


        if(operator.equalsIgnoreCase("A"))
            {
            answer = num1 + num2;
            System.out.println();
            System.out.println(num1 + " " + "+" + " " + num2 + " = " + answer);
            }
        else if(operator.equalsIgnoreCase("S"))
        {
            answer = num1 - num2;
            System.out.println();
            System.out.println(num1 + " " + "-" + " " + num2 + " = " + answer);

        }
        else if(operator.equalsIgnoreCase("M"))
        {
            answer = num1 * num2;
            System.out.println();
            System.out.println(num1 + " " + "*" + " " + num2 + " = " + answer);
        }
        else if(operator.equalsIgnoreCase("D"))
        {
            answer = num1 / num2;
            System.out.println();
            System.out.println(num1 + " " + "/" + " " + num2 + " = " + answer);
        }

    }

}
