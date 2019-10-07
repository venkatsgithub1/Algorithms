package learning.algos.binarySearch;

public class BinarySearchRecursive {

    private static int search(int[] arr, int numberToFind, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (numberToFind == arr[start]) {
            return start + 1;
        } else if (numberToFind == arr[end]) {
            return end + 1;
        } else if (numberToFind == arr[mid]) {
            return mid + 1;
        } else if (numberToFind < arr[mid]) {
            return search(arr, numberToFind, start, mid - 1);
        } else {
            return search(arr, numberToFind, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 8, 10, 11};

        int number = 20;

        System.out.println(number + " is present at position " + search(arr, number, 0, arr.length - 1) + " in the array");
    }
}
