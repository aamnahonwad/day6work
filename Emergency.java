import java.util.LinkedList;

class Emergency {
    public static void main(String[] args) {

        LinkedList<String> patients = new LinkedList<>();

        patients.add("Patient1");
        patients.add("Patient2");
        patients.add("Patient3");

        patients.addFirst("Emergency Patient");

        System.out.println("Updated Waiting List: " + patients);
    }
}
