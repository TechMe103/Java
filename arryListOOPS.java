import java.util.ArrayList;

public class arryListOOPS {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.set(1, 20));
    }
}
