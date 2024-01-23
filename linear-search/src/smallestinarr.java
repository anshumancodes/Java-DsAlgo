public class smallestinarr {
	static int smallest(int arr[]) {
		if (arr.length == 0) {
			return -1;  // Return on empty arr
		}

		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		return smallest;
	}

	public static void main(String[] args) {
		int[] arr = {999, 89, 69, 87, 420, 12, 2, 6, 78888, 11};
		System.out.println(smallest(arr));
	}
}

