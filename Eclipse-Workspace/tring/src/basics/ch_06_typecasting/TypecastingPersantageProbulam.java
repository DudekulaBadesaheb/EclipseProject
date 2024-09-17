package basics.ch_06_typecasting;
//Here's a real-life example of type casting where we create a program to calculate the percentage of a user's score in relation to the maximum score in a game.

//We use type casting to make sure that the result is a floating-point value, rather than an integer:
public class TypecastingPersantageProbulam {

	public static void main(String[] args) {
		// Set the maximum possible score in the game to 500
		int maxScore = 500;

		// The actual score of the user
		int userScore = 423;

		/*
		 * Calculate the percantage of the user's score in relation to the maximum
		 * available score. Convert userScore to float to make sure that the division is
		 * accurate
		 */
		float percentage = (float) userScore / maxScore * 100.0f;

		System.out.println("User's percentage is " + percentage);
	}

}
