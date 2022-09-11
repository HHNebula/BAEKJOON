import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		// 엘레베이터와 가까운 거리부터 배정
		// 낮은 층수부터 배정

		// 아래와 같은 순서로 배정됨
		// 6 12 ...
		// 5 11 ...
		// 4 10 ...
		// 3 9 15
		// 2 8 14
		// 1 7 13

		// 방번호 규칙 층수 + 호수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine()); // 반복 횟수

		for (int i = 0; i < caseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int floor = Integer.parseInt(st.nextToken()); // 층수
			int room = Integer.parseInt(st.nextToken()); // 층당 방의 수
			int guest = Integer.parseInt(st.nextToken()); // 손님 번호

			int assignFloor; // 배정된 층

			// 배정된 층 구하기
//			if (guest % floor == 0) {
//				assignFloor = floor; // 나머지가 0이면 꼭대기층
//			} else {
//				assignFloor = guest % floor; // 나머지가 배정된 층
//			}

			int assignRoom; // 배정된 방

			// 배정된 방 구하기
//			if (guest % floor == 0) { // 나머지가 0이면
//				assignRoom = guest / floor; // 몫이 방번호
//			} else {
//				assignRoom = (guest / floor) + 1; // 몫+1이 방번호
//			}
			
			// 조건식이 같아 하나로 합침
			if (guest % floor == 0) { // 나머지가 0이면
				assignFloor = floor; // 꼭대기층
				assignRoom = guest / floor; // 몫이 방번호
			} else {
				assignRoom = (guest / floor) + 1; // 몫+1이 방번호
				assignFloor = guest % floor; // 나머지가 배정된 층
			}

			// 배정된 방 번호
			System.out.println(assignFloor * 100 + assignRoom);

		}

	}

}
