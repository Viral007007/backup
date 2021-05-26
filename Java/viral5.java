// input name and print name

import java.util.*;

public class viral5 {
    public static void main(String[] args) {

        System.out.print("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); 
        System.out.printf("hello %s", name);
        sc.close();

    }
}
