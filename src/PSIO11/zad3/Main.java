package PSIO11.zad3;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(800);

        System.out.println(bankAccount.getBalance() + "\n");

        try {
            bankAccount.performWithdraw(1000); // Insufficient funds
        } catch (IncorrectAmountException | InsufficientFundsException e) {
            System.out.println("EXCEPTION in main!\n");
        }

        try {
            bankAccount.performWithdraw(500); // No exception
        } catch (IncorrectAmountException | InsufficientFundsException e) {
            System.out.println("EXCEPTION in main!");
        }
    }
}
