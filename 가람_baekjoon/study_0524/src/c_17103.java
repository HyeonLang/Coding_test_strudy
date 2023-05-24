import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c_17103 {
    private static boolean[] arr;
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new boolean[1000001];
        initialize();
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int cnt;
        int test_case;
        for (int i = 0; i < T; i++) {
            cnt = 0;
            test_case = Integer.parseInt(br.readLine());
            for (int j = 2; j <= test_case / 2; j++) {
                if (!arr[j] && !arr[test_case - j]) cnt++;
            }
            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }

    private static void initialize() {
        arr[0] = arr[1] = true;
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
    }
}
