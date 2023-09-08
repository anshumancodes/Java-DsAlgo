import java.util.Scanner;

public class fibon {
    public static void main(String[] args) {
        System.out.println("fibonaci series");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int a = 0;
        int b = 1;

        while(b<n){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
