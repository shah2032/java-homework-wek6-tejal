package javahomework;

import java.util.Scanner;

/**
 * Calculate the area of a triangle.
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of triangle: ");
        double height = scanner.nextDouble();

        double AreaOfTriangle = (( base * height)/2);
        System.out.println("area of triangle is : " +  AreaOfTriangle);
        scanner.close();
    }

}
