import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int arr[] = new int[26]; // 알파벳 26개
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		} // 모두 -1로 초기화

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // 만약에 ch가 'b'라면
			if ( arr[ch-'a'] == -1 ) {
				// b(98) - a(97) = 1, 1번째 인덱스의 값이 -1일 경우
				arr[ch-'a'] = i; // 해당 인덱스에 i(위치)를 저장
			}
		}
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length-1) {
				System.out.print(" ");
			}
		}

	}

}
