package arrays.recursion;

import java.util.ArrayList;

public class PrintSubsequence {

    public static void showSubsequences(int [] arr, int len, ArrayList<Integer> res, int idx) {
        if (idx >= len) {
            System.out.print("{");
            for (int num: res) 
                System.out.print(num + " ");
            System.out.println("}");

            return;
        }

        res.add(arr[idx]);
        showSubsequences(arr, len, res, idx+1);

        res.remove(res.size() - 1);
        showSubsequences(arr, len, res, idx+1);
    }

    public static void main (String [] args) {
        int [] arr = {4, 3, 2, 1};
        showSubsequences(arr, arr.length, new ArrayList<Integer>(), 0);
    }

}
