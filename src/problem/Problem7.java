package problem;

public class Problem7 {
    public static void main(String[] args) {
        // 문자열을 배열에 넣고, 아래 조건에 따라 결과문을 출력
        // i의 문자열이 몇 개 들어가 있는지, i가 어디의 인덱스에 위치해 있는지
        // 문자열: application / 문자: i / i가 존재하는 위치: 4, 8 / i 개수: 2
        String[] myArray = {"a", "p", "p", "l", "i", "c", "a", "t", "i", "o", "n"};
        int j = 0;
        for(int i = 0; i < 11; i++) {
            if(myArray[i] == "i") {
                j++;
                System.out.println("문자 i는 " + i + " 번째 인덱스에 위치해 있습니다.");
            }
        }
        System.out.println("문자 i의 총합은 " + j + " 개입니다.");
    }
}
