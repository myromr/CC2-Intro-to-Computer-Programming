import java.util.Scanner;

public class GuessTheNumber{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a = 1 + (int) (Math.random() * 99);
		int guess = 0;
		boolean win = false;
		int count2 = 5;

		System.out.println("I am thinking of a number from 1 to 100" + " ... guess what it is ?");
		System.out.println("You only have " + count2 + " tries");
		System.out.println("Good luck!");
		System.out.println("The answer is " + a);

		while (win == false)
			{

			guess = sc.nextInt();		
			count++;
			count2--;

			if (guess == a){
					win = true;
					if(count==1){
						System.out.println("Congratulations. You guessed the number in " + count + " try.");
					}
					else{
						System.out.println("Congratulations. You guessed the number in " + count + " tries.");
					}
					}
			if (guess > a) {
				System.out.println("LOWER!");
				System.out.println("You only have " + count2 + " tries left!");
				System.out.println();
			} else if (guess < a) {
				System.out.println("HIGHER!");
				System.out.println("You only have " + count2 + " tries left!");
				System.out.println();
			}
			if(guess != a && count == 5){
				System.out.println("Game Over!");
				System.out.println("The right answer is " + a);
				break;
			}
		}
	}
}