package com.techelevator;

public class Actors {

	private String genre;
	private String actorOne;
	private String actorTwo;
	private String actorThree;
	private String actorFour;

	public Actors(String actorCategory) {
		if (actorCategory.equals("Comedy")) {
			genre = actorCategory;
			actorOne = "Melissa McCarthy";
			actorTwo = "Ben Stiller";
			actorThree = "Kevin James";
			actorFour = "Tiffany Haddish";
		} else if (actorCategory.equals("Animation")) {
			genre = actorCategory;
			actorOne = "John Goodman";
			actorTwo = "Tom Hanks";
			actorThree = "Cree Summers";
			actorFour = "Scarlett Johansson";
		} else if (actorCategory.equals("Drama")) {
			genre = actorCategory;
			actorOne = "Christian Bale";
			actorTwo = "Viola Davis";
			actorThree = "Julia Roberts";
			actorFour = "Benicio Del Toro";
		}

	}

	public void printComedyMovies(int actorNum) {

		if (actorNum == 1) {
			System.out.println("Tammy, Ghostbusters, or The Heat" + "\n");
		} else if (actorNum == 2) {
			System.out.println("Dodgeball, Zoolander No. 2, or Meet The Parents" + "\n");
		} else if (actorNum == 3) {
			System.out.println("Paul Blart: Mall Cop, Grown Ups, or Pixels" + "\n");
		} else if (actorNum == 4) {
			System.out.println("Keanu, Girls Trip, or Like A Boss" + "\n");
		}

	}

	public void printAnimatedMovies(int actorNum) {

		if (actorNum == 1) {
			System.out.println("Monster's Inc, The Emperor's New Groove, or Cars" + "\n");
		} else if (actorNum == 2) {
			System.out.println("Toy Story, Polar Express, or The Simpsons Movie" + "\n");
		} else if (actorNum == 3) {
			System.out.println(
					"Atlantis: The Lost Empire, The SpongeBob Movie: Sponge Out Of Water, or The Rugrats Movie" + "\n");
		} else if (actorNum == 4) {
			System.out.println("Isle of Dogs, The SpongeBob SquarePants Movie, or The Jungle Book" + "\n");
		}
	}

	public void printDramaMovies(int actorNum) {
		if (actorNum == 1) {
			System.out.println("Batman Begins, American Hustle, or The Fighter");
		} else if (actorNum == 2) {
			System.out.println("Fences, Widows, or Get on Up");
		} else if (actorNum == 3) {
			System.out.println("Erin Brockovich, August: Osage County, or Mona Lisa Smile");
		} else if (actorNum == 4) {
			System.out.println("Sicario, 21 Grams, or Traffic");
		}
	}

	public String getGenre() {
		return genre;
	}

	public String getActorOne() {
		return actorOne;
	}

	public String getActorTwo() {
		return actorTwo;
	}

	public String getActorThree() {
		return actorThree;
	}

	public String getActorFour() {
		return actorFour;
	}

}
