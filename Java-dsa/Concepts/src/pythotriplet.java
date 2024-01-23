import java.util.Scanner;

public class pythotriplet {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Enter the three numbers to check pythogrian triplet");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println(check(a,b,c));

    }

    static String check(int a,int b,int c){
       return (a*a) + (b*b)== c*c ? "true":"false";
    }
}
