package corejavaexercises;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = new int[] {9,7,34,23,14,67};
		int temp = 0;
		System.out.println("Original array :");
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		for (int i = 0; i <= arr.length; i++) {
		for (int j = i + 1; j < arr.length; j++) {
		if (arr[i] > arr[j]) {
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}

		System.out.println("\n after sorting:");

		for (int i = 0; i < arr.length; i++) {

		System.out.print(arr[i] + " ");
		}
		}
		}


