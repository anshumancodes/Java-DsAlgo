public class smallestin2darr {

//	lets assume this looks like this

//	{ 1 , 2 ,   3 ,
//	  5,  4,    7 }

	static int findsmallest(int arr[][]){
		if (arr.length==0){
			return -1;
		}
		int smalllest=arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]<smalllest){
					smalllest=arr[i][j];
				}

			}


		}
		return smalllest;
	}

	public static void main(String[] args) {
		int[][] arr2D = {
			{1, 2, 3},
			{5, 0, 7}
		};
		System.out.println(findsmallest(arr2D));

	}

}
