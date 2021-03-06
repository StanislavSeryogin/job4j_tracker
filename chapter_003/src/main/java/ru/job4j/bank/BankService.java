package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(pass -> pass.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> account = Optional.empty();
        if (user.isPresent()) {
            account = users.get(user.get()).stream()
                    .filter(req -> req.getRequisite().equals(requisite))
                    .findFirst();
        }
        return account;
    }

    public void transferMoney(String srcPassport, String srcRequisite,
                              String destPassport, String destRequisite, double amount) {
        Optional<Account> sender = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> recipient = findByRequisite(destPassport, destRequisite);
        if (sender.isPresent() && recipient.isPresent() && (sender.get().getBalance() >= amount)) {
            recipient.get().setBalance(recipient.get().getBalance() + amount);
            sender.get().setBalance(sender.get().getBalance() - amount);
        }
    }
}
