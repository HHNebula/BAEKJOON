import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		// ==== 문제 ====
//		온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
//		이때, 회원들을 나이가 증가하는 순으로,
//		나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

		// ==== 입력 ====
//		첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
//		둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
//		나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고,
//		이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다.
//		입력은 가입한 순서로 주어진다.

		// ==== 출력 ====
//		첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순,
//		나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()); // 주어질 정보의 개수

		// 사용자 정보를 받아 배열 초기화
		String[][] user = new String[count][3];
		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			user[i][0] = st.nextToken(); // 사용자의 나이
			user[i][1] = st.nextToken(); // 사용자의 이름
			user[i][2] = i + ""; // 사용자의 가입 순서
		}

		// 람다식으로 풀기
		// Arrays.sort() 람다식으로 확장
		Arrays.sort(user, (user1, user2) -> {
			if (user1[0].equals(user1[0])) { // 나이가 같다면
				return Integer.parseInt(user1[0]) - Integer.parseInt(user2[0]); // 가입일을 비교하여 자리를 바꿈
			} else { // 나이가 같지 않다면
				return Integer.parseInt(user1[2]) - Integer.parseInt(user2[2]); // 가입 순서를 비교하여 자리를 바꿈
			}
		});

		// 출력하기
		for (int i = 0; i < count; i++) {
			System.out.println(user[i][0] + " " + user[i][1]);
		}

	}

}
