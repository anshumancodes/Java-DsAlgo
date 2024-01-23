import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        String  value=check();
        System.out.println(value);

    }

    static String  check(){
        Scanner in=new Scanner(System.in);

        System.out.println("enter a number");

        int a = in.nextInt();

        if (a%2==0){
            return "even";
        }
        else{
            return "odd";
        }




    }
}
