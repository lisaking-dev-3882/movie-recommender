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

	public void printMovies(int actorNum) {
		if (genre.equals("Comedy")) {
			if (actorNum == 1) {
				System.out.println(actorOne + " acted in Tammy, Ghostbusters, or The Heat" + "\n");
			} else if (actorNum == 2) {
				System.out.println(actorTwo + " acted in Dodgeball, Zoolander No. 2, or Meet The Parents" + "\n");
			} else if (actorNum == 3) {
				System.out.println(actorThree + " acted in Paul Blart: Mall Cop, Grown Ups, or Pixels" + "\n");
			} else if (actorNum == 4) {
				System.out.println(actorFour + " acted in Keanu, Girls Trip, or Like A Boss" + "\n");
			}
		} else if (genre.equals("Animation")) {
			if (actorNum == 1) {
				System.out.println(actorOne + " acted in Monster's Inc, The Emperor's New Groove, or Cars" + "\n");
			} else if (actorNum == 2) {
				System.out.println(actorTwo + " acted in Toy Story, Polar Express, or The Simpsons Movie" + "\n");
			} else if (actorNum == 3) {
				System.out.println(actorThree
						+ " acted in Atlantis: The Lost Empire, The SpongeBob Movie: Sponge Out Of Water, or The Rugrats Movie"
						+ "\n");
			} else if (actorNum == 4) {
				System.out.println(actorFour
						+ " acted in Isle of Dogs, The SpongeBob SquarePants Movie, or The Jungle Book" + "\n");
			}
		} else if (genre.equals("Drama")) {
			if (actorNum == 1) {
				System.out.println(actorOne + " acted in Batman Begins, American Hustle, or The Fighter");
			} else if (actorNum == 2) {
				System.out.println(actorTwo + " acted in Fences, Widows, or Get on Up");
			} else if (actorNum == 3) {
				System.out.println(actorThree + " acted in Erin Brockovich, August: Osage County, or Mona Lisa Smile");
			} else if (actorNum == 4) {
				System.out.println(actorFour + " acted in Sicario, 21 Grams, or Traffic");
			}
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
