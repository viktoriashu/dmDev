package com.viktoria.cs.lesson2.cycles;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию
 * Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Task3 {

    public static final int SALARY_INCREASE = 400; // повышение зп
    public static final double BROKER = 0.1; //отстегивает брокеру
    public static final double SHARES = 1.02;  //доходность с акций 2% в месяц.
    private static final int YEAR = 3;
    private static final int MONTH = 2;
    private static final int NEEDS = 300;
    public static final int CONVENT = 12;


    public static void main(String[] args) {

        int pay = 600;  //зп

        int months = conventMonth(YEAR, MONTH);

        System.out.println("Суммарная зп составила: " + sumPay(pay, months, SALARY_INCREASE));
        System.out.println("Суммарне расходы составили: " + sumNeeds(NEEDS, months));
        System.out.println("Сумма на банковском счету составила: " + bankAccount(months, pay, NEEDS, SALARY_INCREASE));
        System.out.println("Сумма на брокерском счету составила: "
                + brokerageAccount(pay, months, SALARY_INCREASE, BROKER, SHARES));

    }

    private static int conventMonth(int year, int month) {
        return (year * CONVENT) + month;
    }

    private static int bankAccount(int months, int pay, int needs, int salaryIncrease) {
        int sumPay = sumPay(pay, months, salaryIncrease);
        int sumNeeds = sumNeeds(needs, months);
        return sumPay - sumNeeds;
    }

    //Это все заработанные денежки
    private static int sumPay(int pay, int months, int salaryIncrease) {
        int sumPay = 0;
        for (int i = 1; i <= months; i++) {
            if (i % 6 == 0) {
                sumPay = sumPay + pay;
                pay = pay + salaryIncrease;
            } else {
                sumPay = sumPay + pay;
            }
        }
        return sumPay;
    }

    //Это все потраченные денежки
    private static int sumNeeds(int needs, int months) {
        int sumNeeds = 0;
        for (int i = 1; i <= months; i++) {
            sumNeeds = needs * months;
        }
        return sumNeeds;
    }

    private static double brokerageAccount(int pay, int months, int salaryIncrease, double broker, double shares) {
        double brokeragePay = 0;
        double stockReturn = 0;
        for (int i = 2; i <= months; i++) {
            if (i % 6 == 0) {
                brokeragePay = pay * broker;
                pay = pay + salaryIncrease;
                stockReturn = (stockReturn + brokeragePay) * shares;
            } else {
                brokeragePay = pay * broker;
                stockReturn = (stockReturn + brokeragePay) * shares;
            }
        }
        return Math.round(stockReturn * 100) / 100.0;
    }
}