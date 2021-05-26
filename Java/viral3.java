// percentage of five subject

import java.util.Scanner;

public class viral3 {
    public static void main(String[] args) {
        System.out.println();

        float total;

        System.out.println("PERSENTAGE OF FIVE SUBJECT");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = input.nextLine();
        System.out.println("Hello, " + name + " !!");
        System.out.print("Mark of 1st subject :");
        float sub1 = input.nextFloat();
        System.out.print("Mark of 2st subject :");
        float sub2 = input.nextFloat();
        System.out.print("Mark of 3st subject :");
        float sub3 = input.nextFloat();
        System.out.print("Mark of 4st subject :");
        float sub4 = input.nextFloat();
        System.out.print("Mark of 5st subject :");
        float sub5 = input.nextFloat();

        total = sub1 + sub2 + sub3 + sub4 + sub5;

        System.out.println("Persentage : " + (total * 100) / 500.0 + "%");
        input.close();
        System.out.println();
    }
}