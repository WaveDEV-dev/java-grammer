package problem8;

public class Main {
    public static void main(String[] args) {
        FindEven even = new FindEven();
        int[] myArray = {2, 2, 4, 4, 6, 6, 8, 8};

        int result = 0;
        result = even.findEvenWithWhile(myArray);
        System.out.println(result);
    }
}
