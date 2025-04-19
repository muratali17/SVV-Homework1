package com.murat;

import java.util.Scanner;

public class Calculator {

    public static void calculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is an simple calculator application");
        System.out.println("Please press 'q' to quit");


        while(true){
            System.out.print("Please enter the first number: ");
            String input1 = scanner.next();
            if(input1.equalsIgnoreCase("q"))
                break;

            System.out.print("Please enter the second number: ");
            String input2 = scanner.next();
            if(input2.equalsIgnoreCase("q"))
                break;

            double number1,number2;

            try{
                number1 = Double.parseDouble(input1);
                number2 = Double.parseDouble(input2);
            }catch(NumberFormatException e){
                System.out.println("You entered an invalid number please try again");
                continue;
            }

            System.out.println("Please select an operation: (+,-,*,/)");
            char operation = scanner.next().charAt(0);

            double result;

            switch (operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        System.out.println("Error: cannot divide by zero");
                        continue;
                    }
                    break;
                case 'q':
                    System.out.println("Thank you for using Calculator");
                    System.exit(0);
                default:
                    System.out.println("Invalid operation");
                    return;
            }

            System.out.println("Result: " + result);
        }

        System.out.println("Thank you for using Calculator");
        scanner.close();

    }
}

