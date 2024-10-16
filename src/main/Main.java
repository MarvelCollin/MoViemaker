package main;

import java.util.Scanner;

public class Main {
	private Scanner scan = new Scanner(System.in);
	
	public void addMovie() {
		
	}
	
	public void viewMovie() {
		
	}
	
	public void removeMovie() {
		
	}
	
	public void menu() {
		int choice = 0;
		do {
			System.out.println("1. Add Movie");
			System.out.println("2. View Movie");
			System.out.println("3. Remove Movie");
			System.out.print(">> ");
			choice = scan.nextInt(); scan.nextLine();
			
			switch(choice) {
			case 1: 
				addMovie();
				break;
			case 2:
				viewMovie();
				break;
			case 3: 
				removeMovie();
				break;
			default:
				System.out.println("Please choose input 1-3");
				break;
			}
		} while (!(choice >= 1 && choice <= 3));
	}
	
	public Main() {
		menu();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
