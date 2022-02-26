package day13;

import java.util.*;
public class TicTacToe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] [] board = new String [4][4];
		int count = 0;
		int x = 0;
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <=3; j++) {
				board[i][j] = "-";
			}
		}
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <=3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		while(count < 9) {
			System.out.println();
			int player = turn(count);
			String p = marking(player);
			System.out.println("Player " + player+ ", please enter your move (row, col):");
			int row = sc.nextInt();
			int col = sc.nextInt();
			if(row > 3 || col >3 || row<1 || col<1) {
					System.out.println();
					System.out.println("Invalid move!");
					continue;
			}
			if(board[row][col] == "-") {
				board[row][col] = p;
				x = win(board,p);
				if(x == 1) {
					break;
				}
				else if(x == 2) {
					break;
				}
				count = count+1;
				System.out.println();
			}
			else if(board[row][col] == "X" || board[row][col] == "O") {
					System.out.println();
					System.out.println("Invalid move!");
					continue;
			}
			for(int i = 1; i <= 3; i++) {
				for(int j = 1; j <=3; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
		}
		System.out.println();
		if(x == 1) {
		    for(int i = 1; i <= 3; i++) {
				for(int j = 1; j <=3; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println( "1. player won!");
		}
		else if(x ==2) {
		    for(int i = 1; i <= 3; i++) {
				for(int j = 1; j <=3; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("2. player won!");
		}
		else {
			System.out.println("Tie!");
		}
	}
	static int turn(int count) {
		int  p = 0;
		if(count%2 == 0) {
			p = 1;
		}
		else {
			p = 2;
		}
		return p;
	}
	static String marking(int player) {
		String p = "";
		if(player == 1) {
			p = "X";
		}
		else if(player == 2) {
			p = "O";
		}
		return p;
	}
	static int win(String [][] board, String p) {
		int x = 0;
		if((board[1][1] == p && board[1][2] == p && board[1][3] == p) || (board[2][1] == p && board[2][2] == p && board[2][3] == p)|| (board[3][1] == p && board[3][2] == p && board[3][3] == p)) {
			if(p == "X") {
				x = 1;
			}
			else if(p == "O") {
				x = 2;
			}
		}
		if((board[1][1] == p && board[2][1] == p && board[3][1] == p) || (board[1][2] == p && board[2][2] == p && board[3][2] == p) ||(board[1][3] == p && board[2][3] == p && board[3][3] == p)) {
			if(p == "X") {
				x = 1;
			}
			else if(p == "O") {
				x = 2;
			}
		}
		if(board[1][1] ==p && board[2][2] == p && board[3][3] == p ||(board[1][3] ==p && board [2][2] == p && board[3][1] ==p)) {
			if(p == "X") {
				x = 1;
			}
			else if(p == "O") {
				x = 2;
			}
		}
		return x;
	}
}