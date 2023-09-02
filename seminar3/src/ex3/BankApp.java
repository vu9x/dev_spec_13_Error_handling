package ex3;

public class BankApp {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();

        try {
            acc1 = new Account(11111, 900);
            System.out.println(acc1);
            acc2 = new Account(22222, 500);
            System.out.println(acc2);
            acc3 = new Account(333333, -1);
            System.out.println(acc3);
        } catch ( NegativeAmountException e){
            System.out.println(e.getMessage());
        }

        try{
            acc1.deposit(-40);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try{
            acc1.deposit(40);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try{
            acc1.withdraw(-40);
        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try{
            acc1.withdraw(-40000);
        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    }
}

