import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (M >= 45) {
			System.out.println(H + " " + (M - 45));
		} else if (H > 0) {
			System.out.println((H - 1) + " " + (M - 45 + 60));
		} else {
			System.out.println(23 + " " + (M - 45 + 60));
		}

	}

}
