
public class Main { // 셀프넘버

	public static void main(String[] args) {

		boolean[] check = new boolean[10001];
		// 10000보다 작거나 같으므로 10001 배열 생성
		// 1 ~ 10000 까지 검사한 뒤, 해당 수를 생성자로 하는 수가 있으면 제외

		for (int i = 1; i < 10001; i++) { // 1부터 10000까지 검사
			int n = d(i); // i를 생성자로 하는 수를 n에 저장
			if (n < 10001) {
				check[n] = true;
				// 생성자가 있는 수를 인덱스로 하여 해당 위치를 true로 전환
			}
		}

		// boolean 배열에서 false인 경우 해당 인덱스는 셀프 넘버임
		for (int i = 1; i < check.length; i++) {
			if (!check[i]) { // 데이터가 false 이면
				System.out.println(i); // 해당 위치 인덱스 출력
			}
		}

	}

	public static int d(int i) { // i를 생성자로 하는 숫자를 반환하는 메서드
		int conNum = i;

		while (i != 0) { // i가 0이되면 종료함
			conNum = conNum + (i % 10); // i에 i의 1의 자리수를 더함
			i = i / 10; // i를 10으로 나눔 > 1의 자리수 삭제
		} // i가 0이 될 때 까지 반복하면 i를 생성자로 하는 수가 계산됨

		return conNum; // i를 생성자로 하는 수를 반환함
	}

}
