public class occurance {
    public static void main(String[] args) {
        int num=1334567567;
        int count=0;

        while (num>0){
            int rem=num%10;

            if (rem==3){
                count++;
            }
            num/=10; //num=num/10

        }
        System.out.println("Num of times "+ num + " occured is "+count);
    }
}
