// 논리 연산자 연습
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a > b);
        System.out.println(a < b);

        System.out.println(a > b && a < b);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(a > b || a < b);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(true && (true || false));
        System.out.println((true && true) || (true && false));

        // 삼항 연산자 연습

        System.out.println(a-- == 10 ? "10과 같음" : "10과 다름");
        System.out.println(a++ == 10 ? "10과 같음" : "10과 다름");
        System.out.println(++a == 10 ? "10과 같음" : "10과 다름");
        System.out.println(a-- == 10 ? "10과 같음" : "10과 다름");
        System.out.println(++a == 10 ? "10과 같음" : "10과 다름");
        System.out.println(--a == 10 ? "10과 같음" : "10과 다름");
        System.out.println(a++ == 10 ? "10과 같음" : "10과 다름");

        System.out.println(a == 10 ? a++ : a-- );
        System.out.println(a == 10 ? a++ : a-- );
        System.out.println(a == 10 ? a++ : a-- );
        System.out.println(a == 10 ? a++ : a-- );
        System.out.println(a);

    }
}
