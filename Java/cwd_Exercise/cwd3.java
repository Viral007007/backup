//chapter 1 ; prectice set 1 ; question 2 ; CGPA of three subject
/*
    CGPA = precentage of the subject / 9.5
*/

import java.util.Scanner;

public class cwd3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float m1,m2,m3,percentage,CGPA;

        System.out.print("Enter the mark of first subject : ");
        m1 = input.nextFloat();
        System.out.print("Enter the mark of second subject : ");
        m2 = input.nextFloat();
        System.out.print("Enter the mark of third subject : ");
        m3 = input.nextFloat();

        percentage = (m1+m2+m3)/3;
        System.out.println(percentage);

        CGPA = (percentage)/9.5f;

        System.out.printf("The CGPA of three subject is %f",CGPA);


        input.close();
    }
}
