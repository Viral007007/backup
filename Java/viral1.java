// sum of two number

import java.util.Scanner;

class viral1 {
        public static void main(String[] args) {
                System.out.println();

                Scanner input = new Scanner(System.in);

                System.out.print("Enter number A :");
                String var1 = input.nextLine(); // Read user input
                int i = Integer.parseInt(var1);
                System.out.print("Enter number B :");
                String var2 = input.nextLine(); // Read user input
                int j = Integer.parseInt(var2);
                System.out.println("A + B = " + (i + j)); // Output user input
                // System.out.println("my name is viral gajera");
                System.out.println();
                input.close();
        }
}
