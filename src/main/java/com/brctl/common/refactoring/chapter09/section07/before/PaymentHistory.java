package com.brctl.common.refactoring.chapter09.section07.before;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public class PaymentHistory {

    private int weeksDelinquentInLastYear;

    private PaymentHistory() {

    }

    private PaymentHistory(int weeksDelingquentInLastYear) {
        this.weeksDelinquentInLastYear = weeksDelingquentInLastYear;
    }

    public int getWeeksDelinquentInLastYear() {
        return weeksDelinquentInLastYear;
    }

    static PaymentHistory basicHistory() {
        return new PaymentHistory(500);
    }
}
