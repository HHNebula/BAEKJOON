import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int count = 0;
		int copy = num;

		do {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			count++;
		} while (copy != num);

		System.out.println(count);

	}
}
