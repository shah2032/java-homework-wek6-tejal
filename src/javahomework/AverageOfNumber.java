package javahomework;
/**
 * take three numbers as input to calculate and print the average of the numbers
 */

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        int first, second, third ,add;
         double    average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three Number :");
        first = scanner.nextInt();
        second = scanner.nextInt();
        third = scanner.nextInt();
        add =  first + second + third;
        average = (double) add/3;
        System.out.println("Average : " + average);

        scanner.close();
    }
}
