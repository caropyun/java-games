package day3;

import java.util.Scanner;
public class MatchstickWComp {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int player = 0;
			int m = 0;
			
			//beginning set up code
			System.out.println("Enter the number of matches:");
			int N = sc.nextInt();
			System.out.println("Enter the maximum amount that a player can pick:");
			int M = sc.nextInt();
	
			while(N > 0) {
				System.out.print("Number of remaining matches: ");
				System.out.println(N);
				player = player%2 + 1;
				System.out.println("Player "+ (player) + ": How many matches do you want to pick? (1.."+ M +")");
				
				if(player == 1) {
					//computer's turn
					int c = N%(M+1);
					if (c == 0) {
						//The computer can't win, print out a default value of 1.
						c = 1;
					}
					N = N-c;
					System.out.println(c);
				}
				//human player turn
				else if(player == 2) {
					m = sc.nextInt();
					while (m>M || m<1 || (N - m) < 0) {
						System.out.println("Invalid move!");
						System.out.println("You can pick 1.." + M + " matches.");
						System.out.println("Number of remaining matches: " + N);
						System.out.println("Player "+ (player) + ": How many matches do you want to pick? (1.."+ M +")");
						m = sc.nextInt();
					}
					N = N - m;
				}
				if(N == 0) {
					break;
				}
			}
			System.out.println("Player " + (player) + " won the game!");
		}
	}