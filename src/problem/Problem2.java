package problem;

public class Problem2 {
    boolean isDiligence = false;
    boolean isF = false;
    // 학점 변수 설정
    public static String setGradeVariable(int score) {
        if(score >= 90) {
            return "A";
        }
        else if(score >= 80) {
            return "B";
        }
        else if(score >= 70) {
            return "C";
        }
        else {
            return "F";
            this.isF = true;
        }
    }
    public static void main(String[] args) {
        // 조건 변수 선언
        // 변수 선언
        int score = 91;
        String scoreResult = "";

        // 학점 변수 설정
        setGradeVariable(score);

        // +학점 설정
        if(isDiligence && isF) {
            scoreResult += "+";
        }

        // 결과문 출력
        System.out.println(scoreResult);
    }
}
