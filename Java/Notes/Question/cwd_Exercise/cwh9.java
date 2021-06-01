
// practice set 2 ; Question 3 : wap to findout whether a given number is greater than the user entered number or not

import java.util.Scanner;

public class cwh9 {
    public static void main(String[] args) {
        float program_number = 17;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        float Entered_number = input.nextFloat();

        if(Entered_number > program_number){
            System.out.println("Entered number is greated than number assumed by program");
        }

        else if(Entered_number < program_number){
            System.out.println("the number assumed by program is greater than entered number");
        }

    }
}
