import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		int avg = 0;

		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			avg += num;
		}

		Arrays.sort(arr);
		
		System.out.println(avg/5);
		System.out.println(arr[2]);

	}

}
