import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class c_1874 {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int now = 0;
        int num;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            if (num > now) {
                for (int j = now + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                now = num;
            } else {
                if (stack.peek() != num) {
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}
