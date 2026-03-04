import java.util.TreeSet;

class Tree {
    public static void main(String[] args){
        TreeSet<String> names=new TreeSet<String>();
        names.add("Aamna");
        names.add("F");
        names.add("Honwad");
        names.add("Aamna");// duplicate entry will be discarded and ignored 
        System.out.println(names);
        System.out.println(names.contains("Honwad"));
        names.remove("F");
        System.out.println(names);
        System.out.println(names.size());
        names.clear();
        System.out.println(names);
    }
}
