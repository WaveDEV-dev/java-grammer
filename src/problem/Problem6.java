package problem;

import java.time.LocalTime;

public class Problem6 {
    public static void main(String[] args) {
        LocalTime appointmentTime = LocalTime.now();
        System.out.println("약속 시간: " + appointmentTime);

        LocalTime appointmentTimeBefore = appointmentTime.plusMinutes(-45);
        System.out.println("약속 시간으로부터 45분 전: " + appointmentTimeBefore);
    }
}
