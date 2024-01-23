import java.util.Scanner;

public class methodsinjava {
    public static void main(String[] args) {

        check();


    }

//            assigment questions
//
//            Define two methods to print the maximum and the
//        minimum number respectively among three numbers entered by the user.
    static void check() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter three numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("maximum number is "+max);
        System.out.println("minimum number is "+min);



    }
}
