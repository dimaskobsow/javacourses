package Lesson8;

public class BankAccount {
    int idAccount;
    int countMoney;

    public BankAccount() {}

    BankAccount(int id, int acm) {
        idAccount = id;
        countMoney = acm;
        System.out.println("Создался банковский аакаунт " + id + " " + countMoney );
    }
}
