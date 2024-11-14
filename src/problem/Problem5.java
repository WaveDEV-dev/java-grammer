package problem;

import java.util.Objects;
import java.util.Scanner;

public class Problem5 {

    String operatorSymbol;

    public static void main(String[] args) {

        // 클래스 선언
        Problem5 problem = new Problem5();

        // 변수 선언
        int firstInt = 0;
        int secondInt = 0;
        String result = "";

        // 결과문 출력
        result = problem.operator(firstInt, secondInt);
        System.out.println(result);
    }

    public String operator(int firstInt, int secondInt) {

        // 계산에 필요한 첫 번째 정수 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("계산에 사용될 첫 번째 정수를 입력하세요.");
        firstInt = Integer.parseInt(sc.next());

        // 계산에 필요한 두 번째 정수 입력
        System.out.println("계산에 사용될 두 번째 정수를 입력하세요.");
        secondInt = Integer.parseInt(sc.next());

        // 계산에 필요한 첫 번째 기호 입력
        System.out.println("최종적으로 두 정수의 계산에 사용될 기호를 입력해주세요.");
        operatorSymbol = sc.next();

        // 계산 결과 출력
        return switch (operatorSymbol) {
            case "+" -> "두 정수의 덧셈 결과는 " + (firstInt + secondInt) + "입니다.";
            case "-" -> "두 정수의 뺄셈 결과는 " + (firstInt - secondInt) + "입니다.";
            case "*" -> "두 정수의 곱셈 결과는 " + (firstInt * secondInt) + "입니다.";
            case "/" -> "두 정수의 나눗셈 결과는 " + (firstInt / secondInt) + "입니다.";
            case "%" -> "두 정수의 몫 결과는 " + (firstInt % secondInt) + "입니다.";
            case null, default -> "잘못된 접근입니다.";
        };

    }
}
