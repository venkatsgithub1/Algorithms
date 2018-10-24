package learning.algos.quicksort;

public class Quicksort {

	private int partition(int[] arr, int low, int high) {
		// selected last element as a pivot.
		int pivot = arr[high];

		// swap index
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				// swap index + 1
				i++;

				// swap data between i and j
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}

		// at this point moving smaller values to the left is done
		// interchange I + 1 and high values.
		// this step brings pivot to the middle
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		// return the pivot
		return i + 1;
	}

	public void sort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);

			sort(arr, low, pivot - 1);
			sort(arr, pivot + 1, high);
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 7, 8, 9, 1 };

		new Quicksort().sort(arr, 0, arr.length - 1);

		for (int i : arr)
			System.out.println(i);
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
