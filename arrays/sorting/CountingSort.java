package arrays.sorting;

public class CountingSort {
    public int [] arr = new int [] {5, 4, 3, 2, 1};

    public int [] sort () {
        int [] freq = new int [101];
        int [] res = new int [arr.length];
        
        for (int val: arr) freq[val]++;

        for (int i=1; i<freq.length; i++) 
            freq[i] += freq[i-1];

        for (int i=0; i<arr.length; i++)
            res[freq[arr[i]]-1] = arr[i];

        return res;
    }

    public static void printArr(int [] array) {
        for (int val: array) {
            System.out.print(val + " ");
        }
        System.out.print("\n");
    }

    public static void main (String [] args) {
        SelectionSort obj = new SelectionSort();
        printArr(obj.arr);
        obj.sort();
        printArr(obj.arr);

    }
}
