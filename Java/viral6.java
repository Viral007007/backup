// sum of two number

import java.util.*;

public class viral6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number1, number2, sum;
        
        System.out.print("Enter the first number :");
        number1 = input.nextInt();
        System.out.print("Enter the second number :");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("The sum of number is %d",sum);

        input.close();
        
    }

}
