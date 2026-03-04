import java.util.ArrayList;

class Array{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add(2,"aamna");
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(3,"David");
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}