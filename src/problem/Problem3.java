package problem;

public class Problem3 {

    // 두 변수 비교 연산
    public String operatorResult(int a, int b) {
        if (a == b) {
            return "a == b";
        }
        else if (a > b) {
            return "a > b";
        }
        else {
            return "a < b";
        }
    }

    public static void main(String[] args) {

        // 클래스 선언
        Problem3 problem = new Problem3();

        // 변수 선언
        int a = 10;
        int b = 7;
        String result = "";

        // 결과문 출력
        result = problem.operatorResult(a, b);
        System.out.println(result);
    }
}
