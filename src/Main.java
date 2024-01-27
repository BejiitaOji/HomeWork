import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap studentList = new CustomHashMap(10);
        try {
            studentList.put("Oleg", 1);
        } catch(CustomException e) {
            System.out.println("catched exception");
        }
        try {
            studentList.put("Oleg", 3);
        } catch(CustomException e) {
            System.out.println("catched exception");
        }
        try {
            studentList.put("Ivan", 4);
        } catch(CustomException e) {
            System.out.println("catched exception");
        }
        try {
            studentList.put("Sergey", 5);
        } catch (CustomException e) {
            System.out.println("cathced exception");
        }
        System.out.println(studentList);
        System.out.println(studentList.get("Ivan"));

    }
}