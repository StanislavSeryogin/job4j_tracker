package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());

    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            this.users.get(user).add(account);
        }

    }

    public User findByPassport(String passport) {
        User user = null;
        for (User person: users.keySet()) {
            user = person;
            break;
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = this.findByPassport(passport);
        List<Account> accounts = user != null ? this.users.get(user) : Collections.emptyList();
        for (Account accountBank: accounts) {
            if (accountBank.getRequisite().equals(requisite)) {
                account = accountBank;
                break;
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean conf = false;
        User sender = findByPassport(srcPassport);
        User recipient = findByPassport(destPassport);
        if (sender != null && recipient != null) {
            int srcAccount = users.get(sender).indexOf(findByRequisite(srcPassport, srcRequisite));
            int destAccount = users.get(recipient).indexOf(findByRequisite(destPassport, dеstRequisite));
            if (srcAccount != -1 && destAccount != -1) {
                if (users.get(sender).get(srcAccount).getBalance() >= amount) {
                    double balance = users.get(sender).get(srcAccount).getBalance() - amount;
                    users.get(sender).get(srcAccount).setBalance(balance);
                    balance = users.get(recipient).get(destAccount).getBalance() + amount;
                    users.get(recipient).get(destAccount).setBalance(balance);
                    conf = true;
                }
            }
        }
        return conf;
    }
}
