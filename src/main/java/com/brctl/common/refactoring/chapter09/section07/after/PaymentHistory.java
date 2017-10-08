package com.brctl.common.refactoring.chapter09.section07.after;

/**
 * @author duanxiaoxing
 * @created 2017/10/8
 */
public class PaymentHistory {

    private int weeksDelinquentInLastYear;

    protected PaymentHistory() {

    }

    protected PaymentHistory(int weeksDelingquentInLastYear) {
        this.weeksDelinquentInLastYear = weeksDelingquentInLastYear;
    }

    public int getWeeksDelinquentInLastYear() {
        return weeksDelinquentInLastYear;
    }

    static PaymentHistory basicHistory() {
        return new PaymentHistory(500);
    }

    /**
     * prefer singleton
     * {@link NullCustomer#singleton}
     * @return NullPaymentHistory
     */
    static PaymentHistory nullPaymentHistory() {
        return new NullPaymentHistory();
    }

}
