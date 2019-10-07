package learning.algos.binarySearch;

public class BinarySearch {
    private static int search(int[] arr, int numberToFind) {
        int start = 0, end = arr.length - 1;

        if (numberToFind > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[start] == numberToFind) {
                return start + 1;
            } else if (arr[end] == numberToFind) {
                return end + 1;
            } else if (numberToFind == arr[mid]) {
                return mid + 1;
            } else if (numberToFind < arr[mid]) {
                end = mid - 1;
            } else if (numberToFind > arr[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 6, 8, 10, 11};

        int number = 9;

        System.out.println(number + " is present at position " + search(arr, number) + " in the array");
    }
}
