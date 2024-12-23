package problem;

import java.sql.SQLOutput;

public class Problem8 {
    public static int findEvenWithForArrayLoop(int[] find) {
        int result = 0;
        for(int number : find){
            if(number % 2 == 0) {
                result++;
            }
        }
        return result;
    }
    public static int findEvenWithFor(int[] find) {
        int result = 0;
        for(int arrayInt = 0; arrayInt < find.length; arrayInt++){
            if(find[arrayInt] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int findEvenWithWhile(int[] find) {
        int arrayInt = 0;
        int result = 0;
        while(arrayInt < find.length) {

            if(find[arrayInt] % 2 == 0) {
                result++;
            }

            arrayInt++;
        }
        return result;
    }
    public static void main(String[] args) {
        // 배열에서 짝수의 개수 찾기
        // 배열 {1, 2, 3, 4, 5, 6, 8, 9}가 주어졌다면, 짝수는 2, 4, 6, 8로 총 4개
        int[] myArray = {2, 2, 4, 4, 6, 6, 7, 8, -2};
//        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] myArray = {2, 4, 6, 8, 10, 12};
//        int[] myArray = {1, 3, 5, 7, 9};
//        int[] myArray = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
//        int[] myArray = {2, 2, 4, 4, 6, 6, 8, 8};

        int result = 0;

//        result = findEvenWithForArrayLoop(myArray);
//        result = findEvenWithFor(myArray);
        result = findEvenWithWhile(myArray);


        System.out.println("짝수의 총합은 " + result + "개입니다.");
    }
}
