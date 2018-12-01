import java.util.Scanner;

public class Fibonacci{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long num1, num2, sum, count;
		num1 = 1;
		num2 = 0;
		sum = 0;

		System.out.print("Enter an interger: ");
		count = sc.nextInt();
		
		for(int i = 1; i <= count; i++){
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
				System.out.println("Value is " + sum);

	}
}