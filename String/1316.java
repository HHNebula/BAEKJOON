import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		int count = caseNum;

		for (int i = 0; i < caseNum; i++) {

			String str = br.readLine();

			// 입력된 문자열을 문자 배열로 초기화
			char chArr[] = new char[str.length()];
			for (int j = 0; j < str.length(); j++) {
				chArr[j] = str.charAt(j);
			}

			// 해당 알파벳이 등장한 적이 있을 경우 true를 저장하기 위한 boolean 배열
			boolean isAppeared[] = new boolean[26];
			// 이전에 나온 문자를 저장
			char chPrev = ' ';

			for (int j = 0; j < chArr.length; j++) {
				char chNow = chArr[j];
				// 현재 문자와 이전 문자가 다를 경우
				if (chNow != chPrev) {
					// 이전에 나온적이 있다면
					if (isAppeared[chNow - 'a'] == true) {
						count--;
						break;
					} else {
						// 이전에 나온적이 없다면
						isAppeared[chNow - 'a'] = true;
						chPrev = chNow;
					}
				}
			}

		}

		System.out.print(count);

	}

}
