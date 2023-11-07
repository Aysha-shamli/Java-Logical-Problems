package Day6;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int reversedNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num / 10;
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }
}
