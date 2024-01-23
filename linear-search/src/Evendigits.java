public class Evendigits {


	public static void checkforeven(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0){
				System.out.println(arr[i]);
			}
		}


	};

	public static void main(String[] args) {
		int [] arr={1,2,4,5,16,34,12,6,8,19};
		checkforeven(arr);
	}


}
