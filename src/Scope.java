public class Scope {

    static int number = 10;
    public static void printNumber() {
        System.out.println(number);
    }
    public static void main(String[] args) {
        int number = 20;
        System.out.println(number);
    }
}
