package day4;

import java.util.*;
public class GuessMyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter secret number:");
		int N = sc.nextInt();
		System.out.println("guess:");
		int g = sc.nextInt();
		int count = 0;
		while(N!=g) {
			if(g<1 || g>100) {
				System.out.println("invalid");
				g = sc.nextInt();
			}
			else {
				if(g>N) {
					System.out.println("go down");
					count ++;
				}
				else if(g<N) {
					System.out.println("go up");
					count ++;
				}
				System.out.println("guess:");
				g = sc.nextInt();
			}
		}
		System.out.println("correct!");
		count ++;
		System.out.println(count);
	}
}
