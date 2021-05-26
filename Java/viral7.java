//user input in java

import java.util.Scanner;

public class viral7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //String inout
        //1)
        System.out.print("string : ");
        String x1 = input.next();
        //2)
        System.out.print("string : ");
        String x2 = input.nextLine();
        
        //byte input
        System.out.print("byte : ");
        byte x3 = input.nextByte();
        
        //short input
        System.out.print("short : ");
        short x4 = input.nextShort();
        
        //int input
        System.out.print("int : ");
        int x5 = input.nextInt();
        
        //long input
        System.out.print("long : ");
        long x6 = input.nextLong();
        
        //float input
        System.out.print("float : ");
        float x7 = input.nextFloat();
        
        //double input
        System.out.print("double : ");
        double x8 = input.nextDouble();
        
        //boolean 
        System.out.print("boolean : ");
        boolean x9 = input.nextBoolean();
        
        //char
        System.out.print("char : ");
        char x10 = input.next().charAt(0);

        input.close();
    }
}
