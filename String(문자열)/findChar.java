import java.util.*;

class Main {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t); // Character 클래스에 있는 메서드 사용.
        /*
         * for(int i=0; i<str.length(); i++){ 
         *  if(str.charAt(i)==t) 
         *      answer++; 
         * }
         */
        for (char x : str.toCharArray()) {
            if (x == t)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자`열`을 읽어들인다.
        char c = kb.next().charAt(0); // charAt: 캐릭터변수를 리턴, string을 인덱스로 접근. 문자 `한 개`를 읽는다.
        System.out.print(T.solution(str, c));
        kb.close();
    }
}

// 스태틱에서 인스턴스 메서드를 사용하려면 객체 생성을 해야한다.
