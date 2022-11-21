import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		// ==== 문제 ====
//		배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

		// ==== 입력 ====
//		첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

		// ==== 출력 ====
//		첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 문자열 형태로 저장
		char[] arr = new char[str.length()]; // 문자열을 문자배열로 전환
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		Arrays.sort(arr); // 오름차순 정렬
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= arr.length; i++) {
			sb.append(arr[arr.length - i]); // 뒤에서부터 저장함
		}

		str = sb.toString();
		System.out.println(Integer.parseInt(str)); // 숫자로 변환하여 출력
		br.close();

	}

}
