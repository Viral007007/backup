//chapter 1 ; prectice set 1 ; question 3 ; input name and greet them

import java.util.Scanner;

public class cwh4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        System.out.print("Enter your name : ");
        name = input.nextLine();

        System.out.println("Hello " + name + "!! have a nice day");

        input.close();
    }
}
