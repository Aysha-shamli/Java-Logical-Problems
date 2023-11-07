package Day6;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of fibonacci series: ");
        int limit= sc.nextInt();
        int a =0;
        int b =1;

        System.out.print("fibonacci series is :");
        for(int i = 1;i <= limit; ++i ){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
