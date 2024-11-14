package problem;

public class Problem2 {

    // 조건 변수 설정
    boolean isDiligence = true;
    boolean isF = false;

    // 학점 변수 설정

    public String setGradeVariable(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            this.isF = true;
            return "F";
        }
    }

    public String setPlusGradeVariable(String scoreResult) {

        // +학점 연산
        if (isDiligence && !isF) {
            scoreResult += "+";
        }
        return scoreResult;
    }

    public static void main(String[] args) {

        // 클래스 선언
        Problem2 problem = new Problem2();

        // 변수 선언
        int score = 100;
        String scoreResult = "";

        // 학점 변수 설정
        scoreResult = problem.setGradeVariable(score);

        // +학점 설정
        scoreResult = problem.setPlusGradeVariable(scoreResult);

        // 결과문 출력
        System.out.println(scoreResult);
    }
}
