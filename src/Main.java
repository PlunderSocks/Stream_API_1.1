import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intlist = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filterList = new ArrayList<>();

        for(int item : intlist) {
            if (item > 0 && item % 2 == 0) {
                filterList.add(item);
            }
        }

        Collections.sort(filterList);
        for (int item : filterList) {
            System.out.println(item);
        }
    }
}
