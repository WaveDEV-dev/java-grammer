package practice;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private int balance;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance = amount + balance;
        System.out.println(amount + " 만큼의 금액이 입금되었습니다.");
    }

    public void withdraw(int amount) {
        if(balance - amount < 0) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance = balance - amount;
        System.out.println(amount + " 만큼의 금액이 출금되었습니다.");
    }

    public void check() {
        System.out.println("현재 잔액은 " + balance + " 원 입니다.");
    }
}
