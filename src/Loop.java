// 루프 연습
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        for(int i = 0; i <= 5; i++) {
//            System.out.println(i);
//        }

//        while(true) {
//            System.out.print("참입니다.");
//        }

//        int i = 0;

//        while(i <= 5) {
//            System.out.println(i);
//            i++;
//        }

//        for(int i = 1; i <= 9; i++) {
//            System.out.println("2 x " + i + " = " + i * 2);
//        }

//        for(int i = 1; i <= 9; i++) {
//            for(int j = 1; j <= 9; j++) {
//                System.out.println(i + " x " + j + " = " + i * j);
//            }
//        }

//        for(int i = 9; i >= 1; i--) {
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 9; i++) {
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        int i = 0;
////
////        while(i <= 8) {
////            i += 1;
////            System.out.println("2 x " + i + " = " + i * 2);
////        }

//        int i = 1;
//        int j = 1;
//
//        while(i <= 8) {
//            i++;
//            while (j <= 8) {
//                j++;
//                System.out.println(i + " x " + j + " = " + i * j);
//            }
//            j = 1;
//        }

//        int i = 1;
//        int j = 1;
//
//        while(i <=9) {
//
//            i++;
//            while (j <= i) {
//                j++;
//                System.out.print("*");
//            }
//            System.out.println("");
//            j = 1;
//        }

        while(true) {
            Scanner scanner = new Scanner(System.in);
            char charFromScanner = scanner.next().charAt(0);
            if(charFromScanner == 'i') {
                break;
            }
        }
    }
}
