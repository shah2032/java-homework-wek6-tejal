package javahomework;
/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */

import java.util.Scanner;

public class RadiusOfCircle {
    static  double radius , area;
    static double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle = " );
        radius = scanner.nextDouble();
       // area = PI*radius*radius;
       // System.out.println("Area of the circle is:" + area);
        MyMethod();
        scanner.close();
    }

   public static void MyMethod(){
        area = PI*radius*radius;
       System.out.println("Area of the circle is:" + area);
   }
}
