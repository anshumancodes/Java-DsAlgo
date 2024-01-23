import java.util.Scanner;

public class checkgrade {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter marks");
        int marks=in.nextInt();
        String grade=check(marks);
        System.out.println(grade);
    }

    static String check(int marks){
        switch (marks/10){
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}
