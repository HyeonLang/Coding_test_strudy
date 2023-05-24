import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class c_2004 {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long cnt5 = five(n) - five(m) - five(n - m);
        long cnt2 = two(n) - two(m) - two(n - m);

        System.out.println(Math.min(cnt2, cnt5));
    }

    private static long five(long n) {
        int cnt = 0;
        while (n > 0) {
            cnt += n / 5;
            n /= 5;
        }
        return cnt;
    }

    private static long two(long n) {
        int cnt = 0;
        while (n > 0) {
            cnt += n / 2;
            n /= 2;
        }
        return cnt;
    }
}
