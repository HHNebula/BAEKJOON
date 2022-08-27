import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inputNum = Integer.parseInt(br.readLine());
		StringTokenizer inputStr = new StringTokenizer(br.readLine());

		int intArr[] = new int[inputNum];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(inputStr.nextToken());
		}
		int min = intArr[0], max = intArr[0];
		
		for (int i = 0; i < intArr.length; i++) {
			if (min > intArr[i]) {
				min = intArr[i];
			} else if (max < intArr[i]) {
				max = intArr[i];
			}
		}

		System.out.println(min + " " + max);

	}
}
