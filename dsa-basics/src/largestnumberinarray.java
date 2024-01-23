import java.util.Arrays;

public class largestnumberinarray {

	static void largest(int arr[]){
		int largest=arr[0];
		for (int i=0;i<arr.length;i++){
			if (i>largest){
				largest=arr[i];
			}

		}
		System.out.println(largest);
	}
	public static void main(String[] args) {
		int arr[]={1,78,899,23,0,12,3};

		largest(arr);
	}
}
