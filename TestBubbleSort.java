//U10416022
import java.util.Scanner;

public class TestBubbleSort {
	public static void main(String[] args) {

		// set the length of array is 7
		int[] bubble = new int[7];

		// let the user enter 7 numbers
		System.out.println("Please enter seven numbers: ");

		// new scanner
		Scanner input = new Scanner(System.in);
		// put the numbers in array
		for (int i = 0; i < bubble.length; i++) {
			bubble[i] = input.nextInt();
		}

		// call BubbleSort class
		new BubbleSort(bubble);

	}
}
