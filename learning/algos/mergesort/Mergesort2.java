package learning.algos.mergesort;

public class Mergesort2 {

	private void merge(int[] arr, int left, int mid, int right) {
		// create two length variables.
		int leftLen = mid - left + 1;
		int rightLen = right - mid;

		// create two arrays to hold data in left and right of the array.
		int leftArr[] = new int[leftLen];
		int rightArr[] = new int[rightLen];

		// copy data into the arrays.
		for (int i = 0; i < leftLen; i++)
			leftArr[i] = arr[left + i];
		for (int j = 0; j < rightLen; j++)
			rightArr[j] = arr[mid + 1 + j];

		// initial indexes of two temp arrays as i and j
		int i = 0, j = 0;

		// first index of merged array.
		int k = left;

		while (i < leftLen && j < rightLen) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		// copy remaining elements to original array.
		while (i < leftLen) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		// copy original elements to original array.
		while (j < rightLen) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public void mergesort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergesort(arr, left, mid);
			mergesort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 7, 1, 2, 9 };

		new Mergesort2().mergesort(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.println(i);
		}
	}

}

/*
Output:
1
2
7
8
9
*/
