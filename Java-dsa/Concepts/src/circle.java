import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter radius of circle");
        float r=in.nextFloat();
       float c= cirumference(r);
        System.out.println("cirumference of circle is "+c);

        float a=area(r);
        System.out.println("area of circle is "+a);

    }
    static float cirumference(float r){
        return 2* 3.14f*r;
    }
    static float area(float r){
        return 3.14f*r*r;
    }
}
