import java.util.LinkedList;

class TaskRemove {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Wake Up");
        tasks.add("Study");
        tasks.add("Practice Coding");
        tasks.add("Sleep");

        System.out.println("Before Removing: " + tasks);

        tasks.removeLast();

        System.out.println("After Removing Last Task: " + tasks);
    }
}
