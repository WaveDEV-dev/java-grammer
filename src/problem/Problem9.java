package problem;

import problem8.FindEven;

public class Problem9 {

    // 1. 홀수 개수 출력하기
    // 2. MergeArray를 호출하여 문제 해결하게 수정하기

    public static void main(String[] args) {
        // 두 개의 정수 배열 arr1과 arr2가 주어집니다.
        // 두 배열을 하나의 배열로 합치고 배열의 짝수와 홀수 개수를 찾아주세요.
        // input :
//        arr1 = [1, 4, 7, 2]
//        arr2 = [5, 8, 3, 6]

        // output :
//        배열 분석 결과:
//        짝수의 개수: 4
//        홀수의 개수: 4

        int[] arr1 = {1, 4, 7, 2};
        int[] arr2 = {5, 8, 3, 6};

        // 1. 배열 2개의 길이만큼의 새 배열 선언
        int[] arr3 = new int[arr1.length + arr2.length];

        // 2. 배열 1번의 값을 넣음
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            System.out.println(arr3[i]);
        }

        // 3. 배열 2번의 값을 그 뒤로 넣음
        for(int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
            System.out.println(arr3[i]);
        }

        FindEven finder = new FindEven();
        int result = finder.findEvenWithForArrayLoop(arr3);
        System.out.println("짝수의 개수 : " + result);

    }
}
