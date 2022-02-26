package day6;

import java.util.*;
public class PenniesInTheBox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = 0; //score for player 1
		int s2 = 0; //score for player 2
		int count = 0;
		int player = 0;

		//boss enters the stuff
		System.out.println("Enter the number of boxes:");
		int n = sc.nextInt(); //number of boxes
		//left defines the left border and right defines right border
		int left = 0;
		int right = n-1;
		int [] arr = new int[n];
		System.out.println("Enter pennies in each box:");
		for(int i = 0; i < n; i++) { //places each penny number in each "box"
			arr[i] = sc.nextInt();
		}
		int [] moves = new int[n];
		
		//this while loops runs the game as long as there are elements in the boxes
		while(left <= right) {
			//prints boxes
			System.out.println();
			System.out.println("Boxes: ");
			for(int i = left; i <= right; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			//prints player scores
			System.out.println("Player 1 score:" + s1);
			System.out.println("Player 2 score:" + s2);
			if(count % 2 == 0) {
				player = 1;
			}
			else if(count % 2 == 1) {
				player = 2;
			}
			
			//player makes the player's move
			System.out.println("Enter player " + player + " move (1 for leftmost,2 for rightmost):");
			int move = sc.nextInt();
			while(move!=1 && move != 2 && move!=3) {
				System.out.println("Invalid move!");
				System.out.println();
				System.out.println("Enter player " + player + " move (1 for leftmost,2 for rightmost):");
				move = sc.nextInt();
			}
			if(move ==1) {
				if(player == 1) {
					s1 += arr[left];
					left++;
				}
				else if(player == 2) {
					s2 += arr[left];
					left++;
				}
				moves[count] = 1;
				count++;
			}
			else if(move ==2) {
				if(player == 1) {
					s1 += arr[right];
					right--;
				}
				else if(player == 2) {
					s2 += arr[right];
					right--;
				}
				moves[count] = 2;
				count++;
			}
			else if(move == 3) {
				if(count==0)continue;
				count--;
				if(moves[count] == 1) {
					left--;
					if(player == 1) {
						s2 -= arr[left];
					}
					if(player == 2) {
						s1 -= arr[left];
					}
				}
				else if(moves[count] == 2) {
					right ++;
					if(player == 1) {
						s2 -= arr[right];
					}
					if(player == 2) {
						s1 -= arr[right];
					}
				}	
			}
		}
		System.out.println("Player 1 score:" + s1);
		System.out.println("Player 2 score:" + s2);
		if(s1>s2) {
			System.out.println("Player 1 won!");
		}
		else if(s2>s1) {
			System.out.println("Player 2 won!");
		}
		else {
			System.out.println("It's a tie!");
		}
	}
}