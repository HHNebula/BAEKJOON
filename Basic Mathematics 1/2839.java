import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kg = Integer.parseInt(br.readLine());
		int num;

		if (kg % 5 == 1 || kg % 5 == 3) {
			num = (kg / 5) + 1;
		} else if ((kg / 5 > 1 && kg % 5 == 2) || (kg / 5 > 0 && kg % 5 == 4)) {
			num = (kg / 5) + 2;
		} else if (kg % 5 == 0) {
			num = kg / 5;
		} else {
			num = -1;
		}

		System.out.println(num);

	}

}
