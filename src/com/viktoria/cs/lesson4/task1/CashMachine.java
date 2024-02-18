package com.viktoria.cs.lesson4.task1;

import java.util.Objects;

public class CashMachine {
    private final static int TEN = 10;
    private final static int TWENTY = 20;
    private final static int FIFTY = 50;
    private int money10;
    private int money20;
    private int money50;

    private int repository = 0;
    private int repositoryMoney10 = 0;
    private int repositoryMoney20 = 0;
    private int repositoryMoney50 = 0;


    public CashMachine(int money10, int money20, int money50) {
        this.money10 = money10;
        this.money20 = money20;
        this.money50 = money50;
    }


    private int acceptingBanknotes10(CashMachine cashMachine) {
        this.repositoryMoney10 = repositoryMoney10 + getMoney10();
        return repositoryMoney10;
    }

    private int acceptingBanknotes20(CashMachine cashMachine) {
        this.repositoryMoney20 = repositoryMoney20 + getMoney20();
        return repositoryMoney20;
    }

    private int acceptingBanknotes50(CashMachine cashMachine) {
        this.repositoryMoney50 = repositoryMoney50 + getMoney50();
        return repositoryMoney50;
    }

    private int getRepository(int i) {
        this.repository = repository + entryIntoRepository(i);
        return repository;
    }

    //это метод для внесения денег
    public void acceptingBanknotes(CashMachine cashMachine) {

        int value = 0;
        value = acceptingBanknotes10(cashMachine) * TEN;
        value = value + acceptingBanknotes20(cashMachine) * TWENTY;
        value = value + acceptingBanknotes50(cashMachine) * FIFTY;
        getRepository(entryIntoRepository(value));
    }


    //это метод для хранилища
    private int entryIntoRepository(int depositedBanknotes) {
        //деньги, которые изначально лежат в хранилище
        int repositoryValue = repository;
        repositoryValue = repositoryValue + depositedBanknotes;
        return repositoryValue;
    }


    //метод для расчета, какими купюрами будет выдана запрашиваемая сумма
    private int withdrawalCalculation(int moneyToWithdraw) {
        if (moneyToWithdraw / FIFTY <= repositoryMoney50) {
            this.money50 = moneyToWithdraw / FIFTY;
        } else {
            this.money50 = repositoryMoney50;
            moneyToWithdraw = moneyToWithdraw - (money50 * FIFTY);
        }
        if (moneyToWithdraw / TWENTY <= repositoryMoney20) {
            this.money20 = moneyToWithdraw / TWENTY;
            moneyToWithdraw = moneyToWithdraw - (money20 * TWENTY);
        } else {
            this.money20 = repositoryMoney20;
            moneyToWithdraw = moneyToWithdraw - (money20 * TWENTY);
        }
        if (moneyToWithdraw / TEN <= repositoryMoney10) {
            this.money10 = moneyToWithdraw % (this.money50) % (TWENTY * this.money20) / TEN;
        }
        if (moneyToWithdraw == 0) {
            System.out.println("Выдано: " + "\n" + "Купюр номиналом " + FIFTY + ": " + money50 + "." + "\n" +
                    "Купюр номиналом " + TWENTY + ": " + money20 + "." + "\n" +
                    "Купюр номиналом " + TEN + ": " + money10 + ".");
        }
        return moneyToWithdraw;
    }


    //метод для снятия денег
    public boolean withdrawals(int moneyToWithdraw) {
        if (moneyToWithdraw % 10 == 0 && moneyToWithdraw <= repository) {
            if (withdrawalCalculation(moneyToWithdraw) == 0) {
                return true;
            }
        }
        System.out.println("Введите другую сумму.");
        return false;
    }


    private int getMoney10() {
        return money10;
    }

    private int getMoney20() {
        return money20;
    }

    private int getMoney50() {
        return money50;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "money10=" + money10 +
                ", money20=" + money20 +
                ", money50=" + money50 +
                ", repository=" + repository +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CashMachine that = (CashMachine) o;
        return money10 == that.money10 && money20 == that.money20 && money50 == that.money50 && repository == that.repository;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money10, money20, money50, repository);
    }
}