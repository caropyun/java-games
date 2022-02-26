package day14;

import java.util.*;
public class Alphaman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char [] [] maze = new char[row][col];
		int arow = 0;
		int acol = 0;
		int erow = 1;
		int ecol = 1;
		int gems = 0;
		for(int i = 0; i < row; i++) {
			String line = sc.next();
			for(int j = 0; j < col; j++) {
				maze[i][j] = line.charAt(j);
				if(maze[i][j] == 'A') {
					arow = i;
					acol = j;
				}
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(maze[i][j] == 'E') {
					erow = i;
					ecol = j;
					break;
				}
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(maze[i][j] == 'G') {
					gems++;
				}
			}
		}
		while(arow != erow || acol!= ecol ||gems!=0) {
			System.out.println();
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					System.out.print(maze[i][j]);
				}
				System.out.println();
			}
			String dir = sc.next();
			if(dir.compareTo("a")==0) { //left
				acol = acol-1;
				if(maze[arow][acol] == '#') {
					acol = acol+1;
					System.out.println("Ouch! You hit the wall!");
				}
				else if(maze[arow][acol] == '.'){
					maze[arow][acol+1] = '.'; 
					maze[arow][acol] = 'A';
				}
				else if(maze[arow][acol] == 'G'){
					gems--;
					maze[arow][acol+1] = '.'; 
					maze[arow][acol] = 'A';
				}
				else if(gems>0 && maze[arow][acol] == 'E') {
					acol = acol+1;
					System.out.println("You first have to collect all the gems!");
					continue;
				}
				else if(gems == 0 && maze[arow][acol] == 'E') {
					break;
				}
				else if(maze[arow][acol] == 'M') {
					break;
				}
			}
			else if(dir.compareTo("d")==0) { //right
				acol = acol+1;
				if(maze[arow][acol] == '#') {
					acol = acol-1;
					System.out.println("Ouch! You hit the wall!");
				}
				else if(maze[arow][acol] == '.'){
					maze[arow][acol-1] = '.';
					maze[arow][acol] = 'A';
				}
				else if(maze[arow][acol] == 'G'){
					gems--;
					maze[arow][acol-1] = '.'; 
					maze[arow][acol] = 'A';
				}
				else if(gems>0 && maze[arow][acol] == 'E') {
					acol = acol-1;
					System.out.println("You first have to collect all the gems!");
					continue;
				}
				else if(gems == 0 && maze[arow][acol] == 'E') {
					break;
				}
				else if(maze[arow][acol] == 'M') {
					break;
				}
			}
			else if(dir.compareTo("w")==0) { //up
				arow = arow-1;
				if(maze[arow][acol] == '#') {
					arow = arow+1;
					System.out.println("Ouch! You hit the wall!");
				}
				else if(maze[arow][acol] == '.'){
					maze[arow+1][acol] = '.'; 
					maze[arow][acol] = 'A';
				}
				else if(maze[arow][acol] == 'G'){
					gems--;
					maze[arow+1][acol] = '.'; 
					maze[arow][acol] = 'A';
				}
				else if(gems>0 && maze[arow][acol] == 'E') {
					arow = arow+1;
					System.out.println("You first have to collect all the gems!");
					continue;
				}
				else if(gems == 0 && maze[arow][acol] == 'E') {
					break;
				}
				else if(maze[arow][acol] == 'M') {
					break;
				}
			}
			else if(dir.compareTo("s")==0) { //down
				arow = arow+1;
				if(maze[arow][acol] == '#') {
					arow = arow-1;
					System.out.println("Ouch! You hit the wall!");
				}
				else if(maze[arow][acol] == '.'){
					maze[arow-1][acol] = '.'; 
					maze[arow][acol] = 'A';
				}
				else if(maze[arow][acol] == 'G'){
					gems--;
					maze[arow-1][acol] = '.'; 
					maze[arow][acol] = 'A';
				}
				else if(gems>0 && maze[arow][acol] == 'E') {
					arow = arow-1;
					System.out.println("You first have to collect all the gems!");
					continue;
				}
				else if(gems == 0 && maze[arow][acol] == 'E') {
					break;
				}
				else if(maze[arow][acol] == 'M') {
					break;
				}
			}
		}
		if(maze[arow][acol] == 'E') {
			System.out.println("Congrats, you finished!!!");
		}
		else if(maze[arow][acol] == 'M') {
			System.out.println("Monster ate you!!!");
		}
	}
}
