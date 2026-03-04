import java.util.ArrayList;
class Average {
    public static void main(String[] args){
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(96);
        marks.add(58);
        marks.add(32);
        marks.add(67);
        marks.add(85);

        int sum=0;
        for(int mark : marks){
            System.out.println(mark);
            sum=sum+mark;
        }

        double average=(double)sum/marks.size();
        System.out.println("Average Mark: " + average);
       
    }
}
