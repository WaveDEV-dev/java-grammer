package problem;

public class Problem2 {
    public static void main(String[] args) {
        // 변수 선언
        int score = 91;
        boolean diligence = false;
        String scoreResult = "";

        // 학점 변수 설정
        if(score >= 90) {
            scoreResult = "A";
        }
        else if(score >= 80) {
            scoreResult = "B";
        }
        else if(score >= 70) {
            scoreResult = "C";
        }
        else {
            scoreResult = "F";
        }

        // +학점 설정
        if(diligence && !scoreResult.equals("F")) {
            scoreResult += "+";
        }

        // 결과문 출력
        System.out.println(scoreResult);

    }
}
