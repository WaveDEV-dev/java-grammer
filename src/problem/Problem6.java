package problem;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        // 클래스 선언
        Problem6 problem = new Problem6();

        // 변수 선언
        String result = "";
        int hour = 0;
        int minute = 0;

        //
        result = problem.printAppointmentTime(hour, minute);
        System.out.println(result);
    }
    public String printAppointmentTime(int hour, int minute) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시간을 입력해주세요. (HH:mm 형식으로 입력): ");
        String[] timeInput = sc.nextLine().split(":");

        hour = Integer.parseInt(timeInput[0]);
        minute = Integer.parseInt(timeInput[1]);

        minute -= 45;

        if (minute < 0) {
            minute += 60;
            hour -= 1;
        }

        if (hour < 0) {
            hour += 24;
        }

        return String.format("약속 시간: %02d:%02d\n", hour, minute);
    }
}
