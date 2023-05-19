import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        // 규칙
        // 1 > 3의 제곱 9
        // 2 > 5의 제곱 25
        // 3 > 9의 제곱 81
        // 4 > 17의 제곱 289
        // ......

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int[] results = new int[n];
        int num;

        for (int i = 0; i < results.length; i++) {
            num = 2;
            for (int j = 0; j < i; j++) {
                num *= 2;
            }

            results[i] = 1 + num;
        }

        System.out.println(results[n - 1] * results[n - 1]);

    }

}
