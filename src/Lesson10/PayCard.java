package Lesson10;

import javax.annotation.processing.Generated;


public class PayCard {
    String cardNumber;
    String cardHolder;
    int balance;

    public PayCard() {
    }

    public PayCard(String cardNumber, String cardHolder, int balance) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "PayCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
