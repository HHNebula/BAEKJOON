import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int round = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum = 0;

		for (int i = 0; i < round; i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}

		System.out.println(sum);

	}

}
