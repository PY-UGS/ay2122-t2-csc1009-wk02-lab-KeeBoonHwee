import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float[] num = new float[4];
        num[0] = input.nextFloat();
        num[1] = input.nextFloat();
        num[2] = input.nextFloat();
        num[3] = (num[0] + num[1] + num[2]) / 3;
        System.out.print("The average of " + num[0] + " "  + num[1] + " " +  num[2] + " is " + num[3]);
        input.close();
    }
}
