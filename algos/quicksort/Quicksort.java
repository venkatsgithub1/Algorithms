package learning.algos.quicksort;

import java.util.Arrays;

public class Quicksort {

    private int partition(int[] arr, int low, int high) {
        // selected last element as a pivot.
        int pivot = arr[high];

        // swap index
        int partitionIndex = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {

                // swap data between i and j
                int temp = arr[j];
                arr[j] = arr[partitionIndex];
                arr[partitionIndex] = temp;

                // swap index + 1
                partitionIndex++;
            }
        }

        // at this point moving smaller values to the left is done
        // interchange I + 1 and high values.
        // this step brings pivot to the middle
        int temp = arr[partitionIndex];
        arr[partitionIndex] = arr[high];
        arr[high] = temp;

        // return the pivot
        return partitionIndex;
    }

    private void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{10, 7, 8, 9, 1};

        new Quicksort().sort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(System.out::println);
    }

}

/*
Output:
1
7
8
9
10
*/
