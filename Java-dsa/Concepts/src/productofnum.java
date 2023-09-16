import java.util.Scanner;

public class productofnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter two numbers");
        int i=in.nextInt();
        int e=in.nextInt();

        int product=product(i,e);
        System.out.println("product of numbers is "+product);

    }

    static int product(int a , int b){
        return a*b;
    }
}
