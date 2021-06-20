package com.techelevator;

import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		
		String genre1 = "Comedy";
		String genre2 = "Animation";
		String genre3 = "Drama";
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my Movie Picker!" + "\n");
		System.out.println("Pick a favorite movie genre" + "\n");
		System.out.println("Choose from number 1, 2, or 3:" + "\n");
		System.out.println("1.) " + genre1 + "\n" + "2.) " + genre2 + "\n" + "3.) " + genre3 + "\n");
		String choice = input.nextLine();
		int movieChoice = Integer.parseInt(choice);
		
		
		if (movieChoice == 1){
            System.out.println("Comedy: Zoolander, Superbad, and Bridesmaids" + "\n");  
               }  else if (movieChoice == 2) {
            System.out.println("Animation: The Lion King, Spiderman: Into The Multiverse, and Mitchells vs.the Machines" + "\n");	   
               } else if (movieChoice == 3) {
            System.out.println("Drama: Dead Poets Society, October Sky, and Waves" + "\n");
               } else {
            System.out.println("Sorry that isn't a correct number." + "\n");
               }
		
		
		String comedyActorOne = "Melissa McCarthy";
		String comedyActorTwo = "Ben Stiller";
		String comedyActorThree = "Kevin James";
		String comedyActorFour = "Tiffany Haddish";
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which actor/actress do you want to see in a Comedy?" + "\n");
		System.out.println("Choose from number 1, 2, 3, or 4:" + "\n");
		System.out.println("1.) " + comedyActorOne + "\n" + "2.) " + comedyActorTwo + "\n" + "3.) " + comedyActorThree + "\n" + "4.) " 
							+ comedyActorFour + "\n");
		String comedyActorChoice = scan.nextLine();
		int actorInComedy = Integer.parseInt(comedyActorChoice);
		
		if (actorInComedy == 1) {
			System.out.println("Tammy, Ghostbusters, or The Heat" + "\n");
		} else if (actorInComedy == 2) {
			System.out.println("Dodgeball, Zoolander No. 2, or Meet The Parents" + "\n");
		} else if (actorInComedy == 3) {
			System.out.println("Paul Blart: Mall Cop, Grown Ups, or Pixels" + "\n");
		} else if (actorInComedy == 4) {
			System.out.println("Keanu, Girls Trip, or Like A Boss" + "\n");
		} else {
			System.out.println("Sorry that isn't a correct number");
		}
		
		
		String animatedActorOne = "John Goodman";
		String animatedActorTwo = "Tom Hanks";
		String animatedActorThree = "Cree Summers";
		String animatedActorFour = "Scarlett Johansson";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which actor/actress would you like to see in an Animated movie?" + "\n");
		System.out.println("Choose from number 1, 2, 3, or 4:" + "\n");
		System.out.println("1.) " + animatedActorOne + "\n" + "2.) " + animatedActorTwo + "\n" + "3.) " + animatedActorThree + "\n" + "4.) " 
							+ animatedActorFour + "\n");
		String animatedActorChoice = scanner.nextLine();
		int actorInAnimation = Integer.parseInt(animatedActorChoice);
		
		
		if (actorInAnimation == 1) {
			System.out.println("Monster's Inc, The Emperor's New Groove, or Cars" + "\n");
		} else if (actorInAnimation == 2) {
			System.out.println("Toy Story, Polar Express, or The Simpsons Movie" + "\n");
		} else if (actorInAnimation == 3) {
			System.out.println("Atlantis: The Lost Empire, The SpongeBob Movie: Sponge Out Of Water, or The Rugrats Movie" + "\n");
		} else if (actorInAnimation == 4) {
			System.out.println("Isle of Dogs, The SpongeBob SquarePants Movie, or The Jungle Book" + "\n");
		} else {
			System.out.println("Sorry that isn't a correct number");
		}
		
		
		String dramaActorOne = "Christian Bale";
		String dramaActorTwo = "Viola Davis";
		String dramaActorThree = "Julia Roberts";
		String dramaActorFour = "Benicio Del Toro";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which actor/actress would you like to see in a Drama?" + "\n");
		System.out.println("Choose from number 1, 2, 3, or 4: " + "\n");
		System.out.println("1.) " + dramaActorOne + "\n" + "2.) " + dramaActorTwo + "\n" + "3.) " + dramaActorThree + "\n" + "4.) " 
							+ dramaActorFour + "\n");
		String dramaActorChoice = sc.nextLine();
		int actorInDrama = Integer.parseInt(dramaActorChoice);
		
		
		if (actorInDrama == 1) {
			System.out.println("Batman Begins, American Hustle, or The Fighter");
		} else if (actorInDrama == 2) {
			System.out.println("Fences, Widows, or Get on Up");
		} else if (actorInDrama == 3) {
			System.out.println("Erin Brockovich, August: Osage County, or Mona Lisa Smile");
		} else if (actorInDrama == 4) {
			System.out.println("Sicario, 21 Grams, or Traffic");
		} else {
			System.out.println("Sorry that isn't a correct number");
		}
	}
}
