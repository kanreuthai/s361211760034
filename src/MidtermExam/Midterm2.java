package MidtermExam;
import java.util.ArrayList;
import java.util.Scanner;

public class Midterm2 {

 public static void main(String[] args) {
     int select;
     System.out.println("เลือกผลการเรียนวิชาการเขียนโปรแกรมคอมพิวเตอร์?");
     System.out.println("1.คะแนนสอบย่อย 20 คะแนน ");
     System.out.println("2.คะแนนปฏิบัติ 20 คะแนน ");
     System.out.println("3.คะแนนสอบกลางภาค 30 คะแนน");
     System.out.println("4.คะแนนสอบปลายภาค 30 คะแนน ");

     Scanner scan = new Scanner(System.in);
     ArrayList<Double> list = new ArrayList<Double>();

     int i = 1;
     while(i <= 4)
     {
         System.out.printf("กรุณากรอกคะแนน %d : ", i);
         list.add(scan.nextDouble());
         i++;
     }
     scan.close();

     Double sum = list.stream().mapToDouble(Double::doubleValue).sum();
     System.out.printf("\r\nคะแนนรวมทั้งหมด คือ  %.2f", sum);


     }//main
}//class

