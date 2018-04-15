package es.streams;

import java.util.ArrayList;
import java.util.List;

public class MapToInt {

    public static void main(String[] args) {
        oddNumbers(0,10);
    }


    static int[] oddNumbers(int l, int r) {
        List<Integer> list = new ArrayList();
        for (int n = l; n <= r; n++) {
            if (n % 2 != 0) {
                list.add(n);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
