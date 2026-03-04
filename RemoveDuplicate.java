import java.util.HashSet;

class RemoveDuplicate {
    public static void main(String[] args) {

        HashSet<Integer> ids = new HashSet<>();

        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(101);
        ids.add(104);
        ids.add(102);

        System.out.println("Unique Student IDs: " + ids);
    }
}