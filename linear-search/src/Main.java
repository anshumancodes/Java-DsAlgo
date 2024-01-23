// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static int linearsearch(int arr[], int target){

		if (arr.length==0){
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {

			int element=arr[index];

			if (target==element){
				return  index;
			}

		}

		return -1;

	}
	public static void main(String[] args) {

		int[] myIntArray = {8, 15, 23, 42, 56, 72, 89};
		System.out.println(linearsearch(myIntArray,15 ));

	}
}
