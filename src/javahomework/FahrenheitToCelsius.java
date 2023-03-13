package javahomework;

import java.util.Scanner;

/**
 * Temperature value in degree Fahrenheit and convert to degree Celsius
 */
public class FahrenheitToCelsius {
    static double Fahrenheit, Celsius;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature value in degree Fahrenheit:  " );
     double   Fahrenheit = input.nextDouble();

     double Celsius = (( 5 * (Fahrenheit - 32.0))/ 9.0);
       System.out.println(Fahrenheit + "degree Fahrenheit is equal to " +  Celsius  +  " in celsius");
        input.close();

    }


    }



