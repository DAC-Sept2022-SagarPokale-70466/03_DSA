package _02_Count_Digit;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter the Digits you want to Count No Of Digits : ");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int count = 0;
		while(digit > 0) {
			digit/=10;
			count++;
		}
		System.out.println("Count = "+count);
		sc.close();
	}

}
