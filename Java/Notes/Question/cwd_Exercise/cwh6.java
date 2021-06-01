//chapter 1 ; prectice set 1 ; question 5 ; check if user inputed integer or not

import java.util.Scanner;

public class cwh6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean number;

        System.out.print("Enter the integer number : ");
        number = input.hasNextInt();

        if(number){
            System.out.println("The entered number is integer ");
        }
        else{
            System.out.printf("The entered number is not integer ");
        }

        input.close();
    }            
}