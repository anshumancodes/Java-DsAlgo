public class searchinstring {

	public static boolean searchstring(String str, char target){
		if (str.length()==0){
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (target==str.charAt(i)){
				System.out.println("Char at index "+i);
				return true;


			}

		}
		return false;
	}
	public static void main(String[] args) {
		String name="Anshuman";
		char target='u';
		System.out.println(searchstring(name,target));

	}
}
