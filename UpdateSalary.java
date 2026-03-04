import java.util.ArrayList;

class UpdateSalary {
    public static void main(String[] args) {

        ArrayList<Double> salaries = new ArrayList<>();

        salaries.add(25000.0);
        salaries.add(30000.0);
        salaries.add(28000.0);
        salaries.add(32000.0);

        System.out.println("Before Update: " + salaries);

        salaries.set(2, 35000.0);

        System.out.println("After Update: " + salaries);
    }
}