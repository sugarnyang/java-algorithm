import java.util.*;

/**
 * Main
 */
public class Main {

    public String solution(String str, char c) {
        
        return "";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.length() <= 100) {
             
        } else {
            System.out.println("100자 이하로 작성해주세요.");
        }

        char c = sc.next().charAt(0);
        System.out.println(T.solution(str, c));
        sc.close();
    }
}