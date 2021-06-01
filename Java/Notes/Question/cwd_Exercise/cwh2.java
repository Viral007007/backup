//chapter 1 ; prectice set 1 ; question 1 ; sum of three number

import java.util.Scanner;

public class cwh2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Float num1,num2,num3,sum;

        System.out.print("Enter the number 1 : ");
        num1 = input.nextFloat();
        System.out.print("Enter the number 2 : ");
        num2 = input.nextFloat();
        System.out.print("Enter the number 3 : ");
        num3 = input.nextFloat();

        sum = num1+num2+num3;

        System.out.printf("The sum of three number is %f",sum);

        input.close();
        
    }
}
