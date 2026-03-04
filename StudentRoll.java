import java.util.TreeSet;

class StudentRoll {
    public static void main(String[] args) {

        TreeSet<Integer> rolls = new TreeSet<>();

        rolls.add(105);
        rolls.add(101);
        rolls.add(103);
        rolls.add(102);

        System.out.println("Sorted Roll Numbers: " + rolls);
    }
}
