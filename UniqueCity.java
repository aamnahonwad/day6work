import java.util.HashSet;

class UniqueCity {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Hyderabad");

        System.out.println("Unique Cities: " + cities);
    }
}
