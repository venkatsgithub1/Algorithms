package learning.algos.algos_using_binary_search;

public class CountingOccurrence {

    /**
     * @param arr          - array of data
     * @param firstOrLast  - 0 for first, 1 for last
     * @param numberToFind - number to find in the array of data
     * @return - returns first or last occurrence of an integer
     */
    private static int search(int[] arr, Integer firstOrLast, int numberToFind) {
        int occurrence = -1, start = 0, end = arr.length - 1;
        boolean isFirst = false;

        if (firstOrLast == 0) {
            isFirst = true;
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numberToFind == arr[mid]) {
                occurrence = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (numberToFind > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return occurrence;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11};
        int number = 5  ;
        int firstOccurrenceIndex = search(arr, 0, number);
        int lastOccurrenceIndex = search(arr, 1, number);

        System.out.println(number + " has occurred " + (lastOccurrenceIndex - firstOccurrenceIndex + 1) + " time(s)");
    }
}
