package learning.algos.algos_using_binary_search;

public class CountRotationsOfCircularSortedArray {

    private static int search(int[] arr) {
        int low = 0, high = arr.length - 1, n = arr.length;

        while (low <= high) {

            if (arr[low] <= arr[high]) {
                /*
                Since lowest element is smaller than highest element, we can
                return low element index.
                 */
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                /*
                Since middle element is having bigger elements on either sides
                , we can return mid.
                 */
                return mid;
            } else if (arr[mid] <= arr[high]) {
                /*
                If middle element is less than highest element,
                that means right half is sorted and we can ignore
                continue searching in left half
                 */
                high = mid - 1;
            } else if (arr[mid] >= arr[low]) {
                /*
                If middle is greater than least element, that means left half contains
                bigger elements, search in right half
                 */
                low = mid + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11, 12, 15, 18, 2, 5, 6, 8};
        int rotations = search(arr);

        System.out.println("Array is rotated " + rotations + " times");
    }
}
