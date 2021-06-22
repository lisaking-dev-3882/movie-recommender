package com.techelevator;

import java.util.Scanner;

public class MovieDemo {

	String genre1 = "Comedy";
	String genre2 = "Animation";
	String genre3 = "Drama";
	Actors actors;

	public void start() {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my Movie Picker!" + "\n");
		System.out.println("Pick a favorite movie genre" + "\n");
		System.out.println("Choose from number 1, 2, or 3:" + "\n");
		System.out.println("1.) " + genre1 + "\n" + "2.) " + genre2 + "\n" + "3.) " + genre3 + "\n");
		System.out.print("Enter choice: ");
		String choice = input.nextLine();
		int movieChoice = Integer.parseInt(choice);

		// Getting choice from user
		setActors(movieChoice);

		System.out.println("Which actor/actress do you want to see in a " + actors.getGenre() + "\n");
		System.out.println("Choose from number 1, 2, 3, or 4:" + "\n");
		System.out.println("1.) " + actors.getActorOne() + "\n" + "2.) " + actors.getActorTwo() + "\n" + "3.) "
				+ actors.getActorThree() + "\n" + "4.) " + actors.getActorFour() + "\n");
		System.out.print("Enter choice: ");
		String ActorChoice = input.nextLine();
		getActorChoice(ActorChoice, actors.getGenre());

		input.close();
	}

	private void getActorChoice(String ActorChoice, String genre) {
		int actorNum = Integer.parseInt(ActorChoice);

		if (genre.equals(genre1)) {
			actors.printMovies(actorNum);
		} else if (genre.equals(genre2)) {
			actors.printMovies(actorNum);
		} else if (genre.equals(genre3)) {
			actors.printMovies(actorNum);
		} else {
			System.out.println("Sorry that isn't a correct number");
		}
	}

	private void setActors(int movieChoice) {
		if (movieChoice == 1) {
			actors = new Actors(genre1);
		} else if (movieChoice == 2) {
			actors = new Actors(genre2);
		} else if (movieChoice == 3) {
			actors = new Actors(genre3);
		} else {
			System.out.println("Sorry that isn't a correct number." + "\n");
		}
	}
}
