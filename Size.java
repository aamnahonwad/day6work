import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Size {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        int[] numbers = {10, 20, 30, 20, 40, 10};

        for(int num : numbers) {
            hashSet.add(num);
            linkedHashSet.add(num);
            treeSet.add(num);
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

        System.out.println("HashSet Size: " + hashSet.size());
        System.out.println("LinkedHashSet Size: " + linkedHashSet.size());
        System.out.println("TreeSet Size: " + treeSet.size());
    }
}

       