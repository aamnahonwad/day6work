import java.util.LinkedList;

class BusStopQueue {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.addFirst("Rahul");
        queue.addLast("Aamna");
        queue.addLast("Sneha");
        queue.addFirst("Arjun");

        System.out.println("Bus Stop Queue: " + queue);
    }
}