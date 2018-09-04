package MidtermExam;

import java.util.Scanner;

public class Midterm3{
    public static void main(String[] args) {
        String c,h;
        int  a;
        double w;

        Scanner scanner =new Scanner(System.in);
            int Teachinghours;
            System.out.print("กรุณากรอกชื่ออาจารย์:");
        c = scanner.nextLine();
        System.out.print("กรุณากรอกชื่อคณะ:");
        w = scanner.nextDouble();
        System.out.print("กรุณากรอกเงินเดือน:");
        h = scanner.nextLine();
        System.out.print("กรุณากรอกชั่วโมงการสอน: ");
        a = scanner.nextInt();
        Teachinghours = scanner.nextInt();

            if (Teachinghours<12) System.out.println("ไม่ได้รับโบนัส.");
            else if (Teachinghours<=16)System.out.println("ได้รับโบนัส 5% ของเงินเดือน.");
            else if (Teachinghours<=20)System.out.println("ได้รับโบนัส 10% ของเงินเดือน.");
            else if (Teachinghours>21)System.out.println("ได้รับโบนัส 15% ของเงินเดือน.");
            else System.out.println("กรุณากรอกข้อมูลให้ถูกต้อง");

        }//main
    }//class

