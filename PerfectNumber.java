package Day6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int abs = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                abs += i;
            }
        }
        if (abs == num) {
            System.out.println("The Number is a perfect number");
        } else {
            System.out.println("The Number is not a perfect number");
        }
    }
}
