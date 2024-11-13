package problem;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        int firstInt;
        int secondInt;

        Scanner sc = new Scanner(System.in);
        System.out.println("계산에 사용될 첫 번째 정수를 입력하세요.");
        firstInt = Integer.parseInt(sc.next());

        System.out.println("계산에 사용될 두 번째 정수를 입력하세요.");
        secondInt = Integer.parseInt(sc.next());

        System.out.println(firstInt + " + " + secondInt + "(은)는 " + (firstInt + secondInt) + " 입니다.");
        System.out.println(firstInt + " - " + secondInt + "(은)는 " + (firstInt - secondInt) + " 입니다.");
        System.out.println(firstInt + " * " + secondInt + "(은)는 " + (firstInt * secondInt) + " 입니다.");
        System.out.println(firstInt + " / " + secondInt + "(은)는 " + (firstInt / secondInt) + " 입니다.");
        System.out.println(firstInt + " % " + secondInt + "(은)는 " + (firstInt % secondInt) + " 입니다.");
        System.out.println(firstInt + " ^ " + secondInt + "(은)는 " + (firstInt ^ secondInt) + " 입니다.");
    }
}
