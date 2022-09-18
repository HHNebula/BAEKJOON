import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<Integer>();

        int caseNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < caseNum; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caseNum; i++) {
            sb.append(list.get(i) + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }

}
