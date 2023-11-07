package Day6;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Coupons: ");
        int num = sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num; ++i) {
            array[i] = (int) (Math.random() * 1000);
            for(int j = i;j < i; j--){
                if(array[i]==array[j]){
                    array[i] = (int) (Math.random() * 1000);
                }
            }
        }

        System.out.println("Generated Coupon Numbers:");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

