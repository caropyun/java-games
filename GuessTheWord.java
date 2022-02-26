package day11;

// 2019 Summer

import java.util.*;
public class GuessTheWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a secret word:");
		String answer = sc.next();
		String word = "";
		for(int i = 0; i < answer.length(); i++) {
			word = word + "*";
		}
		String used = "";
		int life = 5;
		while(life !=0) { //while life is not equal to 0 and word is not equal to all alphabets
			System.out.println();
			System.out.println(word);
			System.out.println("Enter a lower case letter:");
			String letter = sc.next();
			int r = checkUsed(used,letter);
			while(r == 1) {
				System.out.println("You have used this letter before. Please enter again:");
				letter = sc.next();
				r = checkUsed(used,letter);
			}
			String word2 = check(word,answer,letter);
			if(word2.compareTo(word) == 0) {
				life--;
			}
			else if(word2.compareTo(word) !=0) {
				System.out.println();
				word = word2;
				System.out.println(word);
			}
			used = used+ letter;
			System.out.println("Life left:" + life);
			System.out.println("So far you have used these letters:" +used);
			int w = allLetter(word);
			if(w == 1) {
				break;
			}
		}
		if(life == 0) {
			System.out.println("You lost!");
		}
		else if(life > 0) {
			System.out.println("You won!");
		}
	}
	
	
	//this method checks for the letter in the word returns new word if there is
	static String check (String word, String answer, String letter){
		for(int i = 0; i < answer.length(); i++) {
			String sub = answer.substring(i,i+1);
			if(sub.compareTo(letter) == 0) {
				String sub1 = word.substring(0,i);
				String sub2 = word.substring(i+1,word.length());
				word = sub1 + letter + sub2;
			}
		}
		return word;
	}
	static int allLetter(String word) {
		int x = 0;
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(Character.isLetter(word.charAt(i))== true) {
				count++;
			}
		}
		if(count == word.length()) {
			x = 1;
		}
		return x;
	}
	static int checkUsed(String used, String letter) {
		int x = 0;
		for(int i = 0; i < used.length(); i++) {
			String sub = used.substring(i,i+1);
			if(sub.compareTo(letter) == 0) {
				x = 1;
			}
		}
		return x;
	}
}