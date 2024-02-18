package com.viktoria.cs.lesson4.task1;

public class Main {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(0, 5, 1);
        cashMachine.acceptingBanknotes(cashMachine);
        cashMachine.withdrawals(140);
    }
}