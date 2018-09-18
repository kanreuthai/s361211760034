package lab5;
import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("Jan");
        myList.add("Som");
        myList.add("Ben");
        myList.add("May");
        myList.add("Nan");
        System.out.println(myList);
        myList.add(2,"ji");
        System.out.println(myList);
        myList.remove("May");
        System.out.println(myList);
        System.out.println(myList.indexOf("bows"));
    }
}
