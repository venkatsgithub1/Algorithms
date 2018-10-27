package learning.algos.quicksort;

public class QuicksortVariedPivots {

	private int partition(int[] arr, int low, int high, String pivotType) {
		// selected last element as a pivot.
		int pivot = arr[high];
		if (pivotType.equalsIgnoreCase("left")) {
			pivot = arr[low];
			swap(arr, low, high);
		} else if (pivotType.equalsIgnoreCase("middle")) {
			int pivot_position = (low + high) / 2;
			pivot = arr[pivot_position];
			swap(arr, pivot_position, high);
		}

		// swap index
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				// swap index + 1
				i++;

				// swap data between i and j
				swap(arr, i, j);
			}
		}

		// at this point moving smaller values to the left is done
		// interchange I + 1 and high values.
		// this step brings pivot to the middle
		swap(arr, i + 1, high);

		// return the pivot
		return i + 1;
	}

	public void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public void sort(int[] arr, int low, int high, String pivotType) {
		if (low < high) {
			int pivot = partition(arr, low, high, pivotType);

			sort(arr, low, pivot - 1, pivotType);
			sort(arr, pivot + 1, high, pivotType);
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 7, 8, 9, 1 };

		new Quicksort().sort(arr, 0, arr.length - 1, "left");

		for (int i : arr)
			System.out.println(i);
	}

}
