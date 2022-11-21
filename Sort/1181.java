import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {

		// ==== 문제 ====
//		알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//
//		길이가 짧은 것부터
//		길이가 같으면 사전 순으로

		// ==== 입력 ====
//		첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000)
//		둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.
//		주어지는 문자열의 길이는 50을 넘지 않는다.

		// ==== 출력 ====
//		조건에 따라 정렬하여 단어들을 출력한다.
//		단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()); // 주어질 단어의 개수

		// 단어를 받아 배열 초기화
		String[] word = new String[count];
		for (int i = 0; i < count; i++) {
			word[i] = br.readLine();
		}

		// 정렬 방법
		// Comparator 인터페이스 구현하기
		// 객체를 비교할 수 있도록 해주는 인터페이스
		Arrays.sort(word, new Comparator<String>() { // Arrays.sort() 확장
			// 인터페이스의 메서드를 구현
			@Override
			public int compare(String str1, String str2) {
				// 정렬 방법 구현 - 리턴 타입은 정수형임
				// 양수라면 위치를 바꿈
				// 0 또는 음수라면 위치를 바꾸지 않음

				// 정렬 1차 조건 - 길이가 짧은 순
				if (str1.length() == str2.length()) { // 두개의 길이가 같다면
					// compareTo() = str1을 기준으로 str2의 길이를 비교
					// 기준값이 비교대상보다 크면 1이 반환됨 > 자리를 바꿈
					return str1.compareTo(str2);
				} else { // 길이가 다르다면
					// str1 이 더 길다면 양수가 나옴 > 자리를 바꿈
					return str1.length() - str2.length();
				}
			}
		});

		// 출력하기 - 중복은 출력하지 않음
		System.out.println(word[0]); // 첫 번째 단어는 비교 대상이 없으므로 바로 출력함
		for (int i = 1; i < count; i++) {
			if (!word[i].equals(word[i - 1])) { // 중복이 아니라면
				System.out.println(word[i]); // 출력함
			}
		}

	}

}
