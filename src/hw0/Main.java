package hw0;

public class Main {
    public static void main(String[] args) throws CustomCheckedException {
        CustomHashMap studentList = new CustomHashMap("Sergey", 1, "Dmitriy", 2, "Egor", 3);

        studentList.put("Sergey", 4);

        studentList.put("Dmitriy", 2);

        System.out.println(studentList.get("Egor"));

        System.out.println(studentList);

    }
}