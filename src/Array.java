// 배열 연습
public class Array {
    public static void main(String[] args) {

        // 역순 출력
//        for(int i = 4; i >= 0; i--) {
//            System.out.println(myArray2[i]);
//        }

        // 배열 선언
        String[] myArray2 = {"알파", "베타", "감마", "델타", "엡실론"};

        // 배열을 순서대로 출력
        for(int i = 0; i < 5; i++) {
            System.out.print(myArray2[i] + " ");
        }
        System.out.println();

        // 배열을 역순으로 출력
        String[] myArray4 = myArray2.clone();
        for(int i = 0; i < 5; i++) {
            myArray2[i] = myArray4[4 - i];
        }

        for(int i = 0; i < 5; i++) {
            System.out.print(myArray2[i] + " ");
        }

        // 배열의 길이
        System.out.println("배열의 길이 : "+myArray2.length);
    }
}
