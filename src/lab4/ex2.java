package lab4;

import java.util.Scanner;

public class ex2 {
    public static void main (String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer 1:");
        x = scanner.nextInt();
        System.out.print("Enter integer 2:" );
        y = scanner.nextInt();
        if (x > y) {
            System.out.print(x + "มากกว่า" + y);
        }else {
            System.out.print(y + "มากกว่า" + x);
        }
    }//main
}//class
