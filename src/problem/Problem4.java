package problem;

public class Problem4 {

    public String operatorQuadrant(int x, int y) {

        // 사분면 연산
        if(x > 0 && y > 0) {
            return "제1사분면에 속함";
        }
        else if (x > 0 && y < 0) {
            return "제4사분면에 속함";
        }
        else if (x < 0 && y > 0) {
            return "제2사분면에 속함";
        }
        else {
            return "제3사분면에 속함";
        }
    }

    public static void main(String[] args) {

        // 클래스 선언
        Problem4 problem = new Problem4();

        // 변수 선언
        int x = 1;
        int y = 1;
        String result = "";

        // 결과문 출력
        result = problem.operatorQuadrant(x, y);
        System.out.println(result);

    }
}
