import java.util.HashSet;
class Set {
     public static void main(String[] args){
        HashSet<String> names=new HashSet<String>();
        names.add("Aamna");
        names.add("F");
        names.add("Honwad");
        names.add("tontadarya");
        names.add("college");
        names.add("engineering");
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
