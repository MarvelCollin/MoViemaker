package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import models.Anime;
import models.Movie;
import models.Realtime;

public class Main {
	private Scanner scan = new Scanner(System.in);
	ArrayList<Movie>  movies = new ArrayList<>();
	
	public void addMovie() {
		String title;
		do {
			System.out.print("Input movie title [3 - 15 characters] : ");
			title = scan.nextLine();
		} while (!(title.length() >= 3 && title.length() <= 15));
		
		Integer price;
		do {
			System.out.print("Input movie price [min 10000] : ");
			price = scan.nextInt(); scan.nextLine();
		} while (!(price >= 10000));
		
		String type;
		do {
			System.out.print("Input move type [Anime | Realtime] : ");
			type = scan.nextLine();
		} while (!(type.equals("Anime") || type.equals("Realtime")));
		
		if(type.equals("Anime")) {
			Integer pen;
			do {
				System.out.print("Input Pen Quantity [min 1]: ");
				pen = scan.nextInt(); scan.nextLine();
			} while (!(pen >= 1));
			
			movies.add(new Anime(title, price, pen));
			
		} else if(type.equals("Realtime")) {
			String cameraBrand;
			System.out.println("Input Camera Brand : ");
			cameraBrand = scan.nextLine();
			
			movies.add(new Realtime(cameraBrand, price, cameraBrand));
		}
	} 
	
	public void viewMovie() {
		for (Movie movie : movies) {
			if(movie instanceof Anime) {
				System.out.println("Title : ");
			} else if (movie instanceof Realtime) {
				
			}
		}
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
