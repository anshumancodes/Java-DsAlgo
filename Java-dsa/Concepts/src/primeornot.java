import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int n=in.nextInt();
        boolean b=primeornot(n);
        System.out.println(b);


    }
    static boolean primeornot(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;






    }


}
