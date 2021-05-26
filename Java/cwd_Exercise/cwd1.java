// Exercise 1.1  percentage of five subject 

import java.util.Scanner;

public class cwd1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float total ;

        System.out.print("Enter the mark of first subject : ");
        float m1 = input.nextFloat();
        System.out.print("Enter the mark of second subject : ");
        float m2 = input.nextFloat();
        System.out.print("Enter the mark of third subject : ");
        float m3 = input.nextFloat();
        System.out.print("Enter the mark of fourth subject : ");
        float m4 = input.nextFloat();
        System.out.print("Enter the mark of five subject : ");
        float m5 = input.nextFloat();

        total = m1+m2+m3+m4+m5;

        System.out.printf("The percentage of five subject is %f ",total/5.0);
        System.out.println("%");
        
        input.close();
    }
}