public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println();
        System.out.println(a % b);
        System.out.println(a ^ b);
        System.out.println();
        System.out.println(a += 10);
        System.out.println(a -= 10);
        System.out.println(a *= 10);
        System.out.println(a /= 10);
        System.out.println(a %= 10);
        System.out.println();
        System.out.println();
        System.out.println(b);
        System.out.println("b"+ b++);
        System.out.println(b);
        System.out.println("b"+ b--);
        System.out.println(b);

        System.out.println("b"+ ++b);
        System.out.println(b);
        System.out.println("b"+ --b);
        System.out.println(b);
    }
}
