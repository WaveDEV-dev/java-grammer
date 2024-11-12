// 조건문 연습
public class Condition {
    public static void main(String[] args) {
//        int a = 10;
//        boolean isNumber = true;
//        boolean isWrong = false;
//        if(isNumber) {
//            System.out.println("숫자 에러입니다.");
//            return;
//        }
//        if(isWrong) {
//            System.out.println("잘못된 접근입니다.");
//            return;
//        }
//        a = a + 10;

        int score = 60;

        if(score >= 90) {
            System.out.println("A");
        }
        else if(score >= 80) {
            System.out.println("B");
        }
        else if(score >= 70) {
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }
    }
}
