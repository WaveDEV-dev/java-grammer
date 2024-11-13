package problem;

import java.util.Objects;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        int firstInt;
        int secondInt;
        String operatorSymbol;

        Scanner sc = new Scanner(System.in);
        System.out.println("계산에 사용될 첫 번째 정수를 입력하세요.");
        firstInt = Integer.parseInt(sc.next());

        System.out.println("계산에 사용될 두 번째 정수를 입력하세요.");
        secondInt = Integer.parseInt(sc.next());

        System.out.println("최종적으로 두 정수의 계산에 사용될 기호를 입력해주세요.");
        operatorSymbol = sc.next();

        if(Objects.equals(operatorSymbol, "+")) {
            System.out.println("두 정수의 덧셈 결과는 " + (firstInt + secondInt) + "입니다.");
        }
        else if (Objects.equals(operatorSymbol, "-")) {
            System.out.println("두 정수의 뺄셈 결과는 " + (firstInt - secondInt) + "입니다.");
        }
        else if (Objects.equals(operatorSymbol, "*")) {
            System.out.println("두 정수의 곱셈 결과는 " + (firstInt * secondInt) + "입니다.");
        }
        else if (Objects.equals(operatorSymbol, "/")) {
            System.out.println("두 정수의 나눗셈 결과는 " + (firstInt / secondInt) + "입니다.");
        }
        else if (Objects.equals(operatorSymbol, "%")) {
            System.out.println("두 정수의 몫 결과는 " + (firstInt % secondInt) + "입니다.");
        }
        else {
            System.out.println("잘못된 접근입니다.");
        }
    }
}
