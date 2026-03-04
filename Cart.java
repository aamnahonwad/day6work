import java.util.ArrayList;
class Cart {
    public static void main(String[] args){
        ArrayList<String> p=new ArrayList<>();
        p.add("Laptop");
        p.add("Mouse");
        p.add("Keyboard");
        p.add("Monitor");
        p.add("Headphones");
        for(String product:p){
            System.out.println(product);
        }
    }
}
