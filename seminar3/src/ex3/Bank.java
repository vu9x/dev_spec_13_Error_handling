package ex3;

import java.util.HashSet;

public class Bank {
    HashSet<Account> accounts = new HashSet<>();

    void addAccount(Account account) {
        this.accounts.add(account);
    }

}
