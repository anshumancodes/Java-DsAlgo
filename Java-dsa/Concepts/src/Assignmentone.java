import java.util.Scanner;

public class Assignmentone {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user
//
//        Scanner user_input = new Scanner(System.in);
//
//        System.out.println("enter a number");
//
//        int num = user_input.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println("number is even");
//        } else {
//            System.out.println("number is odd");
//
//
//        }


        //Take name as input and print a greeting message for that particular name.

//        System.out.println("enter your name");
//        Scanner user_input = new Scanner(System.in);
//
//        String name = user_input.nextLine();
//
//        System.out.println("welcome to assigment one " + name);



       //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        System.out.println("enter principal");
        Scanner principal = new Scanner(System.in);
        int p = principal.nextInt();

        System.out.println("enter time");
        Scanner time = new Scanner(System.in);
        int t = time.nextInt();

        System.out.println("enter rate");
        Scanner rate = new Scanner(System.in);
        int r = rate.nextInt();

        int simpleInterest = (p * t * r) / 100;

        System.out.println("simple interest is " + simpleInterest);


    }
}
