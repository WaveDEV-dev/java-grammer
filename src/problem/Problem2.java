package problem;

public class Problem2 {
    public static void main(String[] args) {
        int score = 90;
        boolean diligence = true;

        if(score >= 90) {
            String scoreResult = "A";
            if(diligence) {
                System.out.println(scoreResult + "+");
            }
        }
        else if(score >= 80) {
            String scoreResult = "B";
            if(diligence) {
                System.out.println(scoreResult + "+");
            }
        }
        else if(score >= 70) {
            String scoreResult = "C";
            if(diligence) {
                System.out.println(scoreResult + "+");
            }
        }
        else {
            String scoreText = "F";
            System.out.println(scoreText);
            return;
        }
    }
}
