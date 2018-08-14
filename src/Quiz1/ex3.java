package Quiz1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testScore ;
        //do-while
        do {
            System.out.print(" เลือกประเภทของห้อง? ");

            System.out.println("1.Room Type 1  ");
            System.out.println("2.Room Type 2 ");
            System.out.println("3.Room Type 3  ");
            System.out.println("4.Room Type 4 ");

            testScore = input.nextInt();
        }while (testScore<1 || testScore>4);

        int select;


        System.out.print("เลือกประเภทห้องพัก(1-4):");
        select = input.nextInt();
        //switch-case

            System.out.println("จำนวนวันที่เข้าพัก");

            System.out.println("ค่าห้องที่ต้องจ่าย");



    }//main
}//class



