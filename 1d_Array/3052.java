import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 배열로 풀기

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inputArr[] = new int[10]; // 입력값이 저장될 배열
		int reArr[] = new int[10]; // 나머지값이 저장될 배열
		int div = 42; // 나눌 수
		boolean isTrue[] = new boolean[div]; //

		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(br.readLine()); // 입력값을 받아
			reArr[i] = inputArr[i] % div; // 42로 나눈 나머지를 구한 뒤
			isTrue[reArr[i]] = true; // 해당 숫자를 가진 boolean 인덱스 값을 true로 저장
		}

		int count = 0; // 서로 다른 값의 갯수
		for (int i = 0; i < isTrue.length; i++) {
			if (isTrue[i] == true) count++;
		}
		System.out.println(count);
	}
}
