package problem;

public class Problem2 {
    public static void main(String[] args) {
        int score = 90;
        boolean diligence = true;

        if(score >= 90 && diligence) {
            String scoreResult = "A";
            System.out.println(scoreResult + "+");
            return;
        }
        else if(score >= 90) {
            String scoreResult = "A";
            System.out.println(scoreResult);
            return;
        }

        if(score >= 80 && diligence) {
            String scoreResult = "B";
            System.out.println(scoreResult + "+");
            return;
        }
        else if(score >= 80) {
            String scoreResult = "B";
            System.out.println(scoreResult);
            return;
        }

        if(score >= 70 && diligence) {
            String scoreResult = "C";
            System.out.println(scoreResult + "+");
            return;
        }
        else if(score >= 70) {
            String scoreResult = "C";
            System.out.println(scoreResult);
            return;
        }

        else {
            String scoreText = "F";
            System.out.println(scoreText);
            return;
        }
    }
}
