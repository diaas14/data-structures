package arrays.sorting;

public class SelectionSort {

    int [] arr = new int [] {5, 4, 3, 2, 1};

    public void sort () {
        for (int i=0; i<arr.length - 1; i++) {
            int min = i;
            int j=i+1;
            for (; j<arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min != i) {
                arr[i] = arr[i] + arr[min];
                arr[min] = arr[i] - arr[min];
                arr[i] = arr[i] - arr[min];
            }
        }
    }

    public void print() {
        for (int val: arr) {
            System.out.print(val + " ");
        }
        System.out.print("\n");
    }

    public static void main (String [] args) {
        SelectionSort obj = new SelectionSort();
        obj.print();
        obj.sort();
        obj.print();

    }
}
