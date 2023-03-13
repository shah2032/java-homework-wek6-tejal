package javahomework;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods
 */

public class Calculation {
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a =");
         a = scanner.nextInt();
        System.out.println("Enter value of b = ");
        b = scanner.nextInt();
        Calculation obj = new Calculation();
        obj.addition();
        obj.subtraction();
        multiplication();
        division();
        scanner.close();
    }
    public void addition(){
        System.out.println("Addition ="  + (a+ b));
    }
    public void subtraction(){
        System.out.println("Subtraction ="  +  (a - b));

    }
    public static void multiplication(){
        System.out.println("Multiplication = "  + (a * b));

    }
    public static void division(){
        System.out.println("Division = "  + (a / b));
    }


    }