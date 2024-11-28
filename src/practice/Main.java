package practice;

public class Main {
    public static void main(String[] args) {
        Car car2 = new Car("폭스바겐", 200);
        Car car3 = new Car("크라이슬러", 150);
        car2.go();
        car3.go();
        car2.alert(); // 200 alert 폭스바겐
        car2.accelerate(100);
        car2.alert(); // 300 alert 폭스바겐
        car3.accelerate(100);
        car3.alert(); // 250 alert 크라이슬러

        BankAccount account = new BankAccount("1", "WaveDEV");
        account.deposit(10000);
        account.withdraw(1000);
        account.check();

        account.withdraw(2000);
        account.check();
    }
}
