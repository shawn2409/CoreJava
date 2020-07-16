package copy;

public class CopyArray {

	public static void main(String[] args) {

		// Initialize array
		int[] arr1 = { 1, 2, 3, 4, 5 };

		int arr2[] = new int[arr1.length];

		int[] arr3 = arr1.clone();

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}

	}
}