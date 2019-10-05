package learning.algos.mergesort;

public class Mergesort {
	private void merge(int[] arr, int start, int mid, int end) {
		int []temp = new int[end-start+1];
		int i=start,j=mid+1,k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<=arr[j]) {
				temp[k]=arr[i];
				i++;
			} else {
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			temp[k]=arr[i];
			k++;
			i++;
		}
		
		while(j<=end) {
			temp[k]=arr[j];
			k++;
			j++;
		}
		
		for(int a=start;a<=end;a++) {
			arr[a]=temp[a-start];
		}
	}
	
	private void mergeSort(int[] arr, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {8,7,2,1,9};
		new Mergesort().mergeSort(arr, 0, arr.length-1);
		for(int i:arr) {
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
