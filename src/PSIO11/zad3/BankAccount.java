package PSIO11.zad3;

import java.util.Stack;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    private void withdraw(double amount) throws IncorrectAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new IncorrectAmountException("Kwota wypłaty musi być dodatnia!");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Brak wystarczających środków aby dokonać wypłaty!\nStan konta: " + this.balance + "PLN");
        }

        balance -= amount;
        System.out.println("Wypłacono " + amount + "PLN\nStan konta: " + this.balance + "PLN");
    }

    public void performWithdraw(double amount) throws IncorrectAmountException, InsufficientFundsException {
        try {
            withdraw(amount);
        } catch (IncorrectAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public String getBalance() {
        return "Stan konta: " + this.balance + "PLN";
    }

}
