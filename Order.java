import java.util.ArrayList;
class Order {
    public static void main(String[] args){
        ArrayList<String> o=new ArrayList<>();
        o.add("order101");
        o.add("order102");
        o.add("order103");
        o.add("order104");
        System.out.println(o);
        System.out.println("The removed order is " + (o.remove(1)));
    }
}
