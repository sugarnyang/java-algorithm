import java.util.*;

public class Main {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');                    ;
            } else
                stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++)
            answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(T.solution(str));
    }
}