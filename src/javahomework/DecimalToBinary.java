package javahomework;

import java.util.Scanner;

/**
 * java program to convert a decimal number to binary number
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal,binary;
        double a = 5;
        Scanner obj = new Scanner(System.in);
        System.out.println("Input a decimal number :");
          decimal = obj.nextInt();
        System.out.println("Binary Number is :" +Integer.toBinaryString( 5));
        obj.close();

    }

}
