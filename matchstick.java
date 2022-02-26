package day3;

import java.util.*;
public class matchstick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//beginning set up code
		System.out.println("Enter the number of matches:");
		int total = sc.nextInt();
		System.out.println("Enter draw value 1 for draw, 0 for not draw:");
		int draw = sc.nextInt();
		
		//variables initialized
		int count = 0;
		int player = 1;
		int m = 0;
		int num = total;
		
		//game code without drawn matchsticks
		if(draw == 0) {
			System.out.println("Number of remaining matches: " + total);
			System.out.println("Player "+ (player) + ": How many matches do you want to pick? (1,2 or 3)");
			m = sc.nextInt();
			while(total > 0) {
					if(m>3 || m<1 || (total - m) < 0) {
						System.out.println("Invalid move!");
						System.out.println("You can pick 1, 2 or 3 matches.");
						System.out.println("Number of remaining matches: " + total);
						System.out.println("Player "+ (player) + ": How many matches do you want to pick? (1,2 or 3)");
						m = sc.nextInt();
					}
					else {
						total = total - m;
						if(total == 0) {
							break;
						}
						if(count % 2 == 0) {
							player = 2;
						}
						else if(count % 2 == 1) {
							player = 1;
						}
						count++;
						System.out.println("Number of remaining matches: " + total);
						System.out.println("Player "+ (player) + ": How many matches do you want to pick? (1,2 or 3)");
						m = sc.nextInt();
					}
			}
			System.out.println("Player " + (player) + " won the game!");
		}
		
		//game code with matchsticks
		if(draw == 1) {
			System.out.println("Number of remaining matches: " + total);
			//code for printing matchsticks
			for(int k=1 ; k<=num ; k++) {
				System.out.print("* ");
			}
			System.out.println();
			
			for(int i=1 ; i<=num ; i++) {
				System.out.print("| ");
			}
			System.out.println();
			
			for(int z=1 ; z<=num ; z++) {
				System.out.print("| ");
			}
			System.out.println();
			
			for(int g=1 ; g<=num ; g++) {
				System.out.print("| ");
			}
			System.out.println();
			
			for(int l=1 ; l<=num ; l++) {
				System.out.print("| ");
			}
			System.out.println();
			System.out.println("Player "+ (player) + ": How many matches do you want to pick? (1,2 or 3)");
			m = sc.nextInt();
			while(total > 0) {
					if(m>3 || m<1 || (total - m) < 0) {
						System.out.println("Invalid move!");
						System.out.println("You can pick 1, 2 or 3 matches.");
						System.out.println("Number of remaining matches: " + total);
						for(int k=1 ; k<=num ; k++) {
							System.out.print("* ");
						}
						System.out.println();
						
						for(int i=1 ; i<=num ; i++) {
							System.out.print("| ");
						}
						System.out.println();
						
						for(int z=1 ; z<=num ; z++) {
							System.out.print("| ");
						}
						System.out.println();
						
						for(int g=1 ; g<=num ; g++) {
							System.out.print("| ");
						}
						System.out.println();
						
						for(int l=1 ; l<=num ; l++) {
							System.out.print("| ");
						}
						System.out.println();
						System.out.println("Player "+ (player) + ": How many matches do you want to pick? (1,2 or 3)");
						m = sc.nextInt();
					}
					else {
						total = total - m;
						num = num-m;
						if(total == 0) {
							break;
						}
						if(count % 2 == 0) {
							player = 2;
						}
						else if(count % 2 == 1) {
							player = 1;
						}
						count++;
						System.out.println("Number of remaining matches: " + total);
						for(int k=1 ; k<=num ; k++) {
							System.out.print("* ");
						}
						System.out.println();
						
						for(int i=1 ; i<=num ; i++) {
							System.out.print("| ");
						}
						System.out.println();
						
						for(int z=1 ; z<=num ; z++) {
							System.out.print("| ");
						}
						System.out.println();
						
						for(int g=1 ; g<=num ; g++) {
							System.out.print("| ");
						}
						System.out.println();
						
						for(int l=1 ; l<=num ; l++) {
							System.out.print("| ");
						}
						System.out.println();
						System.out.println("Player "+ (player) + ": How many matches do you want to pick? (1,2 or 3)");
						m = sc.nextInt();
					}
			}
			System.out.println("Player " + (player) + " won the game!");
		}
	}
		
}