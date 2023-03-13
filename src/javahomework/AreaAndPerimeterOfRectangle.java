package javahomework;

/**
 * print the area and perimeter of a rectangle
 * test data : Width=5.5 Height=8.5
 */

public class AreaAndPerimeterOfRectangle{

    public static void main(String[] args) {
        double  Width = 5.5;
        double Height = 8.5;
       double area = Width * Height;
       double perimeter = 2 * (Width + Height);
        System.out.println("Area is : 5.5 * 8.5 = " +  area);
        System.out.println("Perimeter is  2 * (5.5  + 8.5) = "  +  perimeter );

    }
}
