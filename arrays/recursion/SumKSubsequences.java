package arrays.recursion;

import java.util.ArrayList;

public class SumKSubsequences {
    public static void printSubsequences(int [] arr, ArrayList<Integer> res, int sum, int idx, int k) {
        if (idx == arr.length) {
            if (sum == k) {
                System.out.print("{");
                for (int num: res) 
                    System.out.print(num + " ");
                System.out.println("}");
            }
            return;
        }
        res.add(arr[idx]);
        printSubsequences(arr, res, sum+arr[idx], idx+1, k);
        
        res.remove(res.size()-1);
        printSubsequences(arr, res, sum, idx+1, k);
    }

    public static boolean printOneSubsequence(int [] arr, ArrayList<Integer> res, int sum, int idx, int k) {
        if (idx == arr.length) {
            if (sum == k) {
                System.out.print("{");
                for (int num: res) 
                    System.out.print(num + " ");
                System.out.println("}");
                return true;
            }
            return false;
        }
        res.add(arr[idx]);
        if (printOneSubsequence(arr, res, sum+arr[idx], idx+1, k))
            return true;
        
        res.remove(res.size()-1);
        if (printOneSubsequence(arr, res, sum, idx+1, k))
            return true;

        return false;
    }

    public static int totalSubsequences(int [] arr, int sum, int idx, int k) {
        if (idx == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        return totalSubsequences(arr, sum+arr[idx], idx+1, k) + totalSubsequences(arr, sum, idx+1, k);

    }

    public static void main (String [] args) {
        int [] arr = {4, 1, 2, 1};
        // printSubsequences(arr, new ArrayList<Integer>(), 0, 0, 2);
        // printOneSubsequence(arr, new ArrayList<Integer>(), 0, 0, 2);
        System.out.println("Total number of subsequences whose sum is 2 is: " + totalSubsequences(arr, 0, 0, 2));
    }
}
