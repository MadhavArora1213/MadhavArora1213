package JAVA;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b, sum, subtract, multiply, divide, modulus;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Calculator");
            System.out.println("Choose 1 for ADD");
            System.out.println("Choose 2 for SUBTRACT");
            System.out.println("Choose 3 for MULTIPLY");
            System.out.println("Choose 4 for DIVIDE");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            System.out.print("Choose the operation you want to perform:- ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first number:- ");
                    a = sc.nextInt();
                    System.out.print("Enter second number:- ");
                    b = sc.nextInt();
                    sum = a + b;
                    System.out.println("The sum of " + a + " and " + b + " is " + sum);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter first number:- ");
                    a = sc.nextInt();
                    System.out.print("Enter second number:- ");
                    b = sc.nextInt();
                    subtract = a - b;
                    System.out.println("The sum of " + a + " and " + b + " is " + subtract);
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Enter first number:- ");
                    a = sc.nextInt();
                    System.out.print("Enter second number:- ");
                    b = sc.nextInt();
                    multiply = a * b;
                    System.out.println("The sum of " + a + " and " + b + " is " + multiply);
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Enter first number:- ");
                    a = sc.nextInt();
                    System.out.print("Enter second number:- ");
                    b = sc.nextInt();
                    divide = a / b;
                    System.out.println("The sum of " + a + " and " + b + " is " + divide);
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("Enter first number:- ");
                    a = sc.nextInt();
                    System.out.print("Enter second number:- ");
                    b = sc.nextInt();
                    modulus = a + b;
                    System.out.println("The sum of " + a + " and " + b + " is " + modulus);
                    System.out.println("");
                    break;
                    case 6:
                    System.exit(0);
            }
        }
    }
}
