
import java.util.ArrayList;

class Search {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Aamna");
        students.add("Rahul");
        students.add("Sneha");
        students.add("Arjun");

        if(students.contains("Rahul")) {
            System.out.println("Rahul exists in the list.");
        } else {
            System.out.println("Rahul not found.");
        }
    }
}