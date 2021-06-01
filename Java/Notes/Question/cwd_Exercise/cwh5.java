//chapter 1 ; prectice set 1 ; question 4 ; convert Km to m

import java.util.Scanner;

public class cwh5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float km,m;
        System.out.print("Enter the kilometer :");
        km = input.nextFloat();

        m = km * 1000.0f;

        System.out.printf(" %f km = %f m ",km,m);

        input.close();

    }
}
