import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

//		입력
//		첫째 줄에는 도감에 수록되어 있는 포켓몬의 개수 N과 맞춰야 하는 문제의 개수 M이 주어진다.
//		N과 M은 1보다 크거나 같고, 100,000보다 작거나 같은 자연수이다.
//		둘째 줄부터 N개의 줄에 포켓몬의 번호가 1번인 포켓몬부터
//		N번에 해당하는 포켓몬까지 한 줄에 하나씩 입력
//		포켓몬의 이름은 모두 영어로만 이루어져있고,
//		첫 글자만 대문자이나 일부 포켓몬은 마지막 문자만 대문자일 수도 있다.
//		포켓몬 이름의 최대 길이는 20, 최소 길이는 2.

//		그 다음 줄부터 총 M개의 줄에 맞춰야하는 문제가 입력.
//		문제가 알파벳으로만 들어오면 포켓몬 번호 출력,
//		숫자로만 들어오면, 포켓몬 번호에 해당하는 문자를 출력.

//		입력으로 들어오는 숫자는 반드시 1보다 크거나 같고, N보다 작거나 같다.
//		입력으로 들어오는 문자는 반드시 도감에 있는 포켓몬의 이름만 주어진다.

//		출력
//		첫째 줄부터 차례대로 M개의 줄에 각각의 문제에 대한 답을 출력
//		입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을,
//		문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출력.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int name = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= name; i++) {
            String str = br.readLine();
            map.put(str, i);
            list.add(str);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < question; i++) {
            String str = br.readLine();
            if (!isString(str)) { // 숫자형변환이 가능하다면
                sb.append(list.get(Integer.parseInt(str) - 1)).append("\n");
            } else {
                sb.append(map.get(str)).append("\n");
            }

        }

        System.out.println(sb);
        br.close();

    }

    /**
     * 문자열을 받아 숫자로 전환이 가능한지 확인
     *
     * @param str
     * @return
     */
    public static boolean isString(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException exception) {
            return true;
        }
    }

}
