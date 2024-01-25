// simple binary search algorithm
public class Main {
	static int doBinarySearch(int arr[],int target){


		int left = 0;
		int right = arr.length - 1;

		while(right>=left){
			int middleindex=left+(right-left/2);
			int middleelement=arr[middleindex];

			if (middleelement==target){
				return middleindex;
			}
			else if (target>middleelement){
				left=middleindex+1;



			} else if (middleelement>target) {
				right=middleindex-1;


			}

		}
		return -1; // Target not found



	}
	public static void main(String[] args) {
		int [] SampleArr={1,2,6,7,12,17,19,21,36,78};
		int target=19;

		int result=doBinarySearch(SampleArr,target);
		if (result != -1) {
			System.out.println("Target found at index: " + result);
		} else {
			System.out.println("Target not found in the array.");
		}

	}
}
