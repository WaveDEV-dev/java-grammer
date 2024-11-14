package problem;

public class Problem2 {
    public static void main(String[] args) {
        int score = 90;
        boolean diligence = true;
        String scoreResult = "";

        if(score >= 90 && diligence) {
            scoreResult = "A";
        }
        else if(score >= 80 && diligence) {
            scoreResult = "B";
        }
        else if(score >= 70 && diligence) {
            scoreResult = "C";
        }

        if(diligence) {
            System.out.println(scoreResult + "+");
        }

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

        if(diligence == false) {
            System.out.println(scoreResult);
        }
    }
}
