import java.util.Scanner;

public class Q1
{
    private static final double PI = 3.14159;
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter a int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();

        // Output all inputted numbers
        System.out.println("You have inputted byte value = " + byteValue + ", short value = " + shortValue + ", int value = " + intValue +
        ", long value = " + longValue + ", float value = " + floatValue);

        System.out.print("Enter a number for radius : ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.print("The area for the circle of radius " + radius + " is " + area );
        input.close();
    }
}
