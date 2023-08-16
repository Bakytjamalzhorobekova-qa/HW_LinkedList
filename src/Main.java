import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Number>  arrayList = new ArrayList<>();
        LinkedList<Number> linkedList = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arrayList.add(random.nextInt(2));
            arrayList.sort(sortArrayNum);
            System.out.println(arrayList.get(i));
        }



        System.out.println("=====================");
        for (int i = 0; i < 7; i++) {
            linkedList.add(random.nextInt(2));
            linkedList.sort(sortLinkedNum);
            System.out.println(linkedList.get(i));

        }
    }
    static Comparator<Number> sortArrayNum = new Comparator<Number>() {
        @Override
        public int compare(Number o1, Number o2) {
            return o1.intValue() - o2.intValue();
        }
    };
    static Comparator<Number> sortLinkedNum = new Comparator<Number>() {
        @Override
        public int compare(Number o1, Number o2) {
            return o1.intValue()-o2.intValue();
        }
    };



}



