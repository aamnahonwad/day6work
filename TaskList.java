import java.util.LinkedList;

class TaskList {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Wake Up");
        tasks.add("Study Java");
        tasks.add("Complete Assignment");
        tasks.add("Go to Gym");

        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());
    }
}
