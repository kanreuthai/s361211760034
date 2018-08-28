package Quiz1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int select;
        System.out.println("เลือกประห้องพัก?");
        System.out.println("Room Type 1 ");
        System.out.println("Room Type 2 ");
        System.out.println("Room Type 3 ");
        System.out.println("Room Type 4 ");


        Scanner input = new Scanner(System.in);
        System.out.print("เลือกประเภทห้องพัก(1-4):");
        select = input.nextInt();
        //switch-case

        System.out.println("จำนวนวันที่เข้าพัก");
        select = input.nextInt();
        //switch-case

        System.out.println("ค่าห้องที่ต้องจ่าย");



        switch (select){


        }//switch-case
    }//main
}//class



