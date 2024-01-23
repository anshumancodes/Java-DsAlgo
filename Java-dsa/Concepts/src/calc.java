import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        System.out.println("calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int a = input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();
        System.out.println("enter the operation");
        input.nextLine();
        char operation = input.nextLine().charAt(0);
        int result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;

                break;
            case '*':
                result = a * b;

                break;
            case '/':
                result = a / b;

                break;
            default:
                System.out.println("invalid operation");
        }
        System.out.println("the result is " + result);
    }
}
