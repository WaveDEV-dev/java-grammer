package problem;

public class Problem4 {
    public static void main(String[] args) {
        int x = -1;
        int y = 1;

        if(x > 0) {
            if (y > 0) {
                System.out.println("제1사분면에 속함");
                return;
            }
            else {
                System.out.println("제4사분면에 속함");
                return;
            }
        }
        if(x < 0) {
            if (y > 0) {
                System.out.println("제2사분면에 속함");
                return;
            } else {
                System.out.println("제3사분면에 속함");
                return;
            }
        }
    }
}
