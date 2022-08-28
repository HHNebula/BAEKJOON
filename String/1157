import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 알파벳 개수 만큼 배열 선언, 각 알파벳의 출력 횟수를 대입
		int arr[] = new int[26];

		String target = br.readLine();

		for (int i = 0; i < target.length(); i++) {

			// 인덱스 i의 문자가 소문자인지 검사
			if ('a' <= target.charAt(i) && target.charAt(i) <= 'z') {
				arr[target.charAt(i) - 97]++; // 아스키 코드 소문자 97 ~ 122
			} else {
				arr[target.charAt(i) - 65]++; // 아스키 코드 소문자 65 ~ 90
			}
			// arr 배열에서 인덱스 i의 알파벳과 대응되는 위치의 인덱스를 증가시킴

		}

		int max = -1; // 최대 입력 수
		char ch = '?'; // 최대 입력 문자

		// 배열을 검사
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; // 저장된 max보다 큰 수를 만나면 그 수를 저장
				ch = (char) (i + 65); // 인덱스에 65를 더해 대문자로 만들어 문자에 저장
			} else if (arr[i] == max) {
				ch = '?'; // 저장된 최대값과 동일한 수를 만나면 문자를 ?로 저장
			}
		}
		
		System.out.println(ch);

	}

}
