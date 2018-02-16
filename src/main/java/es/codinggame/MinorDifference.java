package es.codinggame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinorDifference {


    public static void main(String args[]) {
        int N = 3;
        int[] myIntArray = {5,8,9};
        List<Integer> list = new ArrayList();
        for (int i = 0; i < N; i++) {
            int pi = myIntArray[i];
            if(list.contains(pi)) {
                System.out.println(0);
                break;
            } else {
                list.add(pi);
                Collections.sort(list);
            }
        }
    }
}
