import java.util.LinkedHashSet;

class Hash {
    
    public static void main(String[] args){
        LinkedHashSet<String> names=new LinkedHashSet<String>();
        names.add("Aamna");
        names.add("F");
        names.add("Honwad");
        names.add("Aamna");
        names.add("tce");
        names.add("gadag");
        System.out.println(names);
        System.out.println(names.contains("Honwad"));
        names.remove("F");
        System.out.println(names);
        System.out.println(names.size());
        names.clear();
        System.out.println(names);
    }
}

