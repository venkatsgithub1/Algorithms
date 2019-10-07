package learning.algos.algos_using_binary_search;

public class FindingFirstOccurrence {

    private static int search(int[] arr, int numberToFind) {

        int start = 0, end = arr.length - 1;

        int occurrence = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numberToFind == arr[mid]) {
                occurrence = mid + 1;
                end = mid - 1;
            } else if (numberToFind < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return occurrence;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 10, 10, 10, 18, 20};

        int number = 10;

        System.out.println(search(arr, number));
    }
}
