package lab7;

public class StudentApp {
    public static void main(String[] args) {
    Student std = new Student("jan",
            "034",
    "jansaichi@gmail.com",
            "0986740283",
            21);

   System.out.println(std.toString());

    std.setName("kanreuthai");
    System.out.println(std.toString());
    }

}//class
