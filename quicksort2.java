import java.util.*;

public class Solution {
	static int pivot = 0;
	static int pindex = 0;
	static int temp = 0;
	static int temp2 = 0;

	static int partition(int[] ar, int start, int end) {
		pivot = ar[end];
		pindex = start;
		for (int i = start; i < end; i++) {
			if (ar[i] <= pivot) {
				temp = ar[i];
				ar[i] = ar[pindex];
				ar[pindex] = temp;
				pindex = pindex + 1;
			}
		}
		temp2 = ar[end];
		ar[end] = ar[pindex];
		ar[pindex] = temp2;

		return pindex;
	}

	static void quickSort(int[] ar, int start, int end) {

		if (start < end) {
			pindex = partition(ar, start, end);
			quickSort(ar, start, pindex - 1);
			quickSort(ar, pindex + 1, end);
		}
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar, 0, ar.length - 1);
		printArray(ar);
	}
}
