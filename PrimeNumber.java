package Day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        if (num<= 1){
            isPrime = false;
        }

        for (int i=2;i<num;i++){
            if (num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("The number is Prime Number");
        }else{
            System.out.println("The number is non Prime Number");
        }
    }
}
