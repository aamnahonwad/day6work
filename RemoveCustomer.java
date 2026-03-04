import java.util.LinkedList;
class RemoveCustomer {
    public static void main(String[] args){
        LinkedList<String> customers=new LinkedList<>();

        customers.add("customer 1");
        customers.add("customer 2");
        customers.add("customer 3");
        customers.add("customer 4");

        System.out.println(customers);

        customers.removeFirst();

        System.out.println(customers);
    }
}



