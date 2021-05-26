//sum of three number

import java.util.Scanner;

public class viral4 {
    public static void main(String[] args) 
    {
        System.out.println();
        float sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        float x = input.nextFloat();
        sum += x;
        System.out.print("Enter the second number :");
        float y = input.nextFloat();
        sum += y;
        System.out.print("Enter the third number :");
        float z = input.nextFloat();
        sum += z;

        System.out.format("The sum of number is : %f \n ",sum);

        input.close();
        
    }
}
